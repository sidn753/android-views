package sample.eftimoff.com.sampleapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

public class EditDialogFragment extends DialogFragment {

    private String mPositive;
    private String mNegative;
    private DialogInterface.OnClickListener mPositiveOnClickListener;
    private DialogInterface.OnClickListener mNegativeOnClickListener;

    public EditDialogFragment() {
    }


    public static class Builder {

        private String mPositive;
        private String mNegative;
        private DialogInterface.OnClickListener mPositiveOnClickListener;
        private DialogInterface.OnClickListener mNegativeOnClickListener;


        public Builder positive(final String positive) {
            mPositive = positive;
            return this;
        }

        public Builder negative(final String negative) {
            mNegative = negative;
            return this;
        }

        public Builder positiveClickListener(final DialogInterface.OnClickListener clickListener) {
            mPositiveOnClickListener = clickListener;
            return this;
        }

        public Builder negativeClickListener(final DialogInterface.OnClickListener clickListener) {
            mNegativeOnClickListener = clickListener;
            return this;
        }

        public EditDialogFragment build() {
            final EditDialogFragment editDialogFragment = new EditDialogFragment();
            editDialogFragment.mPositive = this.mPositive;
            editDialogFragment.mNegative = this.mNegative;
            editDialogFragment.mPositiveOnClickListener = this.mPositiveOnClickListener;
            editDialogFragment.mNegativeOnClickListener = this.mNegativeOnClickListener;
            return editDialogFragment;
        }

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        final LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_edit_fragment, null))
                // Add action buttons
                .setPositiveButton(mPositive, mPositiveOnClickListener)
                .setNegativeButton(mNegative, mNegativeOnClickListener);
        return builder.create();
    }
}
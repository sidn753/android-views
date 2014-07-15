android-views
=============

![Alt text](https://github.com/geftimov/android-views/blob/master/pictures/edit-dialog-fragment/edit-dialog-fragment.png?raw=true)

How to use
=============

```
        EditDialogFragment editDialogFragment = new EditDialogFragment.Builder().
            positive("ok").
            negative("negative").
            build();
        
        editDialogFragment.show(getFragmentManager(),"tag");
```


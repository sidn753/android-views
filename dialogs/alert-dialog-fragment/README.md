android-views
=============

![Alt text](https://github.com/geftimov/android-views/blob/master/pictures/alert-dialog-fragment/alert-dialog-fragment.png?raw=true)

How to use
=============

```
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment.Builder().
            message("what").
            positive("ok").
            negative("negative").
            build();
        
        alertDialogFragment.show(getFragmentManager(),"tag");
```


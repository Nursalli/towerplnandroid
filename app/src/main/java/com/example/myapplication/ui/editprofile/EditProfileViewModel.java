package com.example.myapplication.ui.editprofile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EditProfileViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
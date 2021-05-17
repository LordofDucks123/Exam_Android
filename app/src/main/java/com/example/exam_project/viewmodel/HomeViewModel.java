package com.example.exam_project.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to my Application. Feel free to browse in the navigationbar on the top left corner to try the features in here!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
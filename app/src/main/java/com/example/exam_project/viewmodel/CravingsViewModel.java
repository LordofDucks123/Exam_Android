package com.example.exam_project.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.exam_project.model.Craving;
import com.example.exam_project.model.repositories.CravingRepository;

import java.util.List;

public class CravingsViewModel extends ViewModel {

    CravingRepository repository = new CravingRepository();


    public LiveData<List<Craving>> getAllCravings() {

        return repository.getAllCravings();
    }


}


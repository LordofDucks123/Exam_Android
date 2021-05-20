package com.example.exam_project.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.exam_project.model.Health;
import com.example.exam_project.model.repositories.HealthRepository;

import java.util.List;

public class HealthViewModel extends ViewModel {

    HealthRepository repository = new HealthRepository();

    public LiveData<List<Health>> getSearchedHealth() {

        return repository.getSearchedHealth();
    }
}
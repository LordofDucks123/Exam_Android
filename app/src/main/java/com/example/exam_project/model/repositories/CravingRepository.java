package com.example.exam_project.model.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.exam_project.R;
import com.example.exam_project.model.Craving;
import com.example.exam_project.model.Health;

import java.util.ArrayList;
import java.util.List;

public class CravingRepository {

    private ArrayList<Craving> cravingList = new ArrayList<>();
    private final MutableLiveData<List<Craving>> Cravings = new MutableLiveData<>();


    public CravingRepository() {

        cravingList.add(new Craving("Drinking Coffee", R.drawable.cp1));
        cravingList.add(new Craving("Getting a Beer", R.drawable.cp2));
        cravingList.add(new Craving("Taking a Walk", R.drawable.cp3));
        cravingList.add(new Craving("Enjoying the Sun", R.drawable.cp4));
        cravingList.add(new Craving("Having a good time with friends", R.drawable.cp5));
        cravingList.add(new Craving("Feeling Happy", R.drawable.cp8));
        cravingList.add(new Craving("Just finished eating", R.drawable.cp10));
        cravingList.add(new Craving("Break at work", R.drawable.cp11));
        cravingList.add(new Craving("Are u Bored?", R.drawable.cp12));
        cravingList.add(new Craving("Just had Sex", R.drawable.cp6));
        cravingList.add(new Craving("Feeling stressed?", R.drawable.cp7));
        cravingList.add(new Craving("Feeling Sad", R.drawable.cp9));

        Cravings.setValue(cravingList);
    }

    public LiveData<List<Craving>> getAllCravings() {

    return Cravings;

    }
}

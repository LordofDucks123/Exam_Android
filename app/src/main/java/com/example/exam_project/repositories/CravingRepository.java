package com.example.exam_project.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.exam_project.R;
import com.example.exam_project.model.Craving;
import java.util.ArrayList;
import java.util.List;

public class CravingRepository {
    private final List<Craving> cravingList;
    private final MutableLiveData<List<Craving>> searchedCraving = new MutableLiveData<>();

    public CravingRepository() {

        cravingList = new ArrayList<>();
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

        searchedCraving.setValue(cravingList);
    }
    public void searchCraving(String query){
        List<Craving> result = new ArrayList<>();
        for (Craving c : cravingList) {
            if (c.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(c);
            }
        }
        searchedCraving.setValue(result);
    }

    public LiveData<List<Craving>> getSearchedCraving() {
        return searchedCraving;
    }
}

package com.example.exam_project.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.exam_project.R;
import com.example.exam_project.model.Health;

import java.util.ArrayList;
import java.util.List;

public class HealthRepository {

    private final List<Health> healthList;
    private final MutableLiveData<List<Health>> searchedHealth = new MutableLiveData<>();
    public HealthRepository() {

        healthList = new ArrayList<>();
        healthList.add(new Health("Blood pressure decreases", R.drawable.hp1));
        healthList.add(new Health("Decreased lung regeneration", R.drawable.hp2));
        healthList.add(new Health("Smelling senses gets worse", R.drawable.hp3));
        healthList.add(new Health("Tasting senses gets worse", R.drawable.hp4));
        healthList.add(new Health("Blood Circulation become worse", R.drawable.hp5));
        healthList.add(new Health("Skin looks less healthier", R.drawable.hp6));
        healthList.add(new Health("Coughing", R.drawable.hp7));
        healthList.add(new Health("Shortness of breath will increase", R.drawable.hp8));
        healthList.add(new Health("Increased chance of lung cancer", R.drawable.hp9));
        healthList.add(new Health("Increase in Heart diseases", R.drawable.hp10));


        searchedHealth.setValue(healthList);
    }
    public void searchHealth(String query){
        List<Health> result = new ArrayList<>();
        for (Health h : healthList) {
            if (h.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(h);
            }
        }
        searchedHealth.setValue(result);
    }

    public LiveData<List<Health>> getSearchedHealth() {
        return searchedHealth;
    }
}

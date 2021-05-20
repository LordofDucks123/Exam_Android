package com.example.exam_project.view.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_project.Adapters.CravingAdapter;
import com.example.exam_project.R;
import com.example.exam_project.model.Craving;
import com.example.exam_project.viewmodel.CravingsViewModel;

import java.util.List;

public class CravingsFragment extends Fragment implements CravingAdapter.OnListItemClickListener {

    CravingsViewModel viewModel;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cravings, container, false);
        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        CravingAdapter adapter = new CravingAdapter(this);
        recyclerView.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(CravingsViewModel.class);
        viewModel.getAllCravings().observe(getViewLifecycleOwner(),adapter::updateList);

        return view;

    }

    public void onListItemClick(int clickedItemIndex) {
        int cravingNumber = clickedItemIndex + 1;
        switch (cravingNumber) {
            case 1:
                Toast.makeText(getActivity(), "Whistle or hum for a while!: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(getActivity(), "Drink a glass of water. It's surprising how well this works: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(getActivity(), "Do three sets of ten jumping jacks: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(getActivity(), "Create your own list of craving-buster activities: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 5:
                Toast.makeText(getActivity(), "Tell your friend that you want a smoke, and let them help you!: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 6:
                Toast.makeText(getActivity(), "GREAT! Write a list of things you are grateful for: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 7:
                Toast.makeText(getActivity(), "Floss and brush your teeth, then take a gum: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 8:
                Toast.makeText(getActivity(), "Slather on rich, creamy hand lotion and rub, rub, rub! It keeps fingers busy and reminds you how nice it is that they don't smell like tobacco: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 9:
                Toast.makeText(getActivity(), "Keep your hands busy! Scrub the floor, do the laundry etc.: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 10:
                Toast.makeText(getActivity(), "Make a to-do list for the week ahead: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 11:
                Toast.makeText(getActivity(), "Write a goodbye letter to cigarettes: " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
            case 12:
                Toast.makeText(getActivity(), "Crank up the radio and sing at the top of your lungs (works great while driving): " + cravingNumber, Toast.LENGTH_LONG).show();
                break;
        }
    }
}

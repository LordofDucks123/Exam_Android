package com.example.exam_project.view.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_project.Adapters.HealthAdapter;
import com.example.exam_project.R;
import com.example.exam_project.viewmodel.HealthViewModel;

public class HealthFragment extends Fragment implements HealthAdapter.OnListItemClickListener {

    HealthViewModel viewModel;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health, container, false);
        recyclerView = view.findViewById(R.id.rvh);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        HealthAdapter adapter = new HealthAdapter(this);
        recyclerView.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(HealthViewModel.class);
        viewModel.getSearchedHealth().observe(getViewLifecycleOwner(), adapter::updateList);

        return view;
    }

    public void onListItemClick(int clickedItemIndex) {
        int healthNumber = clickedItemIndex + 1;
        switch (healthNumber) {
            case 1:
                Toast.makeText(getActivity(), "Smoking increases your vascular resistance which increases the risk of suffering heart attack: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(getActivity(), "The lungs begin to regenerate and cleanse out substances like carbon monoxide: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(getActivity(), "Smoking destroys the smelling receptors : " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 4:
                Toast.makeText(getActivity(), "Smoking destroys the taste receptors: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 5:
                Toast.makeText(getActivity(), "Blood circulation becomes worse due to reducing adequate blood supply to the limbs: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 6:
                Toast.makeText(getActivity(), "Duo to bad blood circulation and regeneration the skin looks worse: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 7:
                Toast.makeText(getActivity(), "When you smoke, the cilia lose some of their ability to push chemicals and other foreign materials out of your lungs: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 8:
                Toast.makeText(getActivity(), "chronic obstructive pulmonary disease leads to shortness of breath: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 9:
                Toast.makeText(getActivity(), "When you breathe in tobacco smoke, thousands of chemicals enter your lungs. Many of these chemicals have the potential to damage the DNA in your lung cells: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
            case 10:
                Toast.makeText(getActivity(), "When the chemicals in cigarette smoke cause atherosclerosis and thickened blood in the arteries, it becomes more difficult for blood cells to move through arteries and other blood vessels to get to vital organs like the heart and brain: " + healthNumber, Toast.LENGTH_LONG).show();
                break;
        }
    }
}
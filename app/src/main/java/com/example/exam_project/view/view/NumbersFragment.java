package com.example.exam_project.view.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.exam_project.R;

public class NumbersFragment extends Fragment {

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private TextView calv_result;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numbers, container, false);

        input1 = view.findViewById(R.id.input1);
        input2 = view.findViewById(R.id.input2);
        input3 = view.findViewById(R.id.input3);
        calv_result = view.findViewById(R.id.calv_result);
        Button bt_calculate = view.findViewById(R.id.bt_calculate);

        bt_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                makeCalculations();
            }
        });
        return view;
    }

    private void makeCalculations() {

        double i1 = Double.parseDouble(input1.getText().toString());
        double i2 = Double.parseDouble(input2.getText().toString());
        double i3 = Double.parseDouble(input3.getText().toString());
        double result = i1 / 20 * i2 * i3;

        calv_result.setText("You have saved: " + result + " Crowns! Congratulations!");
    }

}

package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidhello.databinding.ActivityGradesBinding;

public class GradesActivity extends AppCompatActivity {

    ActivityGradesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGradesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float a;
                String textA = binding.etGrades.getText().toString();

                a = Float.parseFloat(textA);

                SolveGrade((float) a);
            }
        });
    }



    void SolveGrade (float a) {
        if (a>=0) {
            if (a < 1) {
                binding.tvGrades.setText("F");
            } else if (a < 2) {
                binding.tvGrades.setText("D");
            } else if (a < 3) {
                binding.tvGrades.setText("C");
            }else if (a < 4) {
                binding.tvGrades.setText("B");
            }else if (a == 4) {
                binding.tvGrades.setText("A");
            }else{
                binding.tvGrades.setText("error");
            }
        }else {
            binding.tvGrades.setText("error");
        }
    }


}

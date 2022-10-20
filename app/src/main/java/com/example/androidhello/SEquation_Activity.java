package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidhello.databinding.ActivitySequationBinding;

public class SEquation_Activity extends AppCompatActivity {

    ActivitySequationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    binding = ActivitySequationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.btCalculate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int a, b;

            String TextA = binding.etNumA.getText().toString();
            String TextB = binding.etNumB.getText().toString();

            a = Integer.parseInt(TextA);
            b = Integer.parseInt(TextB);

            SolveSequation(a, b);

        }
    });

    }

    void SolveSequation (int a, int b) {
        if (a != 0 ) {
            float Result = (float) -b / a;
            binding.tvAnswer.setText(String.valueOf(Result));

        }else {
                if(b==0) {
                    binding.tvAnswer.setText("Vo so nghiem");
                }else {
                    binding.tvAnswer.setText("Vo nghiem");
                }

            }
        }

    }

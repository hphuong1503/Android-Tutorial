package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidhello.databinding.ActivityGradesBinding;
import com.example.androidhello.databinding.ActivityPrimeBinding;

public class PrimeActivity extends AppCompatActivity {

    ActivityPrimeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPrimeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a;
                String textA = binding.etInput.getText().toString();

                a = Integer.parseInt(textA);
                binding.tvResult.setText(a+"is prime?:"+ PrimeLoop(a));
            }
        });
    }

        boolean PrimeLoop(int a) {

        for (int n = 2;  n < a ; n++ ) {

            if (a % n == 0 ){
                return false;

            }
        } return true;

}}


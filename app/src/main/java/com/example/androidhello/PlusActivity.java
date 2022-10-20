package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.view.View;

import com.example.androidhello.databinding.ActivityPlusBinding;

public class PlusActivity extends AppCompatActivity {

    ActivityPlusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnCalculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float num1;
                float num2;
                float sum;

                String textNum1 = binding.etNum1B.getText().toString();
                String textNum2 = binding.etNum2B.getText().toString();

                num1 = Float.parseFloat(textNum1);
                num2 = Float.parseFloat(textNum2);

                sum = num1 + num2;

                binding.tvResult.setText(String.format("%.2f ",sum));

            }
        });
    }


}
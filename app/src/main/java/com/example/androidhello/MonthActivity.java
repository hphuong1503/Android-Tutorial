package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidhello.databinding.ActivityGradesBinding;
import com.example.androidhello.databinding.ActivityMonthBinding;

public class MonthActivity extends AppCompatActivity {
    ActivityMonthBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMonthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float a;
                String textA = binding.etMonthNumber.getText().toString();

                a = Integer.parseInt(textA);

                solveMonthSwitchCase((int) a);
            }


        });

    }

    void solveMonth(int a) {
        if (a > 12) {
            binding.etResult.setText("Input Error");
        } else if (a < 1) {
            binding.etResult.setText("Input Error");
        } else if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            binding.etResult.setText("31");
        } else if (a == 2) {
            binding.etResult.setText("28/29");
        } else
            binding.etResult.setText("30");
    }

    void solveMonthSwitchCase(int a) {


        switch (a) {

            case 1:
                binding.etResult.setText("January 31 days");
                break;
            case 3:
                binding.etResult.setText("March 31 days");
                break;
            case 5:
                binding.etResult.setText("May 31 days");
                break;
            case 7:
                binding.etResult.setText("July31 days");
                break;
            case 8:
                binding.etResult.setText("August 31 days");
                break;
            case 10:
                binding.etResult.setText("October 31 days");
                break;
            case 12:
                binding.etResult.setText("December 31 days");
                break;
            case 2:
                binding.etResult.setText("February 28 or 29 days");
                break;
            case 4:
                binding.etResult.setText("April 30 days");
                break;
            case 6:
                binding.etResult.setText("April 30 days");
                break;
            case 9:
                binding.etResult.setText("September 30 days");
                break;
            case 11:
                binding.etResult.setText("November 30 days");
                break;
            default:
                binding.etResult.setText("Input Errors");
                //Viết cho Hoang Phuong

        }
    }
}
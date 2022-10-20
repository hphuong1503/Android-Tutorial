package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidhello.databinding.ActivityQuadraticBinding;

public class Quadratic extends AppCompatActivity {

    ActivityQuadraticBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityQuadraticBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, c, delta;

                String textA = binding.etNx2.getText().toString();
                String textB = binding.etNx.getText().toString();
                String textC = binding.etC.getText().toString();

                a = Integer.parseInt(textA);
                b = Integer.parseInt(textB);
                c = Integer.parseInt(textC);
                delta = (b * b) - 4 * a * c;
                double canDelta = Math.sqrt(delta);


               // solveQuadratic_Binh(a, b, c, delta, canDelta);
                solveQuadratic_Phuong(a, b, c);
            }


        });

    }

    void solveQuadratic_Phuong(int a, int b, int c) {
        visibleRoot2();
        if (a == 0) {
            solveSimpleEquation(b, c);
        } else {
            int delta = (b * b) - 4 * a * c;

            if (delta > 0) {
                double canDelta = Math.sqrt(delta);
                float x1 = (float) ((-b + canDelta) / (2 * a));
                binding.tvRoot1.setText(String.valueOf(x1));
                float x2 = (float) ((-b - canDelta) / (2 * a));
                binding.tvRoot2.setText(String.valueOf(x2));
            } else if (delta == 0) {
                float x1 = (float) ((-b) / (2 * a));
                binding.tvRoot1.setText(String.valueOf(x1));
                hideRoot2();

            } else  {
                binding.tvRoot1.setText("No Root");
               hideRoot2();
            }

        }


    }

    void solveSimpleEquation(int a, int b) {
        if (a != 0) {
            float Result = (float) -b / a;
            binding.tvRoot1.setText(String.valueOf(Result));

        } else {
            if (b == 0) {
                binding.tvRoot1.setText("Infinity");
            } else {
                binding.tvRoot1.setText("No root");
            }

        }

        hideRoot2();


    }

    void hideRoot2() {
          binding.tvResult2.setVisibility(View.GONE);
          binding.tvRoot2.setVisibility(View.GONE);
    }
    void visibleRoot2(){
        binding.tvResult2.setVisibility(View.VISIBLE);
        binding.tvRoot2.setVisibility(View.VISIBLE);
    }

    void solveQuadratic_Binh(double a, double b, double c, double delta, double canDelta) {
        if (a == 0) {
            if (b != 0) {
                float x1 = (float) (-c / b);
                binding.tvRoot1.setText(String.valueOf(x1));
            } else {
                if (c == 0) {
                    binding.tvRoot1.setText("No Root");
                } else {
                    binding.tvRoot1.setText("Infinity Root");
                }

            }
        } else {

            if (delta > 0) {
                float x1 = (float) ((-b + canDelta) / (2 * a));
                binding.tvRoot1.setText(String.valueOf(x1));
                float x2 = (float) ((-b - canDelta) / (2 * a));
                binding.tvRoot2.setText(String.valueOf(x2));
            } else {
                if (delta == 0) {
                    float x1 = (float) ((-b + canDelta) / (2 * a));
                    binding.tvRoot1.setText(String.valueOf(x1));
                    binding.tvRoot2.setText(String.valueOf(x1));

                } else {
                    binding.tvRoot1.setText("No Root");
                    binding.tvRoot2.setText("No Root");
                }
            }
        }

    }


}
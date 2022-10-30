package com.example.androidhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.androidhello.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    /*
    * Phuong code
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int n= 9 ;

       // dasd
//        checkPrimeNumber(n);
        System.out.println( n+" is prime? : "+checkPrimeNumber(n));
    }

    boolean checkPrimeNumber(int n ){
        for (int i =2; i < n; i++)
        {
            if( n % i ==0)
            {
                return false;
            }
        }


        return true;

    }




}

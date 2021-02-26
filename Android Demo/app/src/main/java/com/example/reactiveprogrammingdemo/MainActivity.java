package com.example.reactiveprogrammingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.reactiveprogrammingdemo.databinding.MainActivityBinding;
import com.example.reactiveprogrammingdemo.ui.main.MainFragment1;
import com.example.reactiveprogrammingdemo.ui.main.MainFragment2;

public class MainActivity extends AppCompatActivity {
    MainActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.demo1.setOnClickListener(view -> {
            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(binding.containerLinearLayout.getId(), MainFragment1.newInstance())
                        .commitNow();
            }
        });
        binding.demo2.setOnClickListener(view -> {
            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(binding.containerLinearLayout.getId(), MainFragment2.newInstance())
                        .commitNow();
            }
        });
    }
}
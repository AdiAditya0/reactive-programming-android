package com.example.reactiveprogrammingdemo.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reactiveprogrammingdemo.databinding.MainFragment1Binding;


public class MainFragment1 extends Fragment {

    MainFragment1Binding binding;

    private MainViewModel1 mViewModel;

    public static MainFragment1 newInstance() {
        return new MainFragment1();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = MainFragment1Binding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel1.class);
        // TODO: Use the ViewModel
    }

}
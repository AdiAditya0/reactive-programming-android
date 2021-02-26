package com.example.reactiveprogrammingdemo.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.reactiveprogrammingdemo.databinding.MainFragment2Binding;

public class MainFragment2 extends Fragment {

    MainFragment2Binding binding;

    private MainViewModel2 mViewModel;

    public static MainFragment2 newInstance() {
        return new MainFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = MainFragment2Binding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel2.class);
        // TODO: Use the ViewModel
    }

}
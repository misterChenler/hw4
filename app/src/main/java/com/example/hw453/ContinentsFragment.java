package com.example.hw453;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw453.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements OnItemClick {

    private FragmentContinentsBinding binding;
    private ArrayList<String> continentList = new ArrayList<>();
    private ContinentsAdapter continentsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContinents();
        continentsAdapter = new ContinentsAdapter(continentList, this);
        binding.rvContinents.setAdapter(continentsAdapter);
    }

    @Override
    public void onClick(int pos) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", pos);

        CountriesFragment countriesFragment = new CountriesFragment();
        countriesFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countriesFragment).commit();
    }

    private void loadContinents() {
        continentList.add("Азия");
        continentList.add("Aфрика");
        continentList.add("Европа");
        continentList.add("Северная Америка");
    }

}
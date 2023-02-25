package com.example.hw453;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw453.databinding.ItemCountriesBinding;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {

    private ArrayList<Country> countriesList;

    public CountriesAdapter(ArrayList<Country> countriesLise) {
        this.countriesList = countriesLise;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(ItemCountriesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }

    class CountriesViewHolder extends RecyclerView.ViewHolder{
        private ItemCountriesBinding binding;
        public CountriesViewHolder(@NonNull ItemCountriesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Country country) {
            binding.tvCountiesName.setText(country.getName());
            Glide.with(binding.ivFlag).load(country.getFlag()).into(binding.ivFlag);
        }
    }
}

package com.prabhakar.animaldetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<AnimalModel> animalsList;
    private ClickedListener clickedListener;

    public AnimalAdapter(ArrayList<AnimalModel> animalsList, ClickedListener clickedListener) {
        this.animalsList = animalsList;
        this.clickedListener = clickedListener;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new AnimalViewHolder(view, clickedListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        AnimalModel animalModel = animalsList.get(position);
        holder.setAnimalData(animalModel);
    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}

package com.prabhakar.animaldetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView sound;
    private TextView type;
    private ClickedListener clickedListener;
    private RelativeLayout animal_card;

    public AnimalViewHolder(@NonNull View itemView, ClickedListener clickedListener) {
        super(itemView);
        this.clickedListener = clickedListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        img = itemView.findViewById(R.id.picture);
        type = itemView.findViewById(R.id.type);
        sound = itemView.findViewById(R.id.sound);
        animal_card = itemView.findViewById(R.id.animal_card);

    }

    public void setAnimalData(AnimalModel animalModel) {
        img.setImageResource(animalModel.getImage());
        type.setText(animalModel.getAnimalType());
        sound.setText(animalModel.getAnimalSound());
        animal_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedListener.onItemClicked(animalModel);
            }
        });
    }
}

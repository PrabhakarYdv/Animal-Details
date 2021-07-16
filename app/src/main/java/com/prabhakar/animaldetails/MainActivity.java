package com.prabhakar.animaldetails;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickedListener {
    private ArrayList<AnimalModel> animalList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();
    }


    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void buildList() {
        animalList = new ArrayList<>();
        animalList.add(new AnimalModel(R.drawable.cow, "Sound : Moww", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.lion, "Sound : Roar", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.monkey, "Sound : Whoop", "Type : Both"));
        animalList.add(new AnimalModel(R.drawable.rabbit, "Sound : cluck", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.deer, "Sound : Buck Grunt", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.dog, "Sound : Bow Bow", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.elephant, "Sound : Trumpet", "Type : Both"));
        animalList.add(new AnimalModel(R.drawable.girraf, "Sound : Hum", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.tiger, "Sound : Chuff", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.cat, "Sound : Meow", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.cheetah, "Sound : growls", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.kangaroo, "Sound : Chortle", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.bulls, "Sound : Mow", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.wolf, "Sound : Whimpering", "Type : Wild"));
        animalList.add(new AnimalModel(R.drawable.horse, "Sound : Neighihih", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.buffalow, "Sound : Mow", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.goat, "Sound : Mehehe", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.ass, "Sound : Buzz", "Type : pet"));
        animalList.add(new AnimalModel(R.drawable.donkey, "Sound : Hee-Haw", "Type : Pet"));
        animalList.add(new AnimalModel(R.drawable.pig, "Sound : Oink", "Type : Pet"));


    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(animalAdapter);
    }

    @Override
    public void onItemClicked(AnimalModel animalModel) {
        new AlertDialog.Builder(this).setTitle("Animal Details :")
                .setMessage(animalModel.getAnimalType() + "\n" + animalModel.getAnimalSound())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();

    }
}

package com.prabhakar.animaldetails;

public class AnimalModel {
    private int image;
    private String animalSound;
    private String animalType;

    public AnimalModel(int image, String animalSound, String animalType) {
        this.image = image;
        this.animalSound = animalSound;
        this.animalType = animalType;
    }

    public int getImage() {
        return image;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public String getAnimalType() {
        return animalType;
    }
}
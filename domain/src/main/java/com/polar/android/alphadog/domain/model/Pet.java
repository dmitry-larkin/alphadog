package com.polar.android.alphadog.domain.model;

/**
 * Class that represents a Pet in the domain layer.
 */
public class Pet {
    
    private final int petId;

    public Pet(int petId) {
        this.petId = petId;
    }

    private String name;
    private String avatar;
    private int ageInMonths;

    public int getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }
}

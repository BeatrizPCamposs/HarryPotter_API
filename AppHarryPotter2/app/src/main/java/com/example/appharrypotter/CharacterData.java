package com.example.appharrypotter;

public class CharacterData {
    private String slug;
    private String name;
    private String born;
    private String gender;
    private String house;
    private String patronus;
    private String image;

    public CharacterData(String slug, String name, String born, String gender, String house, String patronus, String image) {
        this.slug = slug;
        this.name = name;
        this.born = born;
        this.gender = gender;
        this.house = house;
        this.patronus = patronus;
        this.image = image;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getBorn() {
        return born;
    }

    public String getGender() {
        return gender;
    }

    public String getHouse() {
        return house;
    }

    public String getPatronus() {
        return patronus;
    }

    public String getImage() {
        return image;
    }
}



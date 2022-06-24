package com.springboot.petology.model;

public class Objects {
    private int id;
    private String photoPicUrl;
    private String name;
    private int price;

    public Objects(int id, String photoPicUrl, String name, int price) {
        this.id = id;
        this.photoPicUrl = photoPicUrl;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhotoPicUrl() {
        return photoPicUrl;
    }

    public void setPhotoPicUrl(String photoPicUrl) {
        this.photoPicUrl = photoPicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package com.example.fragments_17621640;

public class Contacts {
    private String picture;
    private String name;
    private String address;

    public Contacts(String picture, String name, String address) {
        this.picture = picture;
        this.name = name;
        this.address = address;
    }


    public String getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

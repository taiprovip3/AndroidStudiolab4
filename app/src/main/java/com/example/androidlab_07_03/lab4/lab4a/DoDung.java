package com.example.androidlab_07_03.lab4.lab4a;

public class DoDung {
    private String name;
    private String des;
    private String imageId;

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public String getImageId() {
        return imageId;
    }

    public DoDung(String name, String des, String imageId) {
        this.name = name;
        this.des = des;
        this.imageId = imageId;
    }
    public DoDung(){

    }

    @Override
    public String toString() {
        return "DoDung{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", imageId='" + imageId + '\'' +
                '}';
    }
}

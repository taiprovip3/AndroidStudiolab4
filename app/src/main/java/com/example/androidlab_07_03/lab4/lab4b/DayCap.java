package com.example.androidlab_07_03.lab4.lab4b;

public class DayCap {
    private String imageCap;
    private String nameCap;
    private String priceCap;

    public DayCap(String imageCap, String nameCap, String priceCap) {
        this.imageCap = imageCap;
        this.nameCap = nameCap;
        this.priceCap = priceCap;
    }

    public DayCap() {
    }

    public String getImageCap() {
        return imageCap;
    }

    public String getNameCap() {
        return nameCap;
    }

    public String getPriceCap() {
        return priceCap;
    }

    @Override
    public String toString() {
        return "DayCap{" +
                "imageCap='" + imageCap + '\'' +
                ", nameCap='" + nameCap + '\'' +
                ", priceCap='" + priceCap + '\'' +
                '}';
    }
}

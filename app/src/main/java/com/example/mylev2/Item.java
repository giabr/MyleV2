package com.example.mylev2;

public class Item {
    String produk;
    String penjual;
    int harga;
    int rating;
    int img;
    int comment;
    String tag;
    String gender;
    private String intentDestination;

    public Item(){

    }

    public String getIntentDestination() {
        return "com.example.mylev2." + intentDestination;
    }

    public void setIntentDestination(String intentDestination) {
        this.intentDestination = intentDestination;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getPenjual() {
        return penjual;
    }

    public void setPenjual(String penjual) {
        this.penjual = penjual;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

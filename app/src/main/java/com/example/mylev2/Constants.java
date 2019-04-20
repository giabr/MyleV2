package com.example.mylev2;

public class Constants {
    static final int DATABASE_VERSION = 1;
    static final String DATABASE_NAME = "ItemDB";
    static final String TABLE_NAME = "ITEM";
    static final String KEY_ID = "id";
    static final String KEY_NAMA_PRODUK = "produk";
    static final String KEY_PENJUAL = "penjual";
    static final String KEY_HARGA = "harga";
    static final String KEY_RATING = "rating";
    static final String KEY_IMAGE = "img";
    static final String KEY_COMMENT = "comment";
    static final String KEY_TAG = "tag";
    static final String KEY_GENDER = "gender";

    static final String CREATE_DB = "CREATE TABLE itemDB(id INTEGER PRIMARY KEY AUTOINCREMENT, produk TEXT NOT NULL, penjual TEXT NOT NULL, harga INTEGER NOT NULL, rating INTEGER NOT NULL, img INTEGER NOT NULL, comment INTEGER NOT NULL, tag TEXT NOT NULL, gender TEXT NOT NULL);";
    static final String DROP_DB ="DROP TABLE IF EXIST " + TABLE_NAME;
}

package com.example.mylev2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBAdapter {
    Context c;
    SQLiteDatabase db;
    DBHelper helper;

    public DBAdapter(Context c) {
        this.c = c;
        helper=new DBHelper(c);
    }

    //OPEN DB
    public void openDB()
    {
        try
        {
            db=helper.getWritableDatabase();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //CLOSING
    public void closeDB()
    {
        try
        {
            helper.close();

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //SAVE OR INSERTING
    public boolean add(String produk, String penjual, int harga, int rating, int img, int comment, String tag, String gender )
    {
        try
        {
            ContentValues cv=new ContentValues();
            cv.put(Constants.KEY_NAMA_PRODUK, produk);
            cv.put(Constants.KEY_PENJUAL, penjual);
            cv.put(Constants.KEY_HARGA, harga);
            cv.put(Constants.KEY_RATING, rating);
            cv.put(Constants.KEY_IMAGE, img);
            cv.put(Constants.KEY_COMMENT, comment);
            cv.put(Constants.KEY_TAG, tag);
            cv.put(Constants.KEY_GENDER, gender);

            db.insert(Constants.TABLE_NAME, Constants.KEY_ID, cv);

            return true;

        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return false;
    }

    //SELECT OR RETRIEVE
    public Cursor retrieve()
    {
        String[] columns={Constants.KEY_ID,Constants.KEY_NAMA_PRODUK, Constants.KEY_PENJUAL, Constants.KEY_HARGA,Constants.KEY_RATING, Constants.KEY_IMAGE,Constants.KEY_COMMENT, Constants.KEY_TAG, Constants.KEY_GENDER};

        return db.query(Constants.TABLE_NAME,columns,null,null,null,null,null);
    }
}
package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;

import android.os.Bundle;

public class MainActivity extends Application {
    private static Context mInstance;


    @Override
    public void onCreate() {
        super.onCreate();
        if (mInstance == null) {
            mInstance = getApplicationContext();
        }
    }

    public static Context getInstance() {
        return mInstance;
    }
}
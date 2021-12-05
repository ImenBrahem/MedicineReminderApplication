package com.example.medicinereminder;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.medicinereminder.data.source.MedicineRepository;
import com.example.medicinereminder.data.source.local.MedicinesLocalDataSource;

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
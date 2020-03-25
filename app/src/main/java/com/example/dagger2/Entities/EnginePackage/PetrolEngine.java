package com.example.dagger2.Entities.EnginePackage;

import android.util.Log;

import com.example.dagger2.Entities.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
        startEngine();
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: ");
    }
}

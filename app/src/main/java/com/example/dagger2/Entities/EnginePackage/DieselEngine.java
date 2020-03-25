package com.example.dagger2.Entities.EnginePackage;

import android.util.Log;

import com.example.dagger2.Entities.Engine;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    private int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
        startEngine();
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: " + " " + horsePower);
    }
}

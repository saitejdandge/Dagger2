package com.example.dagger2.Entities.EnginePackage;

import android.util.Log;

import com.example.dagger2.Entities.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        startEngine();
    }


    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: " + horsePower + " " + engineCapacity);
    }
}

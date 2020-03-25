package com.example.dagger2.Entities;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setCar(Car car) {
        Log.d(TAG, "setCar: remote connected");
    }
}

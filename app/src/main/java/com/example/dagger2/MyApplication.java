package com.example.dagger2;

import android.app.Application;

import com.example.dagger2.Dagger.Components.AppComponent;
import com.example.dagger2.Dagger.Components.DaggerAppComponent;
//import com.example.dagger2.Dagger.Components.DaggerAppComponent;

public class MyApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }
}

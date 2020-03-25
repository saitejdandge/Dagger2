package com.example.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.Dagger.CarComponent;
import com.example.dagger2.Dagger.DaggerCarComponent;
import com.example.dagger2.Entities.Car;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent daggerCarComponent = DaggerCarComponent.builder().build();
        Car car = daggerCarComponent.getCar();
        car.drive();
    }
}

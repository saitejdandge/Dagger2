package com.example.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.Dagger.Components.CarComponent;
import com.example.dagger2.Entities.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Car car, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent;
        carComponent = ((MyApplication) getApplication()).appComponent.getCarComponentFactory().create(4, 3);
//        carComponent=((MyApplication)getApplication()).appComponent.getCarCcomponent(new D)
        carComponent.inject(this);
//        Car car = carComponent.getCar();
        car.drive();
        car2.drive();
    }
}

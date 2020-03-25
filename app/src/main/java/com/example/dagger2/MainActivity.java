package com.example.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.Dagger.CarComponent;
import com.example.dagger2.Dagger.DaggerCarComponent;
import com.example.dagger2.Entities.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Car car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.builder().horsePower(4).engineCapacity(3).build();
        carComponent.inject(this);
//        Car car = carComponent.getCar();
//        car.drive();
        car2.drive();
    }
}

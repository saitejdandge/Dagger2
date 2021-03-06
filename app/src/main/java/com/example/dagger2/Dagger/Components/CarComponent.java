package com.example.dagger2.Dagger.Components;

import com.example.dagger2.Dagger.PetrolEngineModule;
import com.example.dagger2.Dagger.Scopes.PerActivity;
import com.example.dagger2.Dagger.WheelsModule;
import com.example.dagger2.Entities.Car;
import com.example.dagger2.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

//    @Subcomponent.Builder
//    interface Builder {
//        CarComponent build();
//
//        @BindsInstance
//        Builder horsePower(@Named("horsePower") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
//
//
//    }

    @Subcomponent.Factory
    interface Factory {
        CarComponent create(@BindsInstance @Named("horsePower") int horsePower, @BindsInstance @Named("engineCapacity") int engineCapacity);
    }
}

package com.example.dagger2.Dagger;

import com.example.dagger2.ThirdParty.Rims;
import com.example.dagger2.ThirdParty.Tires;
import com.example.dagger2.ThirdParty.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}

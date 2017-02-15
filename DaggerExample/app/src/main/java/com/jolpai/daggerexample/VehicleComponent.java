package com.jolpai.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by User on 2/15/2017.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}

package com.jolpai.daggerexample;

/**
 * Created by User on 2/15/2017.
 */

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 100;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }

}

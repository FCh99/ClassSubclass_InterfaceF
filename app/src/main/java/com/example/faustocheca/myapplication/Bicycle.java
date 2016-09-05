package com.example.faustocheca.myapplication;

import android.content.Intent;
import android.util.Log;

/**
 * Created by faustocheca on 13/7/16.
 */
public class Bicycle implements PintarLaBici{

    public int cadence;
    public int gear;
    public int speed;



    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }



    public void setCadence(int newCadence) {
        this.cadence = newCadence;
    }

    public void setGear(int newGear) {
        this.gear = newGear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBreak (int decrement) {
        speed = speed - decrement;

    }

    public void speedUp (int increment) {
        speed = speed + increment;

    }

    public void printMyName (String name) {

        Log.i(">>TAG",name);
    }




    public void printSpeed () {

        Log.i(">>TAG",String.valueOf(speed));
    }



    @Override
    public void pintar() {
        Log.i(">>TAG", "Y ahora me pongo a pintar ....");

    }

    @Override
    public void imprimirDiseño(String impresion) {
        Log.i(">>TAG", impresion);

    }

    @Override
    public void cambiarElColor(String nuevoColor) {
        Log.i(">>TAG", "La estoy pintando de..."+nuevoColor);

    }
}

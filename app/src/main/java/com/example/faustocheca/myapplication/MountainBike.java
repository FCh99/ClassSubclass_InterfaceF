package com.example.faustocheca.myapplication;

import android.util.Log;

/**
 * Created by faustocheca on 13/7/16.
 */
public class MountainBike extends Bicycle implements Cloneable {
    public int seatHeight;


    public MountainBike(int cadence, int gear, int speed, int seatHeight) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }



    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void increaseSeatHeight (int moreHeight) {
        seatHeight = seatHeight + moreHeight;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                '}';
    }

    public void printSeatHeight (){
        Log.i(">>TAG", toString());

    }


}

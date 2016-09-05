package com.example.faustocheca.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          textView = (TextView) findViewById(R.id.text_view);


        MountainBike mountainBike = new MountainBike(10,3,25,3);

        mountainBike.printMyName("BiciDeFausto");
        mountainBike.setSpeed(8);
        mountainBike.printSpeed();


        mountainBike.pintar();
        mountainBike.imprimirDiseño("El cuadro de Aurelia");
        mountainBike.cambiarElColor("Rosa");




    }



}



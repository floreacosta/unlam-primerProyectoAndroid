package com.example.flor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // contiene el archivo que tiene el arbol layout.

        // this.welcomeMessage = findViewById(R.id.welcome);
        // setOnClickListener() recibe un objeto del tipo onClickListener.
    }
}

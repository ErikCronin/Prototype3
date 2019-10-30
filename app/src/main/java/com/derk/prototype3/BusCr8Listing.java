package com.derk.prototype3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BusCr8Listing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_cr8_listing);
    }

    public void ListingMade_buttonClicked(View view){
        Intent intent = new Intent(this, BusNavPage.class);
        startActivity(intent);
    }
}

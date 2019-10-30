package com.derk.prototype3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BusNavPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_nav_page);
    }

        public void CreateListing_buttonClicked(View view) {
        Intent intent = new Intent(this, BusCr8Listing.class);
        startActivity(intent);
    }

        public void Logout_buttonClicked(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

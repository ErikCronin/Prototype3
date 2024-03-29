package com.derk.prototype3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavigationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_page);
    }

    public void Profile_buttonClicked(View view){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void JobListing_buttonClicked(View view){
        Intent intent = new Intent(this, JobListingPage.class);
        startActivity(intent);
    }

    public void Logout_buttonClicked(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

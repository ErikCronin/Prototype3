package com.derk.prototype3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JobListingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_listing_page);
    }

    public void JobDescription_buttonClicked(View view){
        Intent intent = new Intent(this, JobDetail.class);
        startActivity(intent);
    }

    public void Back_buttonClicked(View view){
        Intent intent = new Intent(this, NavigationPage.class);
        startActivity(intent);
    }
}

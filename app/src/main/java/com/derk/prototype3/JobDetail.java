package com.derk.prototype3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JobDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);
    }

    public void Apply_buttonClicked(View view){
        Intent intent = new Intent(this, JobListingPage.class);
        startActivity(intent);
    }

    public void Back_buttonClicked(View view){
        Intent intent = new Intent(this, JobListingPage.class);
        startActivity(intent);
    }
}

package com.derk.prototype3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LogIn_buttonClicked(View view){
        Intent intent = new Intent(this, NavigationPage.class);
        startActivity(intent);
    }

    public void SignUp_buttonClicked(View view){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}

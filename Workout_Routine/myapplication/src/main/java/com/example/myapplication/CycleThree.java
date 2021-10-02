package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CycleThree extends AppCompatActivity {

    // Runs code when corresponding XML file loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_three);
    }

    // Transitions to week one activity
    public void week_one(View view) {
        Intent intent = new Intent(CycleThree.this, MainActivity.class);
        startActivity(intent);
    }

    // Transitions to week two activity
    public void week_two(View view) {
        Intent intent = new Intent(CycleThree.this, MainActivity.class);
        startActivity(intent);
    }
}
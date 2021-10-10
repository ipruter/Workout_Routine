package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CycleFiveActivity extends AppCompatActivity {

    // Runs code when corresponding XML file loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_five);
    }

    // Transitions to week one activity
    public void week_one(View view) {
        Intent intent = new Intent(CycleFiveActivity.this, C5W1Activity.class);
        startActivity(intent);
    }

    // Transitions to week two activity
    public void week_two(View view) {
        Intent intent = new Intent(CycleFiveActivity.this, C5W2Activity.class);
        startActivity(intent);
    }

    // Transitions to week three activity
    public void week_three(View view) {
        Intent intent = new Intent(CycleFiveActivity.this, C5W3Activity.class);
        startActivity(intent);
    }
}
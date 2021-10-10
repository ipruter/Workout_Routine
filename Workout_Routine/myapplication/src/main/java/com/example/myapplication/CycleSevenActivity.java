package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CycleSevenActivity extends AppCompatActivity {

    // Runs code when corresponding XML file loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_seven);
    }

    // Transitions to week one activity
    public void week_one(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W1Activity.class);
        startActivity(intent);
    }

    // Transitions to week two activity
    public void week_two(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W2Activity.class);
        startActivity(intent);
    }
    // Transitions to week three activity
    public void week_three(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W3Activity.class);
        startActivity(intent);
    }

    // Transitions to week four activity
    public void week_four(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W4Activity.class);
        startActivity(intent);
    }

    // Transitions to week five activity
    public void week_five(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W5Activity.class);
        startActivity(intent);
    }

    // Transitions to week six activity
    public void week_six(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W6Activity.class);
        startActivity(intent);
    }

    // Transitions to week seven activity
    public void week_seven(View view) {
        Intent intent = new Intent(CycleSevenActivity.this, C7W7Activity.class);
        startActivity(intent);
    }
}
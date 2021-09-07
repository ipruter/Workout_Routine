package com.example.workout_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CycleOne extends AppCompatActivity {
    int front_squat;
    Button load_but;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_one);
        tv1 = (TextView)findViewById(R.id.front_squat);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        front_squat = pref.getInt("squat_max", 0);
        String str_FS = Integer.toString(front_squat);

        tv1.setText(str_FS);

    }
}
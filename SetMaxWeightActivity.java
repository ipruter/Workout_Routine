package com.example.workout_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SetMaxWeightActivity extends AppCompatActivity {

    String front_squat;
    String dead_lift;
    String cal_push_up;
    String sit_up;
    String OA_push_up;
    String axel_press;
    String cal_pull_up;
    String OAI_row;
    String pull_up;
    String muscle_up;

    String str;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;

    EditText FS_max_form;
    EditText deadlift_max_form;
    EditText cal_push_ups_form;
    EditText crunch_max_form;
    EditText cal_rows_form;
    EditText OAIR_max_form;
    EditText OAP_form;
    EditText PU_max_form;
    EditText AP_max_form;
    EditText muscle_ups_form;

    Button save_but;
    Button save_but2;
    Button save_but3;
    Button save_but4;
    Button save_but5;
    Button save_but6;
    Button save_but7;
    Button save_but8;
    Button save_but9;
    Button save_but10;

    Button load_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_max_weight);
        tv1 = (TextView)findViewById(R.id.FS_max);
        tv2 = (TextView)findViewById(R.id.deadlift_max);
        tv3 = (TextView)findViewById(R.id.cal_push_ups_max);
        tv4 = (TextView)findViewById(R.id.crunch_max);
        tv5 = (TextView)findViewById(R.id.cal_rows_max);
        tv6 = (TextView)findViewById(R.id.OAIR_max);
        tv7 = (TextView)findViewById(R.id.OAP_max);
        tv8 = (TextView)findViewById(R.id.PU_max);
        tv9 = (TextView)findViewById(R.id.AP_max);
        tv10 = (TextView)findViewById(R.id.muscle_ups_max);

        FS_max_form = (EditText)findViewById(R.id.FS_max_form);
        deadlift_max_form = (EditText)findViewById(R.id.deadlift_max_form);
        cal_push_ups_form = (EditText)findViewById(R.id.cal_push_ups_form);
        crunch_max_form = (EditText)findViewById(R.id.crunch_max_form);
        cal_rows_form = (EditText)findViewById(R.id.cal_rows_form);
        OAIR_max_form = (EditText)findViewById(R.id.OAIR_max_form);
        OAP_form = (EditText)findViewById(R.id.OAP_form);
        PU_max_form = (EditText)findViewById(R.id.PU_max_form);
        AP_max_form = (EditText)findViewById(R.id.AP_max_form);
        muscle_ups_form = (EditText)findViewById(R.id.muscle_ups_form);


        save_but = (Button)findViewById(R.id.save);
        save_but2 = (Button)findViewById(R.id.save2);
        save_but3 = (Button)findViewById(R.id.save3);
        save_but4 = (Button)findViewById(R.id.save4);
        save_but5 = (Button)findViewById(R.id.save5);
        save_but6 = (Button)findViewById(R.id.save6);
        save_but7 = (Button)findViewById(R.id.save7);
        save_but8 = (Button)findViewById(R.id.save8);
        save_but9 = (Button)findViewById(R.id.save9);
        save_but10 = (Button)findViewById(R.id.save10);

        load_but = (Button)findViewById(R.id.calculate);
        save_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                front_squat = String.valueOf(FS_max_form.getText());
                editor.putString("squat_max", front_squat);
                editor.commit();
                front_squat = pref.getString("squat_max", "0");
                tv1.setText(front_squat);

            }
        });

        save_but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                dead_lift = String.valueOf(deadlift_max_form.getText());
                editor.putString("DL_max", dead_lift);
                editor.commit();
                dead_lift = pref.getString("DL_max", "0");
                tv2.setText(dead_lift);
            }
        });

        save_but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                OA_push_up = String.valueOf(OAP_form.getText());
                editor.putString("OAP_max", OA_push_up);
                editor.commit();
                OA_push_up = pref.getString("OAP_max", "0");

                tv7.setText(OA_push_up);
            }
        });

        save_but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                OAI_row = String.valueOf(OAIR_max_form.getText());
                editor.putString("OAIR_max", OAI_row);
                editor.commit();
                OAI_row = pref.getString("OAIR_max", "0");

                tv6.setText(OAI_row);

            }
        });

        save_but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                axel_press = String.valueOf(AP_max_form.getText());
                editor.putString("AP_max", axel_press);
                editor.commit();
                axel_press = pref.getString("AP_max", "0");

                tv9.setText(axel_press);
            }
        });

        save_but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                pull_up = String.valueOf(PU_max_form.getText());
                editor.putString("PU_max", pull_up);
                editor.commit();
                pull_up = pref.getString("PU_max", "0");

                tv8.setText(pull_up);

            }
        });

        save_but7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                sit_up = String.valueOf(crunch_max_form.getText());
                editor.putString("SU_max", sit_up);
                editor.commit();
                sit_up = pref.getString("SU_max", "0");
                tv4.setText(sit_up);

            }
        });

        save_but8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                cal_push_up = String.valueOf(cal_push_ups_form.getText());
                editor.putString("CPushU_max", cal_push_up);
                editor.commit();
                cal_push_up = pref.getString("CPushU_max", "0");
                tv3.setText(cal_push_up);
            }
        });

        save_but9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                cal_pull_up = String.valueOf(cal_rows_form.getText());
                editor.putString("CPullU_max", cal_pull_up);
                editor.commit();
                cal_pull_up = pref.getString("CPullU_max", "0");

                tv5.setText(cal_pull_up);

            }
        });

        save_but10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                muscle_up = String.valueOf(muscle_ups_form.getText());
                editor.putString("MU_max", muscle_up);
                editor.commit();
                muscle_up = pref.getString("MU_max", "0");

                tv10.setText(muscle_up);
            }
        });





    }
}
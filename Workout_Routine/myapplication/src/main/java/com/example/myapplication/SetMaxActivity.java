package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import java.text.DecimalFormat;

public class SetMaxActivity extends AppCompatActivity {

    String front_squat, dead_lift, cal_push_up, sit_up, OA_push_up, axel_press, cal_pull_up, OAI_row, pull_up, muscle_up, pistol_squat;
    TextView tv_FS, tv_DL, tv_CPU, tv_SU, tv_OAPU, tv_AP, tv_CR, tv_OAIR, tv_PU, tv_MU, tv_PS;
    EditText FS_max_form, deadlift_max_form, cal_push_ups_form, crunch_max_form, cal_rows_form, OAIR_max_form, OAP_form, PU_max_form, AP_max_form, muscle_ups_form, pistol_squat_form;
    Button save_but, save_but2, save_but3, save_but4, save_but5, save_but6, save_but7, save_but8, save_but9, save_but10, save_but11, load_but;

    // Runs code when corresponding XML file loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_max);
        // Creates objects for saving data
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        // Formats floats to one decimal place
        DecimalFormat df = new DecimalFormat("###.#");
        // Assigns text views, buttons, and edit texts to variables
        tv_FS = (TextView)findViewById(R.id.FS_max);
        tv_DL = (TextView)findViewById(R.id.deadlift_max);
        tv_CPU = (TextView)findViewById(R.id.cal_push_ups_max);
        tv_SU = (TextView)findViewById(R.id.crunch_max);
        tv_OAPU = (TextView)findViewById(R.id.OAP_max);
        tv_OAIR = (TextView)findViewById(R.id.OAIR_max);
        tv_CR = (TextView)findViewById(R.id.cal_rows_max);
        tv_PU = (TextView)findViewById(R.id.PU_max);
        tv_AP = (TextView)findViewById(R.id.AP_max);
        tv_MU = (TextView)findViewById(R.id.muscle_ups_max);
        tv_PS = (TextView)findViewById(R.id.pistol_squat_max);

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
        pistol_squat_form = (EditText)findViewById(R.id.pistol_squat_form);

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
        save_but11 = (Button)findViewById(R.id.save11);

        // Retrieves saved workout data
        front_squat = pref.getString("squat_max", "0");
        dead_lift = pref.getString("DL_max", "0");
        cal_push_up =pref.getString("CPushU_max", "0");
        sit_up = pref.getString("SU_max", "0");
        OA_push_up = pref.getString("OAP_max", "0");
        axel_press = pref.getString("AP_max", "0");
        cal_pull_up = pref.getString("CPullU_max", "0");
        OAI_row = pref.getString("OAIR_max", "0");
        pull_up = pref.getString("PU_max", "0");
        muscle_up = pref.getString("MU_max", "0");
        pistol_squat = pref.getString("PS_max", "0");

        // Sets data to display in text views
        tv_FS.setText(front_squat);
        tv_DL.setText(dead_lift);
        tv_CPU.setText(cal_push_up);
        tv_SU.setText(sit_up);
        tv_OAPU.setText(OA_push_up);
        tv_AP.setText(axel_press);
        tv_CR.setText(cal_pull_up);
        tv_OAIR.setText(OAI_row);
        tv_PU.setText(pull_up);
        tv_MU.setText(muscle_up);
        tv_PS.setText(pistol_squat);

        load_but = (Button)findViewById(R.id.calculate);

        // Runs function when save button is pressed
        save_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                front_squat = String.valueOf(FS_max_form.getText());
                editor.putString("squat_max", front_squat);
                editor.commit(); // Save data
                front_squat = pref.getString("squat_max", "0");
                tv_FS.setText(front_squat); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                dead_lift = String.valueOf(deadlift_max_form.getText());
                editor.putString("DL_max", dead_lift);
                editor.commit(); // Save data
                dead_lift = pref.getString("DL_max", "0");
                tv_DL.setText(dead_lift); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                OA_push_up = String.valueOf(OAP_form.getText());
                editor.putString("OAP_max", OA_push_up);
                editor.commit(); // Save data
                OA_push_up = pref.getString("OAP_max", "0");
                tv_OAPU.setText(OA_push_up); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                OAI_row = String.valueOf(OAIR_max_form.getText());
                editor.putString("OAIR_max", OAI_row);
                editor.commit(); // Save data
                OAI_row = pref.getString("OAIR_max", "0");
                tv_OAIR.setText(OAI_row); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                axel_press = String.valueOf(AP_max_form.getText());
                editor.putString("AP_max", axel_press);
                editor.commit(); // Save data
                axel_press = pref.getString("AP_max", "0");
                tv_AP.setText(axel_press); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                pull_up = String.valueOf(PU_max_form.getText());
                editor.putString("PU_max", pull_up);
                editor.commit(); // Save data
                pull_up = pref.getString("PU_max", "0");
                tv_PU.setText(pull_up); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                sit_up = String.valueOf(crunch_max_form.getText());
                editor.putString("SU_max", sit_up);
                editor.commit(); // Save data
                sit_up = pref.getString("SU_max", "0");
                tv_SU.setText(sit_up); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                cal_push_up = String.valueOf(cal_push_ups_form.getText());
                editor.putString("CPushU_max", cal_push_up);
                editor.commit(); // Save data
                cal_push_up = pref.getString("CPushU_max", "0");
                tv_CPU.setText(cal_push_up); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                cal_pull_up = String.valueOf(cal_rows_form.getText());
                editor.putString("CPullU_max", cal_pull_up);
                editor.commit(); // Save data
                cal_pull_up = pref.getString("CPullU_max", "0");
                tv_CR.setText(cal_pull_up); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                muscle_up = String.valueOf(muscle_ups_form.getText());
                editor.putString("MU_max", muscle_up);
                editor.commit(); // Save data
                muscle_up = pref.getString("MU_max", "0");
                tv_MU.setText(muscle_up); // Displays data in text view
            }
        });

        // Runs function when save button is pressed
        save_but11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // Creates objects for saving data
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                pistol_squat = String.valueOf(pistol_squat_form.getText());
                editor.putString("PS_max", pistol_squat);
                editor.commit(); // Save data
                pistol_squat = pref.getString("PS_max", "0");
                tv_PS.setText(pistol_squat); // Displays data in text view
            }
        });
    }
}
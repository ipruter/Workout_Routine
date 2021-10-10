package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class PopupC5W1 extends AppCompatActivity {

    String str_max;
    double max;
    Button OL_DL, OL_FS, OL_CPU, OL_OAPU, OL_AP, OL_PS, OL_OAIR, OL_PU, OL_SU, OL_CR, OL_MU;

    // Runs methods when corresponding XML file loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_c3_w1);
        TextView tv = (TextView)findViewById(R.id.text);

        Bundle bundle = getIntent().getExtras(); // Get the bundle
        String exorcise = bundle.getString("bundle"); // Extracts data
        tv.setText(exorcise); // Sets data to text view

        if (exorcise.equals("Front Squat")) {
            OL_FS = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_FS.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("squat_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("squat_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Dead Lift")) {
            OL_DL = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_DL.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("DL_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("DL_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Calisthenic Push Up")) {
            OL_CPU = (Button) findViewById(R.id.yes);  // Assigns variable for yes button
            // Activates method on yes button click
            OL_CPU.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("CPushU_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("CPushU_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("One Arm Push Up")) {
            OL_OAPU = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_OAPU.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("OAP_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("OAP_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Axel Press")) {
            OL_AP = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_AP.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("AP_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("AP_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Pistol Squat")) {
            OL_PS = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_PS.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("PS_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("PS_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("One Arm Inverted Row")) {
            OL_OAIR = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_OAIR.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("OAIR_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("OAIR_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Pull Up")) {
            OL_PU = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_PU.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("PU_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("PU_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Sit Up")) {
            OL_SU = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_SU.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("SU_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("SU_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Calisthenic Row")) {
            OL_CR = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_CR.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("CPullU_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("CPullU_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
        else if (exorcise.equals("Muscle Up")) {
            OL_MU = (Button) findViewById(R.id.yes); // Assigns variable for yes button
            // Activates method on yes button click
            OL_MU.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    // Create objects for saving data
                    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = pref.edit();
                    str_max = pref.getString("MU_max", "0"); // Retrieves saved data
                    max = Double.parseDouble(str_max);
                    max = overload(max); // Overloads lift
                    str_max = String.valueOf(max);
                    editor.putString("MU_max", str_max);
                    editor.commit(); // Saves overloaded 1RM
                    // Returns to previous page
                    Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
                    startActivity(intent);
                }
            });
        }
    }

    // Overloads the 1RM by 5%
    double overload(double max){
        double new_max = 0;
        new_max = (max * 0.05) + max;
        return new_max;
    }

    // Returns to previous page when no button is clicked
    public void no(View view) {
        Intent intent = new Intent(PopupC5W1.this, C5W1Activity.class);
        startActivity(intent);
    }
}
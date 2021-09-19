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


public class MainActivity extends AppCompatActivity {

    String str_weight;
    String str_reps;
    String str_max;
    double max;
    double weight;
    double reps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save_but = (Button)findViewById(R.id.body_weight_button);
        Button calculate = (Button)findViewById(R.id.calculate);
        TextView tv1 = (TextView)findViewById(R.id.display_body_weight);
        TextView tv2 = (TextView)findViewById(R.id.display_max);
        EditText input_body_weight = (EditText)findViewById(R.id.body_weight_form);
        EditText input_weight = (EditText)findViewById(R.id.weight);
        EditText input_reps = (EditText)findViewById(R.id.reps);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();

        String body_weight;
        body_weight = pref.getString("body_weight", "0");
        tv1.setText(body_weight);


        save_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String body_weight = "0";

                body_weight = String.valueOf(input_body_weight.getText());
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("body_weight", body_weight);
                editor.commit();
                body_weight = pref.getString("body_weight", "0");
                tv1.setText(body_weight);

            }
        });

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String body_weight = "0";

                str_weight = String.valueOf(input_weight.getText());
                str_reps = String.valueOf(input_reps.getText());
                weight = Double.parseDouble(str_weight);
                reps = Double.parseDouble(str_reps);
                max = get_max (weight, reps);
                if (weight == 0) {
                    tv2.setText(String.valueOf("0"));
                }
                else {
                    str_max = String.valueOf(Math.round(max));
                    tv2.setText(String.valueOf(str_max));
                }
            }
        });
    }

    public void first_cycle (View view){
        Intent intent = new Intent (this, CycleOneActivity.class);
        startActivity(intent);
    }

    public void second_cycle (View view){
        Intent intent = new Intent (this, CycleTwoActivity.class);
        startActivity(intent);
    }

    public void set_max_weight (View view){
        Intent intent = new Intent (this, SetMaxActivity.class);
        startActivity(intent);
    }

    public double get_max (double weight, double reps){
        double max = 0;
        double intensity = 0;

        if (reps == 2){
            intensity = 0.97;
        }
        else if (reps == 3){
            intensity = 0.94;
        }
        else if (reps == 4){
            intensity = 0.92;
        }
        else if (reps == 5){
            intensity = 0.89;
        }
        else if (reps == 6){
            intensity = 0.86;
        }
        else if (reps == 7){
            intensity = 0.83;
        }
        else if (reps == 8){
            intensity = 0.81;
        }
        else if (reps == 9){
            intensity = 0.78;
        }
        else if (reps == 10){
            intensity = 0.75;
        }
        else if (reps == 11){
            intensity = 0.73;
        }
        else if (reps == 12){
            intensity = 0.71;
        }
        else if (reps == 13){
            intensity = 0.70;
        }
        else if (reps == 14){
            intensity = 0.68;
        }
        else if (reps == 15){
            intensity = 0.67;
        }
        else if (reps == 16){
            intensity = 0.65;
        }
        else if (reps == 17){
            intensity = 0.64;
        }
        else if (reps == 18){
            intensity = 0.63;
        }
        else if (reps == 19){
            intensity = 0.61;
        }
        else if (reps == 20){
            intensity = 0.60;
        }
        else if (reps == 21){
            intensity = 0.59;
        }
        else if (reps == 22){
            intensity = 0.58;
        }
        else if (reps == 23){
            intensity = 0.57;
        }
        else if (reps == 24){
            intensity = 0.56;
        }
        else if (reps == 25){
            intensity = 0.55;
        }
        else if (reps == 26){
            intensity = 0.54;
        }
        else if (reps == 27){
            intensity = 0.53;
        }
        else if (reps == 28){
            intensity = 0.52;
        }
        else if (reps == 29){
            intensity = 0.51;
        }
        else if (reps == 30){
            intensity = 0.50;
        }
        else { intensity = 0; }

        max = weight / intensity;

        return max;
    }


}
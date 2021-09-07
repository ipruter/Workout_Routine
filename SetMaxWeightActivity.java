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

    int front_squat;
    int dead_lift;
    int cal_push_up;
    int sit_up;
    int OA_push_up;
    int axel_press;
    int cal_pull_up;
    int OAI_row;
    int pull_up;
    int muscle_up;

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
    Button load_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        load_but = (Button)findViewById(R.id.calculate);
        save_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                front_squat = Integer.valueOf(FS_max_form.getText().toString());
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("squat_max", front_squat);
                editor.commit();
                front_squat = pref.getInt("squat_max", 0);
                String str_FS = Integer.toString(front_squat);
                tv1.setText(str_FS);

                dead_lift = Integer.valueOf(deadlift_max_form.getText().toString());
                editor.putInt("squat_max", dead_lift);
                editor.commit();
                dead_lift = pref.getInt("DL_max", 0);
                String str_DL = Integer.toString(dead_lift);
                tv2.setText(str_DL);

                cal_push_up = Integer.valueOf(cal_push_ups_form.getText().toString());
                editor.putInt("squat_max", cal_push_up);
                editor.commit();
                cal_push_up = pref.getInt("DL_max", 0);
                String str_CPushU = Integer.toString(cal_push_up);
                tv3.setText(str_CPushU);

                sit_up = Integer.valueOf(crunch_max_form.getText().toString());
                editor.putInt("squat_max", sit_up);
                editor.commit();
                sit_up = pref.getInt("DL_max", 0);
                String str_SU = Integer.toString(sit_up);
                tv4.setText(str_SU);

                OA_push_up = Integer.valueOf(OAP_form.getText().toString());
                editor.putInt("squat_max", OA_push_up);
                editor.commit();
                OA_push_up = pref.getInt("DL_max", 0);
                String str_OAPU = Integer.toString(OA_push_up);
                tv7.setText(str_OAPU);

                axel_press = Integer.valueOf(AP_max_form.getText().toString());
                editor.putInt("squat_max", axel_press);
                editor.commit();
                axel_press = pref.getInt("DL_max", 0);
                String str_AP = Integer.toString(axel_press);
                tv9.setText(str_AP);

                cal_pull_up = Integer.valueOf(cal_rows_form.getText().toString());
                editor.putInt("squat_max", cal_pull_up);
                editor.commit();
                cal_pull_up = pref.getInt("DL_max", 0);
                String str_CPullU = Integer.toString(cal_pull_up);
                tv5.setText(str_CPullU);

                OAI_row = Integer.valueOf(OAIR_max_form.getText().toString());
                editor.putInt("squat_max", OAI_row);
                editor.commit();
                OAI_row = pref.getInt("DL_max", 0);
                String str_OAIR = Integer.toString(OAI_row);
                tv6.setText(str_OAIR);

                pull_up = Integer.valueOf(PU_max_form.getText().toString());
                editor.putInt("squat_max", pull_up);
                editor.commit();
                pull_up = pref.getInt("DL_max", 0);
                String str_PU = Integer.toString(pull_up);
                tv8.setText(str_PU);

                muscle_up = Integer.valueOf(muscle_ups_form.getText().toString());
                editor.putInt("squat_max", muscle_up);
                editor.commit();
                muscle_up = pref.getInt("DL_max", 0);
                String str_MU = Integer.toString(muscle_up);
                tv10.setText(str_MU);
            }
        });




    }
}
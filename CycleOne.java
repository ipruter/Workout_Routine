package com.example.workout_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CycleOne extends AppCompatActivity {
    Button load_but;

    String front_squat = "0";
    String dead_lift = "0";
    String cal_push_up = "0";
    String sit_up = "0";
    String OA_push_up = "0";
    String axel_press = "0";
    String cal_pull_up = "0";
    String OAI_row = "0";
    String pull_up = "0";
    String muscle_up = "0";
    String pistol_squat = "0";

    double front_squat75;
    double dead_lift75;
    double cal_push_up75;
    double sit_up75;
    double OA_push_up75;
    double axel_press75;
    double cal_pull_up75;
    double OAI_row75;
    double pull_up75;
    double muscle_up75;
    double pistol_squat75;
    double front_squat83;
    double dead_lift83;
    double sit_up83;
    double OA_push_up83;
    double axel_press83;
    double OAI_row83;
    double pull_up83;
    double pistol_squat83;

    String str_max;
    double max;

    TextView tv_DL;
    TextView tv_FS;
    TextView tv_CPU;
    TextView tv_OAPU;
    TextView tv_OAPU2;
    TextView tv_AP;
    TextView tv_PS;
    TextView tv_OAIR;
    TextView tv_PU;
    TextView tv_SU;
    TextView tv_SU2;
    TextView tv_FS2;
    TextView tv_DL2;
    TextView tv_CR;
    TextView tv_AP2;
    TextView tv_OAIR2;
    TextView tv_MU;
    TextView tv_PU2;
    TextView tv_FS_rep;

    Button submit;
    CheckBox current_CB;
    CheckBox current_CB2;
    CheckBox current_CB3;
    CheckBox current_CB4;
    CheckBox current_CB5;
    CheckBox current_CB6;
    CheckBox current_CB7;
    CheckBox current_CB8;
    CheckBox current_CB9;
    CheckBox current_CB10;
    CheckBox current_CB11;
    CheckBox current_CB12;
    CheckBox current_CB13;
    CheckBox current_CB14;
    CheckBox current_CB15;
    CheckBox current_CB16;
    CheckBox current_CB17;
    CheckBox current_CB18;

    CheckBox OL_CB1;
    CheckBox OL_CB2;
    CheckBox OL_CB3;
    CheckBox OL_CB4;
    CheckBox OL_CB5;
    CheckBox OL_CB6;
    CheckBox OL_CB7;
    CheckBox OL_CB8;
    CheckBox OL_CB9;
    CheckBox OL_CB10;
    CheckBox OL_CB11;
    CheckBox OL_CB12;
    CheckBox OL_CB13;
    CheckBox OL_CB14;
    CheckBox OL_CB15;
    CheckBox OL_CB16;
    CheckBox OL_CB17;
    CheckBox OL_CB18;

    Button OL_DL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_one);

        submit = (Button) findViewById(R.id.submit);
        current_CB = (CheckBox) findViewById(R.id.current1);
        current_CB2 = (CheckBox) findViewById(R.id.current2);
        current_CB3 = (CheckBox) findViewById(R.id.current3);
        current_CB4 = (CheckBox) findViewById(R.id.current4);
        current_CB5 = (CheckBox) findViewById(R.id.current5);
        current_CB6 = (CheckBox) findViewById(R.id.current6);
        current_CB7 = (CheckBox) findViewById(R.id.current7);
        current_CB8 = (CheckBox) findViewById(R.id.current8);
        current_CB9 = (CheckBox) findViewById(R.id.current9);
        current_CB10 = (CheckBox) findViewById(R.id.current10);
        current_CB11 = (CheckBox) findViewById(R.id.current11);
        current_CB12 = (CheckBox) findViewById(R.id.current12);
        current_CB13 = (CheckBox) findViewById(R.id.current13);
        current_CB14 = (CheckBox) findViewById(R.id.current14);
        current_CB15 = (CheckBox) findViewById(R.id.current15);
        current_CB16 = (CheckBox) findViewById(R.id.current16);
        current_CB17 = (CheckBox) findViewById(R.id.current17);
        current_CB18 = (CheckBox) findViewById(R.id.current18);

        OL_CB1 = (CheckBox) findViewById(R.id.OL_CB1);
        OL_CB2 = (CheckBox) findViewById(R.id.OL_CB2);
        OL_CB3 = (CheckBox) findViewById(R.id.OL_CB3);
        OL_CB4 = (CheckBox) findViewById(R.id.OL_CB4);
        OL_CB5 = (CheckBox) findViewById(R.id.OL_CB5);
        OL_CB6 = (CheckBox) findViewById(R.id.OL_CB6);
        OL_CB7 = (CheckBox) findViewById(R.id.OL_CB7);
        OL_CB8 = (CheckBox) findViewById(R.id.OL_CB8);
        OL_CB9 = (CheckBox) findViewById(R.id.OL_CB9);
        OL_CB10 = (CheckBox) findViewById(R.id.OL_CB10);
        OL_CB11 = (CheckBox) findViewById(R.id.OL_CB11);
        OL_CB12 = (CheckBox) findViewById(R.id.OL_CB12);
        OL_CB13 = (CheckBox) findViewById(R.id.OL_CB13);
        OL_CB14 = (CheckBox) findViewById(R.id.OL_CB14);
        OL_CB15 = (CheckBox) findViewById(R.id.OL_CB15);
        OL_CB16 = (CheckBox) findViewById(R.id.OL_CB16);
        OL_CB17 = (CheckBox) findViewById(R.id.OL_CB17);
        OL_CB18 = (CheckBox) findViewById(R.id.OL_CB18);

        OL_DL = (Button) findViewById(R.id.OL1);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        current_CB.setChecked(pref.getBoolean("current_CB", false));
        current_CB2.setChecked(pref.getBoolean("current_CB2", false));
        current_CB3.setChecked(pref.getBoolean("current_CB3", false));
        current_CB4.setChecked(pref.getBoolean("current_CB4", false));
        current_CB5.setChecked(pref.getBoolean("current_CB5", false));
        current_CB6.setChecked(pref.getBoolean("current_CB6", false));
        current_CB7.setChecked(pref.getBoolean("current_CB7", false));
        current_CB8.setChecked(pref.getBoolean("current_CB8", false));
        current_CB9.setChecked(pref.getBoolean("current_CB9", false));
        current_CB10.setChecked(pref.getBoolean("current_CB10", false));
        current_CB11.setChecked(pref.getBoolean("current_CB11", false));
        current_CB12.setChecked(pref.getBoolean("current_CB12", false));
        current_CB13.setChecked(pref.getBoolean("current_CB13", false));
        current_CB14.setChecked(pref.getBoolean("current_CB14", false));
        current_CB15.setChecked(pref.getBoolean("current_CB15", false));
        current_CB16.setChecked(pref.getBoolean("current_CB16", false));
        current_CB17.setChecked(pref.getBoolean("current_CB17", false));
        current_CB18.setChecked(pref.getBoolean("current_CB18", false));

        OL_CB1.setChecked(pref.getBoolean("OL_CB1", false));
        OL_CB2.setChecked(pref.getBoolean("OL_CB2", false));
        OL_CB3.setChecked(pref.getBoolean("OL_CB3", false));
        OL_CB4.setChecked(pref.getBoolean("OL_CB4", false));
        OL_CB5.setChecked(pref.getBoolean("OL_CB5", false));
        OL_CB6.setChecked(pref.getBoolean("OL_CB6", false));
        OL_CB7.setChecked(pref.getBoolean("OL_CB7", false));
        OL_CB8.setChecked(pref.getBoolean("OL_CB8", false));
        OL_CB9.setChecked(pref.getBoolean("OL_CB9", false));
        OL_CB10.setChecked(pref.getBoolean("OL_CB10", false));
        OL_CB11.setChecked(pref.getBoolean("OL_CB11", false));
        OL_CB12.setChecked(pref.getBoolean("OL_CB12", false));
        OL_CB13.setChecked(pref.getBoolean("OL_CB13", false));
        OL_CB14.setChecked(pref.getBoolean("OL_CB14", false));
        OL_CB15.setChecked(pref.getBoolean("OL_CB15", false));
        OL_CB16.setChecked(pref.getBoolean("OL_CB16", false));
        OL_CB17.setChecked(pref.getBoolean("OL_CB17", false));
        OL_CB18.setChecked(pref.getBoolean("OL_CB18", false));

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                boolean checkBoxValue = current_CB.isChecked();
                editor.putBoolean("current_CB", checkBoxValue);
                editor.commit();

                boolean checkBoxValue2 = current_CB2.isChecked();
                editor.putBoolean("current_CB2", checkBoxValue2);
                editor.commit();

                boolean checkBoxValue3 = current_CB3.isChecked();
                editor.putBoolean("current_CB3", checkBoxValue3);
                editor.commit();

                boolean checkBoxValue4 = current_CB4.isChecked();
                editor.putBoolean("current_CB4", checkBoxValue4);
                editor.commit();

                boolean checkBoxValue5 = current_CB5.isChecked();
                editor.putBoolean("current_CB5", checkBoxValue5);
                editor.commit();

                boolean checkBoxValue6 = current_CB6.isChecked();
                editor.putBoolean("current_CB6", checkBoxValue6);
                editor.commit();

                boolean checkBoxValue7 = current_CB7.isChecked();
                editor.putBoolean("current_CB7", checkBoxValue7);
                editor.commit();

                boolean checkBoxValue8 = current_CB8.isChecked();
                editor.putBoolean("current_CB8", checkBoxValue8);
                editor.commit();

                boolean checkBoxValue9 = current_CB9.isChecked();
                editor.putBoolean("current_CB9", checkBoxValue9);
                editor.commit();

                boolean checkBoxValue10 = current_CB10.isChecked();
                editor.putBoolean("current_CB10", checkBoxValue10);
                editor.commit();

                boolean checkBoxValue11 = current_CB11.isChecked();
                editor.putBoolean("current_CB11", checkBoxValue11);
                editor.commit();

                boolean checkBoxValue12 = current_CB12.isChecked();
                editor.putBoolean("current_CB12", checkBoxValue12);
                editor.commit();

                boolean checkBoxValue13 = current_CB13.isChecked();
                editor.putBoolean("current_CB13", checkBoxValue13);
                editor.commit();

                boolean checkBoxValue14 = current_CB14.isChecked();
                editor.putBoolean("current_CB14", checkBoxValue14);
                editor.commit();

                boolean checkBoxValue15 = current_CB15.isChecked();
                editor.putBoolean("current_CB15", checkBoxValue15);
                editor.commit();

                boolean checkBoxValue16 = current_CB16.isChecked();
                editor.putBoolean("current_CB16", checkBoxValue16);
                editor.commit();

                boolean checkBoxValue17 = current_CB17.isChecked();
                editor.putBoolean("current_CB17", checkBoxValue17);
                editor.commit();

                boolean checkBoxValue18 = current_CB18.isChecked();
                editor.putBoolean("current_CB18", checkBoxValue18);
                editor.commit();

                boolean checkBoxValue19 = OL_CB1.isChecked();
                editor.putBoolean("OL_CB1", checkBoxValue19);
                editor.commit();

                boolean checkBoxValue20 = OL_CB2.isChecked();
                editor.putBoolean("OL_CB2", checkBoxValue20);
                editor.commit();

                boolean checkBoxValue21 = OL_CB3.isChecked();
                editor.putBoolean("OL_CB3", checkBoxValue21);
                editor.commit();

                boolean checkBoxValue22 = OL_CB4.isChecked();
                editor.putBoolean("OL_CB4", checkBoxValue22);
                editor.commit();

                boolean checkBoxValue23 = OL_CB5.isChecked();
                editor.putBoolean("OL_CB5", checkBoxValue23);
                editor.commit();

                boolean checkBoxValue24 = OL_CB6.isChecked();
                editor.putBoolean("OL_CB6", checkBoxValue24);
                editor.commit();

                boolean checkBoxValue25 = OL_CB7.isChecked();
                editor.putBoolean("OL_CB7", checkBoxValue25);
                editor.commit();

                boolean checkBoxValue26 = OL_CB8.isChecked();
                editor.putBoolean("OL_CB8", checkBoxValue26);
                editor.commit();

                boolean checkBoxValue27 = OL_CB9.isChecked();
                editor.putBoolean("OL_CB9", checkBoxValue27);
                editor.commit();

                boolean checkBoxValue28 = OL_CB10.isChecked();
                editor.putBoolean("OL_CB10", checkBoxValue28);
                editor.commit();

                boolean checkBoxValue29 = OL_CB11.isChecked();
                editor.putBoolean("OL_CB11", checkBoxValue29);
                editor.commit();

                boolean checkBoxValue30 = OL_CB12.isChecked();
                editor.putBoolean("OL_CB12", checkBoxValue30);
                editor.commit();

                boolean checkBoxValue31 = OL_CB13.isChecked();
                editor.putBoolean("OL_CB13", checkBoxValue31);
                editor.commit();

                boolean checkBoxValue32 = OL_CB14.isChecked();
                editor.putBoolean("OL_CB14", checkBoxValue32);
                editor.commit();

                boolean checkBoxValue33 = OL_CB15.isChecked();
                editor.putBoolean("OL_CB15", checkBoxValue33);
                editor.commit();

                boolean checkBoxValue34 = OL_CB16.isChecked();
                editor.putBoolean("OL_CB16", checkBoxValue34);
                editor.commit();

                boolean checkBoxValue35 = OL_CB17.isChecked();
                editor.putBoolean("OL_CB17", checkBoxValue35);
                editor.commit();

                boolean checkBoxValue36 = OL_CB18.isChecked();
                editor.putBoolean("OL_CB18", checkBoxValue36);
                editor.commit();

                current_CB.setChecked(pref.getBoolean("current_CB", false));
                current_CB2.setChecked(pref.getBoolean("current_CB2", false));
                current_CB3.setChecked(pref.getBoolean("current_CB3", false));
                current_CB4.setChecked(pref.getBoolean("current_CB4", false));
                current_CB5.setChecked(pref.getBoolean("current_CB5", false));
                current_CB6.setChecked(pref.getBoolean("current_CB6", false));
                current_CB7.setChecked(pref.getBoolean("current_CB7", false));
                current_CB8.setChecked(pref.getBoolean("current_CB8", false));
                current_CB9.setChecked(pref.getBoolean("current_CB9", false));
                current_CB10.setChecked(pref.getBoolean("current_CB10", false));
                current_CB11.setChecked(pref.getBoolean("current_CB11", false));
                current_CB12.setChecked(pref.getBoolean("current_CB12", false));
                current_CB13.setChecked(pref.getBoolean("current_CB13", false));
                current_CB14.setChecked(pref.getBoolean("current_CB14", false));
                current_CB15.setChecked(pref.getBoolean("current_CB15", false));
                current_CB16.setChecked(pref.getBoolean("current_CB16", false));
                current_CB17.setChecked(pref.getBoolean("current_CB17", false));
                current_CB18.setChecked(pref.getBoolean("current_CB18", false));

                OL_CB1.setChecked(pref.getBoolean("OL_CB1", false));
                OL_CB2.setChecked(pref.getBoolean("OL_CB2", false));
                OL_CB3.setChecked(pref.getBoolean("OL_CB3", false));
                OL_CB4.setChecked(pref.getBoolean("OL_CB4", false));
                OL_CB5.setChecked(pref.getBoolean("OL_CB5", false));
                OL_CB6.setChecked(pref.getBoolean("OL_CB6", false));
                OL_CB7.setChecked(pref.getBoolean("OL_CB7", false));
                OL_CB8.setChecked(pref.getBoolean("OL_CB8", false));
                OL_CB9.setChecked(pref.getBoolean("OL_CB9", false));
                OL_CB10.setChecked(pref.getBoolean("OL_CB10", false));
                OL_CB11.setChecked(pref.getBoolean("OL_CB11", false));
                OL_CB12.setChecked(pref.getBoolean("OL_CB12", false));
                OL_CB13.setChecked(pref.getBoolean("OL_CB13", false));
                OL_CB14.setChecked(pref.getBoolean("OL_CB14", false));
                OL_CB15.setChecked(pref.getBoolean("OL_CB15", false));
                OL_CB16.setChecked(pref.getBoolean("OL_CB16", false));
                OL_CB17.setChecked(pref.getBoolean("OL_CB17", false));
                OL_CB18.setChecked(pref.getBoolean("OL_CB18", false));
            }
        });

        OL_DL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                str_max = pref.getString("DL_max", "0");
                max = Double.parseDouble(str_max);
                max = overload(max);
                str_max = String.valueOf(max);
                editor.putString("DL_max", str_max);
                editor.commit();
            }
        });
        tv_DL = (TextView)findViewById(R.id.wt_dl);
        tv_FS = (TextView)findViewById(R.id.wt_fs);
        tv_CPU = (TextView)findViewById(R.id.wt_CPU);
        tv_OAPU = (TextView)findViewById(R.id.wt_OAPU);
        tv_OAPU2 = (TextView)findViewById(R.id.wt_OAPU2);
        tv_AP = (TextView)findViewById(R.id.wt_AP);
        tv_PS = (TextView)findViewById(R.id.wt_PS);
        tv_OAIR = (TextView)findViewById(R.id.wt_OAIR);
        tv_PU = (TextView)findViewById(R.id.wt_PU);
        tv_SU = (TextView)findViewById(R.id.wt_SU);
        tv_SU2 = (TextView)findViewById(R.id.wt_SU2);
        tv_FS2 = (TextView)findViewById(R.id.wt_FS2);
        tv_DL2 = (TextView)findViewById(R.id.wt_DL2);
        tv_CR = (TextView)findViewById(R.id.wt_CR);
        tv_AP2 = (TextView)findViewById(R.id.wt_AP2);
        tv_PU2 = (TextView)findViewById(R.id.wt_PU2);
        tv_OAIR2 = (TextView)findViewById(R.id.wt_OAIR2);
        tv_MU = (TextView)findViewById(R.id.wt_MU);

        TextView tv_DL_rep = (TextView)findViewById(R.id.reps_DL);
        tv_FS_rep = (TextView)findViewById(R.id.reps_FS);
        TextView tv_CPU_rep = (TextView)findViewById(R.id.reps_CPushU);
        TextView tv_OAPU_rep = (TextView)findViewById(R.id.reps_OAPU);
        TextView tv_OAPU2_rep = (TextView)findViewById(R.id.reps_OAPU2);
        TextView tv_AP_rep = (TextView)findViewById(R.id.reps_AP);
        TextView tv_PS_rep = (TextView)findViewById(R.id.reps_PS);
        TextView tv_OAIR_rep = (TextView)findViewById(R.id.reps_OAIR);
        TextView tv_PU_rep = (TextView)findViewById(R.id.reps_PU);
        TextView tv_SU_rep = (TextView)findViewById(R.id.reps_SU);
        TextView tv_SU2_rep = (TextView)findViewById(R.id.reps_SU2);
        TextView tv_FS2_rep = (TextView)findViewById(R.id.reps_FS2);
        TextView tv_DL2_rep = (TextView)findViewById(R.id.reps_DL2);
        TextView tv_CR_rep = (TextView)findViewById(R.id.reps_CR);
        TextView tv_AP2_rep = (TextView)findViewById(R.id.reps_AP2);
        TextView tv_PU2_rep = (TextView)findViewById(R.id.reps_PU2);
        TextView tv_OAIR2_rep = (TextView)findViewById(R.id.reps_OAIR2);
        TextView tv_MU_rep = (TextView)findViewById(R.id.reps_MU);

        TextView tv_DL_int = (TextView)findViewById(R.id.int_DL);
        TextView tv_FS_int = (TextView)findViewById(R.id.int_FS);
        TextView tv_CPU_int = (TextView)findViewById(R.id.int_CPushU);
        TextView tv_OAPU_int = (TextView)findViewById(R.id.int_OAPU);
        TextView tv_OAPU2_int = (TextView)findViewById(R.id.int_OAPU2);
        TextView tv_AP_int = (TextView)findViewById(R.id.int_AP);
        TextView tv_PS_int = (TextView)findViewById(R.id.int_PS);
        TextView tv_OAIR_int = (TextView)findViewById(R.id.int_OAIR);
        TextView tv_PU_int = (TextView)findViewById(R.id.int_PU);
        TextView tv_SU_int = (TextView)findViewById(R.id.int_SU);
        TextView tv_SU2_int = (TextView)findViewById(R.id.int_SU2);
        TextView tv_FS2_int = (TextView)findViewById(R.id.int_FS2);
        TextView tv_DL2_int = (TextView)findViewById(R.id.int_DL2);
        TextView tv_CR_int = (TextView)findViewById(R.id.int_CR);
        TextView tv_AP2_int = (TextView)findViewById(R.id.int_AP2);
        TextView tv_PU2_int = (TextView)findViewById(R.id.int_PU2);
        TextView tv_OAIR2_int = (TextView)findViewById(R.id.int_OAIR2);
        TextView tv_MU_int = (TextView)findViewById(R.id.int_MU);

        DecimalFormat df = new DecimalFormat("###.#");

        String str_body_weight = pref.getString("body_weight", "0");

        double body_weight = Double.parseDouble(str_body_weight);

        if(body_weight == 0){
            body_weight = 200;
        }

        front_squat = pref.getString("squat_max", "0");
        double squat_max = Double.parseDouble(front_squat);

        if(front_squat == "0"){
            tv_FS.setText(String.valueOf("0"));
            tv_FS2.setText(String.valueOf("0"));
        }
        else {
            front_squat75 = Double.parseDouble(front_squat) * 0.75;

            if(body_weight > front_squat75){
                tv_FS_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, squat_max)))));
                tv_FS_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, squat_max))))));
                tv_FS.setText(String.valueOf(df.format(body_weight)));
            }
            else{
                front_squat75 = squat_body_weight(body_weight, front_squat75);
                front_squat75 = round_five(front_squat75);
                tv_FS.setText(String.valueOf(df.format(front_squat75)));
                tv_FS_rep.setText("10");
            }
            front_squat83 = Double.parseDouble(front_squat) * 0.83;

            if(body_weight > front_squat83){
                tv_FS2_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, squat_max)))));
                tv_FS2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, squat_max))))));
                tv_FS2.setText(String.valueOf(df.format(body_weight)));
            }

            else {
                front_squat83 = squat_body_weight(body_weight, front_squat83);
                front_squat83 = round_five(front_squat83);
                tv_FS2.setText(String.valueOf(df.format(front_squat83)));
                tv_FS2_rep.setText("10");
            }
        }

        dead_lift = pref.getString("DL_max", "0");
        double deadlift_max = Double.parseDouble(dead_lift);

        if(dead_lift == "0"){
            tv_DL.setText(String.valueOf("0"));
            tv_DL2.setText(String.valueOf("0"));
        }
        else {
            dead_lift75 = Double.parseDouble(dead_lift) * 0.75;

            if(body_weight > dead_lift75){
                tv_DL_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, deadlift_max)))));
                tv_DL_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, deadlift_max))))));
                tv_DL.setText(String.valueOf(df.format(body_weight)));
            }
            else{
                dead_lift75 = squat_body_weight(body_weight, dead_lift75);
                dead_lift75 = round_five(dead_lift75);
                tv_DL.setText(String.valueOf(df.format(dead_lift75)));
                tv_DL_rep.setText("10");
            }
            dead_lift83 = Double.parseDouble(dead_lift) * 0.83;

            if(body_weight > dead_lift83){
                tv_DL2_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, deadlift_max)))));
                tv_DL2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, deadlift_max))))));
                tv_DL2.setText(String.valueOf(df.format(body_weight)));
            }

            else {
                dead_lift83 = squat_body_weight(body_weight, dead_lift83);
                dead_lift83 = round_five(dead_lift83);
                tv_DL2.setText(String.valueOf(df.format(dead_lift83)));
                tv_DL2_rep.setText("10");
            }
        }

        cal_push_up = pref.getString("CPushU_max", "0");
        double cal_push_up_max = Double.parseDouble(cal_push_up);

        if(cal_push_up == "0"){
            tv_CPU.setText(String.valueOf("0"));
        }
        else {
            tv_CPU_int.setText(String.valueOf(Math.round(get_pullup_intensity(body_weight, cal_push_up_max))));
            tv_CPU_rep.setText(String.valueOf(get_reps(Math.round(get_pullup_intensity(body_weight, cal_push_up_max)))));
            tv_CPU.setText(String.valueOf(df.format(body_weight)));
        }
        sit_up = pref.getString("SU_max", "0");
        double sit_up_max = Double.parseDouble(sit_up);

        if(sit_up == "0"){
            tv_SU.setText(String.valueOf("0"));
            tv_SU2.setText(String.valueOf("0"));
        }
        else {
            sit_up75 = Double.parseDouble(sit_up) * 0.75;

            if(body_weight > sit_up75){
                tv_SU_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, sit_up_max)))));
                tv_SU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, sit_up_max))))));
                tv_SU.setText(String.valueOf(df.format(body_weight)));
            }
            else{
                sit_up75 = pushup_body_weight(body_weight, sit_up75);
                sit_up75 = round_five(sit_up75);
                tv_SU.setText(String.valueOf(df.format(sit_up75)));
                tv_SU_rep.setText("10");
            }
            sit_up83 = Double.parseDouble(sit_up) * 0.83;

            if(body_weight > sit_up83){
                tv_SU2_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, sit_up_max)))));
                tv_SU2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, sit_up_max))))));
                tv_SU2.setText(String.valueOf(df.format(body_weight)));
            }

            else {
                sit_up83 = pushup_body_weight(body_weight, sit_up83);
                sit_up83 = round_five(sit_up83);
                tv_SU2.setText(String.valueOf(df.format(sit_up83)));
                tv_SU2_rep.setText("10");
            }
        }
        OA_push_up = pref.getString("OAP_max", "0");
        double OA_push_up_max = Double.parseDouble(OA_push_up);

        if(OA_push_up == "0"){
            tv_OAPU.setText(String.valueOf("0"));
            tv_OAPU2.setText(String.valueOf("0"));
        }
        else {
            OA_push_up75 = Double.parseDouble(OA_push_up) * 0.75;

            if(body_weight > OA_push_up75){
                tv_OAPU_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, OA_push_up_max)))));
                tv_OAPU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, OA_push_up_max))))));
                tv_OAPU.setText(String.valueOf(df.format(body_weight)));
            }
            else{
                OA_push_up75 = pushup_body_weight(body_weight, OA_push_up75);
                OA_push_up75 = round_five(OA_push_up75);
                tv_OAPU.setText(String.valueOf(df.format(OA_push_up75)));
                tv_OAPU_rep.setText("10");
            }
            OA_push_up83 = Double.parseDouble(OA_push_up) * 0.83;

            if(body_weight > OA_push_up83){
                tv_OAPU2_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, sit_up_max)))));
                tv_OAPU2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, sit_up_max))))));
                tv_OAPU2.setText(String.valueOf(df.format(body_weight)));
            }

            else {
                OA_push_up83 = pushup_body_weight(body_weight, OA_push_up83);
                OA_push_up83 = round_five(OA_push_up83);
                tv_OAPU2.setText(String.valueOf(df.format(OA_push_up83)));
                tv_OAPU2_rep.setText("10");
            }
        }
        axel_press = pref.getString("AP_max", "0");
        double axel_press_max = Double.parseDouble(axel_press);

        if(axel_press == "0"){
            tv_AP.setText(String.valueOf("0"));
            tv_AP2.setText(String.valueOf("0"));
        }
        else {
            axel_press75 = Double.parseDouble(axel_press) * 0.75;
            axel_press75 = round_five(axel_press75);
            tv_AP.setText(String.valueOf(df.format(axel_press75)));
            tv_AP_rep.setText("10");

            axel_press83 = Double.parseDouble(axel_press) * 0.83;
            axel_press83 = round_five(axel_press83);
            tv_AP2.setText(String.valueOf(df.format(axel_press83)));
            tv_AP2_rep.setText("10");
        }

        cal_pull_up = pref.getString("CPullU_max", "0");
        double cal_pull_up_max = Double.parseDouble(cal_pull_up);

        if(cal_pull_up == "0"){
            tv_CR.setText(String.valueOf("0"));
        }
        else {
            tv_CR_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, cal_pull_up_max)))));
            tv_CR_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, cal_pull_up_max))))));
            tv_CR.setText(String.valueOf(df.format(body_weight)));
        }
        OAI_row = pref.getString("OAIR_max", "0");
        double OAI_row_max = Double.parseDouble(OAI_row);

        if(OAI_row == "0"){
            tv_OAIR.setText(String.valueOf("0"));
            tv_OAIR2.setText(String.valueOf("0"));
        }
        else {
            OAI_row75 = Double.parseDouble(OAI_row) * 0.75;

            if(body_weight > OAI_row75){
                tv_OAIR_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, OAI_row_max)))));
                tv_OAIR_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, OAI_row_max))))));
                tv_OAIR.setText(String.valueOf(df.format(body_weight)));
            }
            else{
                OAI_row75 = pushup_body_weight(body_weight, OAI_row75);
                OAI_row75 = round_five(OAI_row75);
                tv_OAIR.setText(String.valueOf(df.format(OAI_row75)));
                tv_OAIR_rep.setText("10");
            }
            OAI_row83 = Double.parseDouble(OAI_row) * 0.83;

            if(body_weight > OAI_row83){
                tv_OAIR2_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, OAI_row_max)))));
                tv_OAIR2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, OAI_row_max))))));
                tv_OAIR2.setText(String.valueOf(df.format(body_weight)));
            }

            else {
                OAI_row83 = pushup_body_weight(body_weight, OAI_row83);
                OAI_row83 = round_five(OAI_row83);
                tv_OAIR2.setText(String.valueOf(df.format(OAI_row83)));
                tv_OAIR2_rep.setText("10");
            }
        }
        pull_up = pref.getString("PU_max", "0");
        double pull_up_max = Double.parseDouble(pull_up);

        if(pull_up == "0"){
            tv_PU.setText(String.valueOf("0"));
            tv_PU2.setText(String.valueOf("0"));
        }
        else {
            pull_up75 = Double.parseDouble(pull_up) * 0.75;

            if(body_weight > pull_up75){
                tv_PU_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, pull_up_max)))));
                tv_PU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, pull_up_max))))));
                tv_PU.setText(String.valueOf(df.format(body_weight)));
            }
            else{
                pull_up75 = pullup_body_weight(body_weight, pull_up75);
                pull_up75 = round_five(pull_up75);
                tv_PU.setText(String.valueOf(df.format(pull_up75)));
                tv_PU_rep.setText("10");
            }
            pull_up83 = Double.parseDouble(pull_up) * 0.83;

            if(body_weight > pull_up83){
                tv_PU2_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, pull_up_max)))));
                tv_PU2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, pull_up_max))))));
                tv_PU2.setText(String.valueOf(df.format(body_weight)));
            }

            else {
                pull_up83 = pullup_body_weight(body_weight, pull_up83);
                pull_up83 = round_five(pull_up83);
                tv_PU2.setText(String.valueOf(df.format(pull_up83)));
                tv_PU2_rep.setText("10");
            }
        }
        muscle_up = pref.getString("MU_max", "0");
        double muscle_up_max = Double.parseDouble(muscle_up);

        if(muscle_up == "0"){
            tv_MU.setText(String.valueOf("0"));
        }
        else {
            tv_MU_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, muscle_up_max)))));
            tv_MU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, muscle_up_max))))));
            tv_MU.setText(String.valueOf(df.format(body_weight)));
        }

        pistol_squat = pref.getString("PS_max", "0");
        double pistol_squat_max = Double.parseDouble(pistol_squat);

        if(pistol_squat == "0"){
        tv_PS.setText(String.valueOf("0"));
    }
        else {
            pistol_squat75 = Double.parseDouble(pistol_squat) * 0.75;

        if(body_weight > pistol_squat75){
            tv_PS_int.setText(String.valueOf(df.format(Math.round(pistol_get_squat_intensity(body_weight, pistol_squat_max)))));
            tv_PS_rep.setText(String.valueOf(df.format(get_reps(Math.round(pistol_get_squat_intensity(body_weight, pistol_squat_max))))));
            tv_PS.setText(String.valueOf(df.format(body_weight)));
        }
        else{
            pistol_squat75 = pistol_squat_body_weight(body_weight, pistol_squat75);
            pistol_squat75 = round_five(pistol_squat75);
            tv_PS.setText(String.valueOf(df.format(pistol_squat75)));
            tv_PS_rep.setText("10");
        }
    }
    }

    double round_five(double real_weight){
        double mod_five = real_weight % 5;
        if (mod_five < 2.5){
            real_weight = real_weight - mod_five;
        }
        else if (mod_five >= 2.5){
            real_weight = real_weight - mod_five + 5;
        }
        return real_weight;
    }
    double round_two_point_five(double real_weight){
        double mod_five = real_weight % 2.5;
        if (mod_five < 1.25){
            real_weight = real_weight - mod_five;
        }
        else if (mod_five >= 1.25){
            real_weight = real_weight - mod_five + 2.5;
        }
        return real_weight;
    }

    double get_reps(double intensity){
        double reps = 0;
        intensity = intensity / 100;

        if (intensity > 0.97){
            reps = 1;
        }
        else if (intensity <= 0.97 && intensity > 0.94){
            reps = 2;
        }
        else if (intensity <= 0.94 && intensity > 0.92){
            reps = 3;
        }
        else if (intensity <= 0.92 && intensity > 0.89){
            reps = 4;
        }
        else if (intensity <= 0.89 && intensity > 0.86){
            reps = 5;
        }
        else if (intensity <= 0.86 && intensity > 0.83){
            reps = 6;
        }
        else if (intensity <= 0.83 && intensity > 0.81){
            reps = 7;
        }else if (intensity <= 0.81 && intensity > 0.78){
            reps = 8;
        }
        else if (intensity <= 0.78 && intensity > 0.75){
            reps = 9;
        }else if (intensity <= 0.75 && intensity > 0.73){
            reps = 10;
        }
        else if (intensity <= 0.73 && intensity > 0.71){
            reps = 11;
        }
        else if (intensity <= 0.71 && intensity > 0.70){
            reps = 12;
        }
        else if (intensity <= 0.70 && intensity > 0.68){
            reps = 13;
        }
        else if (intensity <= 0.68 && intensity > 0.67){
            reps = 14;
        }
        else if (intensity <= 0.67 && intensity > 0.65){
            reps = 15;
        }
        else if (intensity <= 0.65 && intensity > 0.64){
            reps = 16;
        }
        else if (intensity <= 0.64 && intensity > 0.63){
            reps = 17;
        }
        else if (intensity <= 0.63 && intensity > 0.61){
            reps = 18;
        }
        else if (intensity <= 0.61 && intensity > 0.60){
            reps = 19;
        }
        else if (intensity <= 0.60 && intensity > 0.59){
            reps = 20;
        }
        else if (intensity <= 0.59 && intensity > 0.58){
            reps = 21;
        }
        else if (intensity <= 0.58 && intensity > 0.57){
            reps = 22;
        }
        else if (intensity <= 0.57 && intensity > 0.56){
            reps = 23;
        }
        else if (intensity <= 0.56 && intensity > 0.55){
            reps = 24;
        }
        else if (intensity <= 0.55 && intensity > 0.54){
            reps = 25;
        }
        else if (intensity <= 0.54 && intensity > 0.53){
            reps = 26;
        }
        else if (intensity <= 0.53 && intensity > 0.52){
            reps = 27;
        }
        else if (intensity <= 0.52 && intensity > 0.51){
            reps = 28;
        }
        else if (intensity <= 0.51 && intensity > 0.50){
            reps = 29;
        }
        else if (intensity <= 0.50){
            reps = 30;
        }
        else { reps = 0; }


        return reps;
    }

    double squat_body_weight(double body_weight, double weight){
        double new_weight = 0;
        double squat_body_weight = 0;
        squat_body_weight = body_weight * 0.72;
        new_weight = weight - squat_body_weight;
        if (new_weight < 0){
            new_weight = 0;
        }
        return new_weight;
    }

    double get_squat_intensity(double body_weight, double max){
        double new_intensity = 0;
        double squat_body_weight = 0;
        squat_body_weight = body_weight * 0.72;
        new_intensity = squat_body_weight / max;
        new_intensity = new_intensity * 100;
        return new_intensity;
    }

    double pushup_body_weight(double body_weight, double weight){
        double new_weight = 0;
        double pushup_body_weight = 0;
        pushup_body_weight = body_weight * 0.5;
        new_weight = weight - pushup_body_weight;
        if (new_weight < 0){
            new_weight = 0;
        }
        return new_weight;
    }

    double get_pushup_intensity(double body_weight, double max){
        double new_intensity = 0;
        double pushup_body_weight = 0;
        pushup_body_weight = body_weight * 0.5;
        new_intensity = pushup_body_weight / max;
        new_intensity = new_intensity * 100;
        return new_intensity;
    }

    double pullup_body_weight(double body_weight, double weight){
        double new_weight = 0;
        new_weight = weight - body_weight;
        if (new_weight < 0){
            new_weight = 0;
        }
        return new_weight;
    }

    double get_pullup_intensity(double body_weight, double max){
        double new_intensity = 0;
        new_intensity = body_weight / max;
        new_intensity = new_intensity * 100;;
        return new_intensity;
    }

    double pistol_squat_body_weight(double body_weight, double weight){
        double new_weight = 0;
        double pistol_squat_body_weight = 0;
        pistol_squat_body_weight = body_weight * 0.86;
        new_weight = weight - pistol_squat_body_weight;
        if (new_weight < 0){
            new_weight = 0;
        }
        return new_weight;
    }

    double pistol_get_squat_intensity(double body_weight, double max){
        double new_intensity = 0;
        double pistol_squat_body_weight = 0;
        pistol_squat_body_weight = body_weight * 0.86;
        new_intensity = pistol_squat_body_weight / max;
        new_intensity = new_intensity * 100;
        return new_intensity;
    }

    double overload(double max){
        double new_max = 0;
        new_max = (max * 0.05) + max;

        return new_max;
    }

}
package com.example.workout_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    double front_squat83;
    double dead_lift83;
    double sit_up83;
    double OA_push_up83;
    double axel_press83;
    double OAI_row83;
    double pull_up83;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_one);
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
        tv_PU = (TextView)findViewById(R.id.wt_PU);
        tv_PU2 = (TextView)findViewById(R.id.wt_PU2);
        tv_OAIR2 = (TextView)findViewById(R.id.wt_OAIR2);
        tv_MU = (TextView)findViewById(R.id.wt_MU);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();

        front_squat = pref.getString("squat_max", "0");
        if(front_squat == null){
            tv_FS.setText(String.valueOf("0"));
            tv_FS2.setText(String.valueOf("0"));
        }
        else {
            front_squat75 = Double.parseDouble(front_squat) * 0.75;
            front_squat83 = Double.parseDouble(front_squat) * 0.83;
            tv_FS.setText(String.valueOf(front_squat75));
            tv_FS2.setText(String.valueOf(front_squat83));
        }

        dead_lift = pref.getString("DL_max", "0");

        if(dead_lift == null){
            tv_DL.setText(String.valueOf("0"));
            tv_DL2.setText(String.valueOf("0"));
        }
        else {
            dead_lift75 = Double.parseDouble(dead_lift) * 0.75;
            dead_lift83 = Double.parseDouble(dead_lift) * 0.83;
            tv_DL.setText(String.valueOf(dead_lift75));
            tv_DL2.setText(String.valueOf(dead_lift83));

        }
        cal_push_up = pref.getString("CPushU_max", "0");

        if(cal_push_up == null){
            tv_CPU.setText(String.valueOf("0"));
        }
        else {
            cal_push_up75 = Double.parseDouble(cal_push_up) * 0.75;
            tv_CPU.setText(String.valueOf(cal_push_up75));
        }
        sit_up = pref.getString("SU_max", "0");

        if(sit_up == null){
            tv_SU.setText(String.valueOf("0"));
            tv_SU2.setText(String.valueOf("0"));
        }
        else {
            sit_up75 = Double.parseDouble(sit_up) * 0.75;
            sit_up83 = Double.parseDouble(sit_up) * 0.83;
            tv_SU.setText(String.valueOf(sit_up75));
            tv_SU2.setText(String.valueOf(sit_up83));
        }
        OA_push_up = pref.getString("OAP_max", "0");

        if(OA_push_up == null){
            tv_OAPU.setText(String.valueOf("0"));
            tv_OAPU2.setText(String.valueOf("0"));
        }
        else {
            OA_push_up75 = Double.parseDouble(OA_push_up) * 0.75;
            OA_push_up83 = Double.parseDouble(OA_push_up) * 0.83;
            tv_OAPU.setText(String.valueOf(OA_push_up75));
            tv_OAPU2.setText(String.valueOf(OA_push_up75));
        }
        axel_press = pref.getString("AP_max", "0");

        if(axel_press == null){
            tv_AP.setText(String.valueOf("0"));
            tv_AP2.setText(String.valueOf("0"));
        }
        else {
            axel_press75 = Double.parseDouble(axel_press) * 0.75;
            axel_press83 = Double.parseDouble(axel_press) * 0.83;
            tv_AP.setText(String.valueOf(axel_press75));
            tv_AP2.setText(String.valueOf(axel_press83));
        }
        cal_pull_up = pref.getString("CPullU_max", "0");
        if(cal_pull_up == null){
            tv_CR.setText(String.valueOf("0"));
        }
        else {
            cal_pull_up75 = Double.parseDouble(cal_pull_up) * 0.75;
            tv_CR.setText(String.valueOf(cal_pull_up75));
        }
        OAI_row = pref.getString("OAIR_max", "0");
        if(OAI_row == null){
            tv_OAIR.setText(String.valueOf("0"));
            tv_OAIR2.setText(String.valueOf("0"));
        }
        else {
            OAI_row75 = Double.parseDouble(OAI_row) * 0.75;
            OAI_row83 = Double.parseDouble(OAI_row) * 0.83;
            tv_OAIR.setText(String.valueOf(OAI_row75));
            tv_OAIR2.setText(String.valueOf(OAI_row83));
        }
        pull_up = pref.getString("PU_max", "0");
        if(pull_up == null){
            tv_PU.setText(String.valueOf("0"));
            tv_PU2.setText(String.valueOf("0"));
        }
        else {
            pull_up75 = Double.parseDouble(pull_up) * 0.75;
            pull_up83 = Double.parseDouble(pull_up) * 0.83;
            tv_PU.setText(String.valueOf(pull_up75));
            tv_PU2.setText(String.valueOf(pull_up83));
        }
        muscle_up = pref.getString("MU_max", "0");
        if(muscle_up == null){
            tv_MU.setText(String.valueOf("0"));
        }
        else {
            muscle_up75 = Double.parseDouble(muscle_up) * 0.75;
            tv_MU.setText(String.valueOf(muscle_up75));
        }
    }
}
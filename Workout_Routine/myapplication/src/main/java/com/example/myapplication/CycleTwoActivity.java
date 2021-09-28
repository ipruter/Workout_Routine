package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.text.DecimalFormat;

// Class for the first workout cycle
public class CycleTwoActivity extends AppCompatActivity {

    // Variables
    String front_squat = "0", dead_lift = "0", cal_push_up = "0", sit_up = "0", OA_push_up = "0", axel_press = "0", cal_pull_up = "0", OAI_row = "0", pull_up = "0", muscle_up = "0", pistol_squat = "0";
    double front_squat75, dead_lift75, sit_up75, OA_push_up75, axel_press75, OAI_row75, pull_up75, pistol_squat75, front_squat83, dead_lift83, sit_up83, OA_push_up83, axel_press83, OAI_row83, pull_up83;
    TextView tv_DL, tv_FS, tv_CPU, tv_OAPU, tv_OAPU2, tv_AP, tv_PS, tv_OAIR, tv_PU, tv_SU, tv_SU2, tv_FS2, tv_DL2, tv_CR, tv_AP2, tv_OAIR2, tv_MU, tv_PU2, tv_FS_rep;
    Button submit;
    CheckBox current_CB, current_CB2, current_CB3, current_CB4, current_CB5, current_CB6, current_CB7, current_CB8, current_CB9, current_CB10, current_CB11, current_CB12, current_CB13, current_CB14, current_CB15, current_CB16, current_CB17, current_CB18;
    CheckBox OL_CB1, OL_CB2, OL_CB3, OL_CB4, OL_CB5, OL_CB6, OL_CB7, OL_CB8, OL_CB9, OL_CB10, OL_CB11, OL_CB12, OL_CB13, OL_CB14, OL_CB15, OL_CB16, OL_CB17, OL_CB18;

    // Runs methods when corresponding XML file loads
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_two);

        // Assigns variables buttons and checkboxes
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
        OL_CB3 = (CheckBox) findViewById(R.id.OL_CB3);
        OL_CB4 = (CheckBox) findViewById(R.id.OL_CB4);
        OL_CB6 = (CheckBox) findViewById(R.id.OL_CB6);
        OL_CB7 = (CheckBox) findViewById(R.id.OL_CB7);
        OL_CB10 = (CheckBox) findViewById(R.id.OL_CB10);
        OL_CB12 = (CheckBox) findViewById(R.id.OL_CB12);
        OL_CB13 = (CheckBox) findViewById(R.id.OL_CB13);
        OL_CB15 = (CheckBox) findViewById(R.id.OL_CB15);
        OL_CB16 = (CheckBox) findViewById(R.id.OL_CB16);
        OL_CB18 = (CheckBox) findViewById(R.id.OL_CB18);

        // Creates preferenceManager and Editor objects for saving data.
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();

        // Gets Boolean values from checkboxes
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
        OL_CB3.setChecked(pref.getBoolean("OL_CB3", false));
        OL_CB4.setChecked(pref.getBoolean("OL_CB4", false));
        OL_CB6.setChecked(pref.getBoolean("OL_CB6", false));
        OL_CB7.setChecked(pref.getBoolean("OL_CB7", false));
        OL_CB10.setChecked(pref.getBoolean("OL_CB10", false));
        OL_CB12.setChecked(pref.getBoolean("OL_CB12", false));
        OL_CB13.setChecked(pref.getBoolean("OL_CB13", false));
        OL_CB15.setChecked(pref.getBoolean("OL_CB15", false));
        OL_CB16.setChecked(pref.getBoolean("OL_CB16", false));
        OL_CB18.setChecked(pref.getBoolean("OL_CB18", false));

        // Performs actions when submit button is pressed
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = pref.edit();

                // Saves the states of checkboxes
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
                boolean checkBoxValue21 = OL_CB3.isChecked();
                editor.putBoolean("OL_CB3", checkBoxValue21);
                editor.commit();
                boolean checkBoxValue22 = OL_CB4.isChecked();
                editor.putBoolean("OL_CB4", checkBoxValue22);
                editor.commit();
                boolean checkBoxValue24 = OL_CB6.isChecked();
                editor.putBoolean("OL_CB6", checkBoxValue24);
                editor.commit();
                boolean checkBoxValue25 = OL_CB7.isChecked();
                editor.putBoolean("OL_CB7", checkBoxValue25);
                editor.commit();
                boolean checkBoxValue28 = OL_CB10.isChecked();
                editor.putBoolean("OL_CB10", checkBoxValue28);
                editor.commit();
                boolean checkBoxValue30 = OL_CB12.isChecked();
                editor.putBoolean("OL_CB12", checkBoxValue30);
                editor.commit();
                boolean checkBoxValue31 = OL_CB13.isChecked();
                editor.putBoolean("OL_CB13", checkBoxValue31);
                editor.commit();
                boolean checkBoxValue33 = OL_CB15.isChecked();
                editor.putBoolean("OL_CB15", checkBoxValue33);
                editor.commit();
                boolean checkBoxValue34 = OL_CB16.isChecked();
                editor.putBoolean("OL_CB16", checkBoxValue34);
                editor.commit();
                boolean checkBoxValue36 = OL_CB18.isChecked();
                editor.putBoolean("OL_CB18", checkBoxValue36);
                editor.commit();
            }
        });

        // Assigned text views to variables
        tv_DL = (TextView) findViewById(R.id.wt_dl);
        tv_FS = (TextView) findViewById(R.id.wt_fs);
        tv_CPU = (TextView) findViewById(R.id.wt_CPU);
        tv_OAPU = (TextView) findViewById(R.id.wt_OAPU);
        tv_OAPU2 = (TextView) findViewById(R.id.wt_OAPU2);
        tv_AP = (TextView) findViewById(R.id.wt_AP);
        tv_PS = (TextView) findViewById(R.id.wt_PS);
        tv_OAIR = (TextView) findViewById(R.id.wt_OAIR);
        tv_PU = (TextView) findViewById(R.id.wt_PU);
        tv_SU = (TextView) findViewById(R.id.wt_SU);
        tv_SU2 = (TextView) findViewById(R.id.wt_SU2);
        tv_FS2 = (TextView) findViewById(R.id.wt_FS2);
        tv_DL2 = (TextView) findViewById(R.id.wt_DL2);
        tv_CR = (TextView) findViewById(R.id.wt_CR);
        tv_AP2 = (TextView) findViewById(R.id.wt_AP2);
        tv_PU2 = (TextView) findViewById(R.id.wt_PU2);
        tv_OAIR2 = (TextView) findViewById(R.id.wt_OAIR2);
        tv_MU = (TextView) findViewById(R.id.wt_MU);

        TextView tv_DL_rep = (TextView) findViewById(R.id.reps_DL);
        tv_FS_rep = (TextView) findViewById(R.id.reps_FS);
        TextView tv_CPU_rep = (TextView) findViewById(R.id.reps_CPushU);
        TextView tv_OAPU_rep = (TextView) findViewById(R.id.reps_OAPU);
        TextView tv_OAPU2_rep = (TextView) findViewById(R.id.reps_OAPU2);
        TextView tv_AP_rep = (TextView) findViewById(R.id.reps_AP);
        TextView tv_PS_rep = (TextView) findViewById(R.id.reps_PS);
        TextView tv_OAIR_rep = (TextView) findViewById(R.id.reps_OAIR);
        TextView tv_PU_rep = (TextView) findViewById(R.id.reps_PU);
        TextView tv_SU_rep = (TextView) findViewById(R.id.reps_SU);
        TextView tv_SU2_rep = (TextView) findViewById(R.id.reps_SU2);
        TextView tv_FS2_rep = (TextView) findViewById(R.id.reps_FS2);
        TextView tv_DL2_rep = (TextView) findViewById(R.id.reps_DL2);
        TextView tv_CR_rep = (TextView) findViewById(R.id.reps_CR);
        TextView tv_AP2_rep = (TextView) findViewById(R.id.reps_AP2);
        TextView tv_PU2_rep = (TextView) findViewById(R.id.reps_PU2);
        TextView tv_OAIR2_rep = (TextView) findViewById(R.id.reps_OAIR2);
        TextView tv_MU_rep = (TextView) findViewById(R.id.reps_MU);

        TextView tv_DL_int = (TextView) findViewById(R.id.int_DL);
        TextView tv_FS_int = (TextView) findViewById(R.id.int_FS);
        TextView tv_CPU_int = (TextView) findViewById(R.id.int_CPushU);
        TextView tv_OAPU_int = (TextView) findViewById(R.id.int_OAPU);
        TextView tv_OAPU2_int = (TextView) findViewById(R.id.int_OAPU2);
        TextView tv_PS_int = (TextView) findViewById(R.id.int_PS);
        TextView tv_OAIR_int = (TextView) findViewById(R.id.int_OAIR);
        TextView tv_PU_int = (TextView) findViewById(R.id.int_PU);
        TextView tv_SU_int = (TextView) findViewById(R.id.int_SU);
        TextView tv_SU2_int = (TextView) findViewById(R.id.int_SU2);
        TextView tv_FS2_int = (TextView) findViewById(R.id.int_FS2);
        TextView tv_DL2_int = (TextView) findViewById(R.id.int_DL2);
        TextView tv_CR_int = (TextView) findViewById(R.id.int_CR);
        TextView tv_PU2_int = (TextView) findViewById(R.id.int_PU2);
        TextView tv_OAIR2_int = (TextView) findViewById(R.id.int_OAIR2);
        TextView tv_MU_int = (TextView) findViewById(R.id.int_MU);

        DecimalFormat df = new DecimalFormat("###.#"); // Formats the displayed numbers

        String str_body_weight = pref.getString("body_weight", "0");
        double body_weight = Double.parseDouble(str_body_weight); // Converts variable from string to double

        // Defaults boy weight if user doesn't provide one
        if (body_weight == 0) {
            body_weight = 200;
        }

        // Get exorcise weight
        front_squat = pref.getString("squat_max", "0");
        double squat_max = Double.parseDouble(front_squat);

        // Displays weight as 0 to prevent division operations by 0
        if (front_squat == "0") {
            tv_FS.setText(String.valueOf("0"));
            tv_FS2.setText(String.valueOf("0"));
        } else {
            // Multiply max by intensity
            front_squat75 = Double.parseDouble(front_squat) * 0.75;
            double ol_squat_max = overload(squat_max);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > front_squat75) {
                tv_FS_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, squat_max)))));
                tv_FS_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, squat_max))))));
                tv_FS.setText(String.valueOf(df.format(body_weight * 0.72)));
            } else {
                // Set weight and reps
                front_squat75 = squat_body_weight(body_weight, front_squat75); // Factors body weight
                front_squat75 = round_five(front_squat75); // Round by five
                tv_FS.setText(String.valueOf(df.format(front_squat75)));
                tv_FS_rep.setText("10");
            }

            // Get exorcise weight
            front_squat83 = Double.parseDouble(front_squat) * 0.83;
            double ol_front_squat83 = overload(front_squat83);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > front_squat83) {
                tv_FS2_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, ol_squat_max)))));
                tv_FS2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, ol_squat_max))))));
                tv_FS2.setText(String.valueOf(df.format(body_weight * 0.72)));
            }
            else {
                // Set weight and reps
                ol_front_squat83 = squat_body_weight(body_weight, ol_front_squat83); // Factors body weight
                ol_front_squat83 = round_five(ol_front_squat83); // Round by five
                tv_FS2.setText(String.valueOf(df.format(ol_front_squat83)));
                tv_FS2_rep.setText("7");
            }
        }

        // Get exorcise weight
        dead_lift = pref.getString("DL_max", "0");
        double deadlift_max = Double.parseDouble(dead_lift);

        // Displays weight as 0 to prevent division operations by 0
        if (dead_lift == "0") {
            tv_DL.setText(String.valueOf("0"));
            tv_DL2.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            dead_lift75 = Double.parseDouble(dead_lift) * 0.75;
            double ol_deadlift_max = overload(deadlift_max);
            double ol_dead_lift75 = overload(dead_lift75);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > dead_lift75) {
                tv_DL_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, ol_deadlift_max)))));
                tv_DL_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, ol_deadlift_max))))));
                tv_DL.setText(String.valueOf(df.format(body_weight * 0.72)));
            }
            else {
                // Set weight and reps
                ol_dead_lift75 = squat_body_weight(body_weight, ol_dead_lift75); // Factors body weight
                ol_dead_lift75 = round_five(ol_dead_lift75); // Round by five
                tv_DL.setText(String.valueOf(df.format(ol_dead_lift75)));
                tv_DL_rep.setText("10");
            }

            // Get exorcise weight
            dead_lift83 = Double.parseDouble(dead_lift) * 0.83;

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > dead_lift83) {
                tv_DL2_int.setText(String.valueOf(df.format(Math.round(get_squat_intensity(body_weight, deadlift_max)))));
                tv_DL2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_squat_intensity(body_weight, deadlift_max))))));
                tv_DL2.setText(String.valueOf(df.format(body_weight * 0.72)));
            }
            else {
                // Set weight and reps
                dead_lift83 = squat_body_weight(body_weight, dead_lift83); // Factors body weight
                dead_lift83 = round_five(dead_lift83); // Round by five
                tv_DL2.setText(String.valueOf(df.format(dead_lift83)));
                tv_DL2_rep.setText("7");
            }
        }

        // Get exorcise weight
        cal_push_up = pref.getString("CPushU_max", "0");
        double cal_push_up_max = Double.parseDouble(cal_push_up);
        double ol_cal_push_up_max = overload(cal_push_up_max);

        // Displays weight as 0 to prevent division operations by 0
        if (cal_push_up == "0") {
            tv_CPU.setText(String.valueOf("0"));
        }
        else {
            // Sets weight, intensity, and reps
            tv_CPU_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, ol_cal_push_up_max)))));
            tv_CPU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, ol_cal_push_up_max))))));
            tv_CPU.setText(String.valueOf(df.format(body_weight)));
        }

        // Get exorcise weight
        sit_up = pref.getString("SU_max", "0");
        double sit_up_max = Double.parseDouble(sit_up);

        // Displays weight as 0 to prevent division operations by 0
        if (sit_up == "0") {
            tv_SU.setText(String.valueOf("0"));
            tv_SU2.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            sit_up75 = Double.parseDouble(sit_up) * 0.75;
            double ol_sit_up_max = overload(sit_up_max);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > sit_up75) {
                tv_SU_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, sit_up_max)))));
                tv_SU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, sit_up_max))))));
                tv_SU.setText(String.valueOf(df.format(body_weight * 0.5)));
            }
            else {
                // Set weight and reps
                sit_up75 = pushup_body_weight(body_weight, sit_up75); // Factors body weight
                sit_up75 = round_five(sit_up75); // Round by five
                tv_SU.setText(String.valueOf(df.format(sit_up75)));
                tv_SU_rep.setText("10");
            }
            // Get exorcise weight
            sit_up83 = Double.parseDouble(sit_up) * 0.83;
            double ol_sit_up83 = overload(sit_up83);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > sit_up83) {
                tv_SU2_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, ol_sit_up_max)))));
                tv_SU2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, ol_sit_up_max))))));
                tv_SU2.setText(String.valueOf(df.format(body_weight * 0.5)));
            }
            else {
                // Set weight and reps
                ol_sit_up83 = pushup_body_weight(body_weight, ol_sit_up83); // Factors body weight
                ol_sit_up83 = round_five(ol_sit_up83); // Round by five
                tv_SU2.setText(String.valueOf(df.format(ol_sit_up83)));
                tv_SU2_rep.setText("7");
            }
        }

        // Get exorcise weight
        OA_push_up = pref.getString("OAP_max", "0");
        double OA_push_up_max = Double.parseDouble(OA_push_up);

        // Displays weight as 0 to prevent division operations by 0
        if (OA_push_up == "0") {
            tv_OAPU.setText(String.valueOf("0"));
            tv_OAPU2.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            OA_push_up75 = Double.parseDouble(OA_push_up) * 0.75;
            double ol_OA_push_up_max = overload(OA_push_up_max);
            double ol_OA_push_up75 = overload(OA_push_up75);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > OA_push_up75) {
                tv_OAPU_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, ol_OA_push_up_max)))));
                tv_OAPU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, ol_OA_push_up_max))))));
                tv_OAPU.setText(String.valueOf(df.format(body_weight * 0.5)));
            }
            else {
                // Set weight and reps
                ol_OA_push_up75 = pushup_body_weight(body_weight, ol_OA_push_up75); // Factors body weight
                ol_OA_push_up75 = round_five(ol_OA_push_up75); // Round by five
                tv_OAPU.setText(String.valueOf(df.format(ol_OA_push_up75)));
                tv_OAPU_rep.setText("10");
            }

            // Get exorcise weight
            OA_push_up83 = Double.parseDouble(OA_push_up) * 0.83;

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > OA_push_up83) {
                tv_OAPU2_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, OA_push_up_max)))));
                tv_OAPU2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, OA_push_up_max))))));
                tv_OAPU2.setText(String.valueOf(df.format(body_weight * 0.5)));
            }
            else {
                // Set weight and reps
                OA_push_up83 = pushup_body_weight(body_weight, OA_push_up83); // Factors body weight
                OA_push_up83 = round_five(OA_push_up83); // Round by five
                tv_OAPU2.setText(String.valueOf(df.format(OA_push_up83)));
                tv_OAPU2_rep.setText("7");
            }
        }

        // Get exorcise weight
        axel_press = pref.getString("AP_max", "0");
        double axel_press_max = Double.parseDouble(axel_press);

        // Displays weight as 0 to prevent division operations by 0
        if (axel_press == "0") {
            tv_AP.setText(String.valueOf("0"));
            tv_AP2.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            axel_press75 = Double.parseDouble(axel_press) * 0.75;
            axel_press75 = round_five(axel_press75); // Round weight
            tv_AP.setText(String.valueOf(df.format(axel_press75))); // Set weight
            tv_AP_rep.setText("10"); // Set reps
            // Get exorcise weight
            axel_press83 = Double.parseDouble(axel_press) * 0.83;
            double ol_axel_press83 = overload(axel_press83);
            ol_axel_press83 = round_five(ol_axel_press83); // Round weight
            tv_AP2.setText(String.valueOf(df.format(ol_axel_press83))); // Set weight
            tv_AP2_rep.setText("7"); // Set reps
        }

        // Get exorcise weight
        cal_pull_up = pref.getString("CPullU_max", "0");
        double cal_pull_up_max = Double.parseDouble(cal_pull_up);
        double ol_cal_pull_up_max = overload(cal_pull_up_max);

        // Displays weight as 0 to prevent division operations by 0
        if (cal_pull_up == "0") {
            tv_CR.setText(String.valueOf("0"));
        }
        else {
            // Sets weight, intensity, and reps
            tv_CR_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, ol_cal_pull_up_max)))));
            tv_CR_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, ol_cal_pull_up_max))))));
            tv_CR.setText(String.valueOf(df.format(body_weight)));
        }

        // Get exorcise weight
        OAI_row = pref.getString("OAIR_max", "0");
        double OAI_row_max = Double.parseDouble(OAI_row);

        // Displays weight as 0 to prevent division operations by 0
        if (OAI_row == "0") {
            tv_OAIR.setText(String.valueOf("0"));
            tv_OAIR2.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            OAI_row75 = Double.parseDouble(OAI_row) * 0.75;
            double ol_OAI_row_max = overload(OAI_row_max);
            double ol_OAI_row75 = overload(OAI_row75);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > OAI_row75) {
                tv_OAIR_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, ol_OAI_row_max)))));
                tv_OAIR_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, ol_OAI_row_max))))));
                tv_OAIR.setText(String.valueOf(df.format(body_weight * 0.5)));
            }
            else {
                // Set weight and reps
                ol_OAI_row75 = pushup_body_weight(body_weight, ol_OAI_row75); // Factors body weight
                ol_OAI_row75 = round_five(ol_OAI_row75); // Round by five
                tv_OAIR.setText(String.valueOf(df.format(ol_OAI_row75)));
                tv_OAIR_rep.setText("10");
            }

            // Get exorcise weight
            OAI_row83 = Double.parseDouble(OAI_row) * 0.83;

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > OAI_row83) {
                tv_OAIR2_int.setText(String.valueOf(df.format(Math.round(get_pushup_intensity(body_weight, OAI_row_max)))));
                tv_OAIR2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pushup_intensity(body_weight, OAI_row_max))))));
                tv_OAIR2.setText(String.valueOf(df.format(body_weight * 0.5)));
            }
            else {
                // Set weight and reps
                OAI_row83 = pushup_body_weight(body_weight, OAI_row83); // Factors body weight
                OAI_row83 = round_five(OAI_row83); // Round by five
                tv_OAIR2.setText(String.valueOf(df.format(OAI_row83)));
                tv_OAIR2_rep.setText("7");
            }
        }

        // Get exorcise weight
        pull_up = pref.getString("PU_max", "0");
        double pull_up_max = Double.parseDouble(pull_up);

        // Displays weight as 0 to prevent division operations by 0
        if (pull_up == "0") {
            tv_PU.setText(String.valueOf("0"));
            tv_PU2.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            pull_up75 = Double.parseDouble(pull_up) * 0.75;
            double ol_pull_up_max = overload(pull_up_max);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > pull_up75) {
                tv_PU_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, pull_up_max)))));
                tv_PU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, pull_up_max))))));
                tv_PU.setText(String.valueOf(df.format(body_weight)));
            }
            else {
                // Set weight and reps
                pull_up75 = pullup_body_weight(body_weight, pull_up75); // Factors body weight
                pull_up75 = round_two_point_five(pull_up75); // Round by five
                tv_PU.setText(String.valueOf(df.format(pull_up75)));
                tv_PU_rep.setText("10");
            }

            // Get exorcise weight
            pull_up83 = Double.parseDouble(pull_up) * 0.83;
            double ol_pull_up83 = overload(pull_up83);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > pull_up83) {
                tv_PU2_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, ol_pull_up_max)))));
                tv_PU2_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, ol_pull_up_max))))));
                tv_PU2.setText(String.valueOf(df.format(body_weight)));
            }
            else {
                // Set weight and reps
                ol_pull_up83 = pullup_body_weight(body_weight, ol_pull_up83); // Factors body weight
                ol_pull_up83 = round_two_point_five(ol_pull_up83); // Round by five
                tv_PU2.setText(String.valueOf(df.format(ol_pull_up83)));
                tv_PU2_rep.setText("7");
            }
        }

        // Get exorcise weight
        muscle_up = pref.getString("MU_max", "0");
        double muscle_up_max = Double.parseDouble(muscle_up);
        double ol_muscle_up_max = overload(muscle_up_max);

        // Displays weight as 0 to prevent division operations by 0
        if (muscle_up == "0") {
            tv_MU.setText(String.valueOf("0"));
        }
        else {
            // Sets weight, intensity, and reps
            tv_MU_int.setText(String.valueOf(df.format(Math.round(get_pullup_intensity(body_weight, ol_muscle_up_max)))));
            tv_MU_rep.setText(String.valueOf(df.format(get_reps(Math.round(get_pullup_intensity(body_weight, ol_muscle_up_max))))));
            tv_MU.setText(String.valueOf(df.format(body_weight)));
        }

        // Get exorcise weight
        pistol_squat = pref.getString("PS_max", "0");
        double pistol_squat_max = Double.parseDouble(pistol_squat);

        // Displays weight as 0 to prevent division operations by 0
        if (pistol_squat == "0") {
            tv_PS.setText(String.valueOf("0"));
        }
        else {
            // Get exorcise weight
            pistol_squat75 = Double.parseDouble(pistol_squat) * 0.75;
            double ol_pistol_squat_max = overload(pistol_squat_max);
            double ol_pistol_squat75 = overload(pistol_squat75);

            // Adjusts reps and intensity if body weight exceeds expected weight
            if (body_weight > pistol_squat75) {
                tv_PS_int.setText(String.valueOf(df.format(Math.round(pistol_get_squat_intensity(body_weight, ol_pistol_squat_max)))));
                tv_PS_rep.setText(String.valueOf(df.format(get_reps(Math.round(pistol_get_squat_intensity(body_weight, ol_pistol_squat_max))))));
                tv_PS.setText(String.valueOf(df.format(body_weight * 0.86)));
            }
            else {
                // Set weight and reps
                ol_pistol_squat75 = pistol_squat_body_weight(body_weight, ol_pistol_squat75); // Factors body weight
                ol_pistol_squat75 = round_five(ol_pistol_squat75); // Round by five
                tv_PS.setText(String.valueOf(df.format(ol_pistol_squat75)));
                tv_PS_rep.setText("10");
            }
        }
    }

    // Rounds to the nearest 5
    double round_five(double real_weight) {
        double mod_five = real_weight % 5; // Mod five
        // Subtracts mod difference from weight if mod is less than 1.25
        if (mod_five < 2.5) {
            real_weight = real_weight - mod_five;
        }
        // Subtracts mod difference from weight and adds 2.5 if mod is greater than 1.25
        else if (mod_five >= 2.5) {
            real_weight = real_weight - mod_five + 5;
        }
        return real_weight;
    }

    // Rounds to the nearest 2.5
    double round_two_point_five(double real_weight) {
        double mod_two_point_five = real_weight % 2.5; // Mod 2.5
        // Subtracts mod difference from weight if mod is less than 1.25
        if (mod_two_point_five < 1.25) {
            real_weight = real_weight - mod_two_point_five;

        }
        // Subtracts mod difference from weight and adds 2.5 if mod is greater than 1.25
        else if (mod_two_point_five >= 1.25) {
            real_weight = real_weight - mod_two_point_five + 2.5;
        }
        return real_weight;
    }

    // Gets reps according to intensity
    double get_reps(double intensity) {
        double reps = 0;
        intensity = intensity / 100;

        if (intensity > 0.97) {
            reps = 1;
        } else if (intensity <= 0.97 && intensity > 0.94) {
            reps = 2;
        } else if (intensity <= 0.94 && intensity > 0.92) {
            reps = 3;
        } else if (intensity <= 0.92 && intensity > 0.89) {
            reps = 4;
        } else if (intensity <= 0.89 && intensity > 0.86) {
            reps = 5;
        } else if (intensity <= 0.86 && intensity > 0.83) {
            reps = 6;
        } else if (intensity <= 0.83 && intensity > 0.81) {
            reps = 7;
        } else if (intensity <= 0.81 && intensity > 0.78) {
            reps = 8;
        } else if (intensity <= 0.78 && intensity > 0.75) {
            reps = 9;
        } else if (intensity <= 0.75 && intensity > 0.73) {
            reps = 10;
        } else if (intensity <= 0.73 && intensity > 0.71) {
            reps = 11;
        } else if (intensity <= 0.71 && intensity > 0.70) {
            reps = 12;
        } else if (intensity <= 0.70 && intensity > 0.68) {
            reps = 13;
        } else if (intensity <= 0.68 && intensity > 0.67) {
            reps = 14;
        } else if (intensity <= 0.67 && intensity > 0.65) {
            reps = 15;
        } else if (intensity <= 0.65 && intensity > 0.64) {
            reps = 16;
        } else if (intensity <= 0.64 && intensity > 0.63) {
            reps = 17;
        } else if (intensity <= 0.63 && intensity > 0.61) {
            reps = 18;
        } else if (intensity <= 0.61 && intensity > 0.60) {
            reps = 19;
        } else if (intensity <= 0.60 && intensity > 0.59) {
            reps = 20;
        } else if (intensity <= 0.59 && intensity > 0.58) {
            reps = 21;
        } else if (intensity <= 0.58 && intensity > 0.57) {
            reps = 22;
        } else if (intensity <= 0.57 && intensity > 0.56) {
            reps = 23;
        } else if (intensity <= 0.56 && intensity > 0.55) {
            reps = 24;
        } else if (intensity <= 0.55 && intensity > 0.54) {
            reps = 25;
        } else if (intensity <= 0.54 && intensity > 0.53) {
            reps = 26;
        } else if (intensity <= 0.53 && intensity > 0.52) {
            reps = 27;
        } else if (intensity <= 0.52 && intensity > 0.51) {
            reps = 28;
        } else if (intensity <= 0.51 && intensity > 0.50) {
            reps = 29;
        } else if (intensity <= 0.50) {
            reps = 30;
        } else {
            reps = 0;
        }

        return reps;
    }

    // Factors body weight for squat
    double squat_body_weight(double body_weight, double weight) {
        double new_weight = 0;
        double squat_body_weight = 0;
        squat_body_weight = body_weight * 0.72;
        new_weight = weight - squat_body_weight;
        //checks for negative numbers
        if (new_weight < 0) {
            new_weight = 0;
        }
        return new_weight;
    }

    // Gets intensity for squats according to max and body weight
    double get_squat_intensity(double body_weight, double max) {
        double new_intensity = 0;
        double squat_body_weight = 0;
        squat_body_weight = body_weight * 0.72;
        new_intensity = squat_body_weight / max;
        new_intensity = new_intensity * 100;
        return new_intensity;
    }

    // Factors body weight for push ups
    double pushup_body_weight(double body_weight, double weight) {
        double new_weight = 0;
        double pushup_body_weight = 0;
        pushup_body_weight = body_weight * 0.5;
        new_weight = weight - pushup_body_weight;
        // Checks for negative numbers
        if (new_weight < 0) {
            new_weight = 0;
        }
        return new_weight;
    }

    // Gets intensity for push ups according to max and body weight
    double get_pushup_intensity(double body_weight, double max) {
        double new_intensity = 0;
        double pushup_body_weight = 0;
        pushup_body_weight = body_weight * 0.5;
        new_intensity = pushup_body_weight / max;
        new_intensity = new_intensity * 100;
        return new_intensity;
    }

    // Factors body weight for pull ups
    double pullup_body_weight(double body_weight, double weight) {
        double new_weight = 0;
        new_weight = weight - body_weight;
        //checks for negative numbers
        if (new_weight < 0) {
            new_weight = 0;
        }
        return new_weight;
    }

    // Gets intensity for pull ups according to max and body weight
    double get_pullup_intensity(double body_weight, double max) {
        double new_intensity = 0;
        new_intensity = body_weight / max;
        new_intensity = new_intensity * 100;
        ;
        return new_intensity;
    }

    // Factors body weight for pistol squats
    double pistol_squat_body_weight(double body_weight, double weight) {
        double new_weight = 0;
        double pistol_squat_body_weight = 0;
        pistol_squat_body_weight = body_weight * 0.86;
        new_weight = weight - pistol_squat_body_weight;
        //checks for negative numbers
        if (new_weight < 0) {
            new_weight = 0;
        }
        return new_weight;
    }

    // Gets intensity for pistol squats according to max and body weight
    double pistol_get_squat_intensity(double body_weight, double max) {
        double new_intensity = 0;
        double pistol_squat_body_weight = 0;
        pistol_squat_body_weight = body_weight * 0.86;
        new_intensity = pistol_squat_body_weight / max;
        new_intensity = new_intensity * 100;
        return new_intensity;
    }

    // Overload by 5%
    double overload(double max) {
        double new_max = 0;
        new_max = (max * 0.05) + max;

        return new_max;
    }

    // Brings pop up page for each exorcise being overloaded
    public void popup_FS(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "FS";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Front Squat");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_DL(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "Dead Lift";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Dead Lift");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_CPU(View view) {
        Intent intent = new Intent(CycleTwoActivity.this,popup.class);
        String CPU_bundle = "CPU";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Calisthenic Push Up");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_OAPU(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "OAPU";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "One Arm Inverted Push Up");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_AP(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "AP";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Axel Press");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_PS(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "Pistol Squat";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Pistol Squat");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_OAIR(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "OAIR";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "One Arm Inverted Row");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_PU(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "PU";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Pull Up");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_SU(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "SU";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Sit Up");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_CR(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "CR";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Calisthenic Row");
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void popup_MU(View view) {
        Intent intent = new Intent(CycleTwoActivity.this, popup.class);
        String CPU_bundle = "MU";
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "Muscle Up");
        intent.putExtras(bundle);
        startActivity(intent);
    }




}

package com.example.ajith333.screens;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ajith333.screens.Utils.PrefUtils;


public class Activity2 extends AppCompatActivity {

    String employee_id;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void take_over_device(View view){
        EditText emp_id = (EditText)findViewById(R.id.emp_id_edit_text);
        employee_id = emp_id.getText().toString();
        if(!employee_id.isEmpty()){
            PrefUtils pr=new PrefUtils(getApplicationContext());
            PrefUtils.setEmpId(employee_id);
            PrefUtils.setOccupied(true);
            Toast.makeText(getApplicationContext(),"You have successfully taken over the Device",Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,Activity3.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(),"Enter your Employee-ID",Toast.LENGTH_LONG).show();
        }
    }
}
package com.example.ajith333.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ajith333.screens.Utils.PrefUtils;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        PrefUtils pr=new PrefUtils(getApplicationContext());
        String emp_id=PrefUtils.getEmpId();
        TextView employee_id=(TextView)findViewById(R.id.emp_textview_disp);
        //Toast.makeText(getApplicationContext(),emp_id+"",Toast.LENGTH_LONG).show();
        employee_id.setText(emp_id);
    }
    public void return_device(View view){
        Toast.makeText(getApplicationContext(),"You have successfully Returned the Device",Toast.LENGTH_LONG).show();
        PrefUtils pr=new PrefUtils(getApplicationContext());
        PrefUtils.setOccupied(false);
        Intent i = new Intent(this,Activity2.class);
        startActivity(i);
    }
}

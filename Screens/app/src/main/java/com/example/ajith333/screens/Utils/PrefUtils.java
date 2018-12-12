package com.example.ajith333.screens.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefUtils {
   public static Context context;
    public PrefUtils(Context context){
        this.context=context;
    }


    //private static final PrefUtils ourInstance = new PrefUtils();

    /*static PrefUtils getInstance() {
        return ourInstance;
    }*/

    public static void setEmpId(String employee_id) {
        SharedPreferences pr=context.getSharedPreferences("employee_data",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pr.edit();
        editor.putString("emp_id",employee_id);
        editor.commit();
    }
    public static void setOccupied(boolean a){
         SharedPreferences pr=context.getSharedPreferences("employee_data",Context.MODE_PRIVATE);
         SharedPreferences.Editor editor=pr.edit();
        editor.putBoolean("occupied", a);
        editor.commit();
    }
    public static String getEmpId() {
        SharedPreferences pr=context.getSharedPreferences("employee_data",Context.MODE_PRIVATE);
        String emp_id=pr.getString("emp_id","");
        return emp_id;
    }
    public static void getOccupied(boolean a){
        SharedPreferences pr=context.getSharedPreferences("employee_data",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pr.edit();
        editor.putBoolean("occupied", false);
        editor.commit();
    }

//    private SharedPreferences.Editor getEditor() {
//        SharedPreferences sp=getSharedPreferences("Employee_Data",Context.MODE_PRIVATE);
//        return sp.edit();
//    }
}

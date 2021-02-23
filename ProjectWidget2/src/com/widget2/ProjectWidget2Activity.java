package com.widget2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ProjectWidget2Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void KlikHasil (View v){
    	CheckBox cb_Java = (CheckBox) findViewById (R.id.cbJava);
    	CheckBox cb_Php = (CheckBox) findViewById (R.id.cbPhp);
    	CheckBox cb_CPlus = (CheckBox) findViewById (R.id.cbCPlus);
    	TextView tv_hasil = (TextView) findViewById (R.id.tvHasil);
    	
    	String s = "Hasil : ";
    	if (cb_Java.isChecked()){
    		s = s + "Java";
    	} if (cb_Php.isChecked()){
    		s = s + "Php";
    	} if (cb_CPlus.isChecked()) {
    		s = s + "C/C++";
    	} tv_hasil.setText(s);
    	
    }
}
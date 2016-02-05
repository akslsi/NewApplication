package com.example.chenjutsu.newapplication;

/**
 * Created by chenjutsu on 16-2-5.
 */
import android.app.ListActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Spinner;


import org.w3c.dom.Text;

//public class SpinnerDemo extends Activity
//   implements AdapterView.OnItemSelectedListener{
//    private TextView selection;
//    private static final String[] items = {"apple","orange","grape","berry"};
//
//
//@Override
//public void Oncreate(Bundle icicle){
//    super.onCreate(icicle);
//    setContentView(R.layout.activity_main);
//    selection = (TextView)findViewById(R.id.selection);
//    Spinner spin = (Spinner)findViewById(R.id.spinner);
//    spin.setOnItemSelectedListener(this);
//    ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
//            android.R.layout.simple_spinner_dropdown_item, items);
//}
//@Override
//public void onItemSelected(AdapterView<?> parent, View v, int position, long id){
//    selection.setText(items[position]);
//
//        }
//        }
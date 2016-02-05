package com.example.chenjutsu.newapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;
import android.widget.TextView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayList<String> list = new ArrayList<>();
        //list.add("apple");
        //list.add("grape");
        //list.add("orange");
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                                                          //list);
        //GridView GridView = (GridView) findViewById(R.id.grid);
        //GridView.setAdapter(adapter);
         
       GridDemo demo = new GridDemo();
    }



    public void submitButton(View view) {
        Toast.makeText(this,"clicked submit",Toast.LENGTH_SHORT).show();

    }


}


package com.example.chenjutsu.newapplication;

/**
 * Created by chenjutsu on 16-2-5.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class GridDemo extends Activity implements AdapterView.OnItemClickListener{
    private TextView selection;
    private static final String[] items = {"apple", "orange","grape","berry"};
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        selection = (TextView)findViewById(R.id.selection);
        GridView g = (GridView) findViewById(R.id.grid);
        g.setAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,
                items));
        g.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        selection.setText(items[position]);
    }
}

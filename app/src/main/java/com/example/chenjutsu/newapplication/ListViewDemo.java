package com.example.chenjutsu.newapplication;

/**
 * Created by chenjutsu on 16-2-5.
 */
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class ListViewDemo extends ListActivity {
    private TextView selection;
    private static final String[] items = {"apple","orange","banana","grape","berry"};
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice,items ));
        //selection = (TextView)findViewById(R.id.selection);
    }
    public void onListItemClick(ListView parent, View v, int position, long id){
        selection.setText(items[position]);
    }

}

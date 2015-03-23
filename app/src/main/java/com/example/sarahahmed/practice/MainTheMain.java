package com.example.sarahahmed.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainTheMain extends ActionBarActivity {

    ListView list;
    MainTheMain activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_the_main);
        activity = this;
        list = (ListView)this.findViewById(R.id.listView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.main_list,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(activity, MainTheMain.class); // can be initialized with any
                if ( position == 0 ){
                    intent = new Intent(activity, MainActivity.class);
                }
                startActivity(intent);
            }
        });
    }
}

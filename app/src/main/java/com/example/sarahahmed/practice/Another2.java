package com.example.sarahahmed.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class Another2 extends ActionBarActivity {
int pos;
    MyFragment2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("sarah","onCreate Another2");
        setContentView(R.layout.activity_another2);
        Log.i("sarah","contentView set Another2");
        Intent intent = getIntent();
        Log.i("sarah", "got intent");
        pos = intent.getIntExtra("pos", 0);
        Log.i("sarah","got extras");
        frag2 = (MyFragment2) getFragmentManager().findFragmentById(R.id.fragment2);
        Log.i("sarah", "frag2 assigned");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_another2, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("sarah", "onStart() another 2");
        frag2.changeData(pos);
        Log.i("sarah", "data changed");
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.i("sarah", "fragment attached");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.i("sarah", "fragment attached");

        frag2.changeData(pos);
        Log.i("sarah", "data changed");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

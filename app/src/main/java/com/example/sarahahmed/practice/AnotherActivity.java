package com.example.sarahahmed.practice;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

/**
 * Created by Sarah Ahmed on 3/22/2015.
 */
public class AnotherActivity extends ActionBarActivity {
    int pos;
    MyFragment2 frag2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("sarah","onCreate anotherActivity");
        try {
            setContentView(R.layout.activity_another);
        } catch (Exception ex) {
            Log.e("sarah","Exception caught: " + ex.getMessage());
        }
        Log.e("sarah","content view set");
        Intent intent = null;
            intent = getIntent();
        Log.e("sarah","intent received");
        pos = intent.getIntExtra("pos", 0);
        Log.e("sarah","pos received" + pos);

        manager = getFragmentManager();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        frag2 = (MyFragment2) manager.findFragmentById(R.id.fragment2);
        frag2.changeData(pos);
    }
}

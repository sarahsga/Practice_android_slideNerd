package com.example.sarahahmed.practice;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity implements Communicator{
    FragmentManager manager;
    MyFragment2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
    }

    @Override
    public void respond(int pos) {
        frag2 = (MyFragment2) manager.findFragmentById(R.id.fragment2);
        frag2.changeData(pos);
    }
}
package com.example.sarahahmed.practice;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class MainActivity extends ActionBarActivity implements MyFragment.Communicator{
    FragmentManager manager;
    MyFragment2 frag2;
    MyFragment frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        frag = (MyFragment) manager.findFragmentById(R.id.fragment);
        frag.setCommunicator(this);
    }

    @Override
    public void respond(int pos) {
        frag2 = (MyFragment2) manager.findFragmentById(R.id.fragment2);
        Log.e("sarah", "inside respond()");
        if  (frag2 != null && frag2.isVisible()) {
            Log.e("sarah","landscape");
            frag2.changeData(pos);
        }
        else {
            Log.e("sarah","Portrait");
            Intent intent = new Intent(this,Another2.class);
            intent.putExtra("pos", pos);
            startActivity(intent);
        }
    }
}
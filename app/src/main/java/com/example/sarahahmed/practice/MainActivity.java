package com.example.sarahahmed.practice;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    FragmentManager manager;
    FragmentTransaction transaction;

    Button btn_addA;
    Button btn_addB;
    Button btn_removeA;
    Button btn_removeB;
    Button btn_detachA;
    Button btn_detachB;
    Button btn_attachA;
    Button btn_attachB;
    Button btn_replaceAwB;
    Button btn_replaceBwA;

    MyFragment frag;
    MyFragment2 frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("sarah","onStart");
    }

    public void AddA(View v) {
        Log.e("sarah","AddA()");
        MyFragment frag = new MyFragment();
        transaction = manager.beginTransaction();
        transaction.add(R.id.linearLayout1,frag,"A");
        transaction.commit();
    }
    public void AddB(View v) {
        MyFragment2 frag2 = new MyFragment2();
        transaction = manager.beginTransaction();
        transaction.add(R.id.linearLayout1,frag2,"B");
        transaction.commit();
    }
    public void RemoveA(View v) {
        frag = (MyFragment)manager.findFragmentByTag("A");
        if ( frag != null ){
            transaction = manager.beginTransaction();
            transaction.remove(frag);
            transaction.commit();
        }
    }
    public void RemoveB(View v) {
        frag2 = (MyFragment2)manager.findFragmentByTag("B");
        if ( frag2 != null ){
            transaction = manager.beginTransaction();
            transaction.remove(frag2);
            transaction.commit();
        }
    }
    public void AttachA(View v) {
        frag = (MyFragment)manager.findFragmentByTag("A");
        if ( frag != null ){
            transaction = manager.beginTransaction();
            transaction.attach(frag);
            transaction.commit();
        }
    }
    public void AttachB(View v) {
        frag2 = (MyFragment2)manager.findFragmentByTag("B");
        if ( frag2 != null ){
            transaction = manager.beginTransaction();
            transaction.attach(frag2);
            transaction.commit();
        }
    }
    public void DetachA(View v) {
        frag = (MyFragment)manager.findFragmentByTag("A");
        if ( frag != null ){
            transaction = manager.beginTransaction();
            transaction.detach(frag);
            transaction.commit();
        }
    }
    public void DetachB(View v) {
        frag2 = (MyFragment2)manager.findFragmentByTag("B");
        if ( frag2 != null ){
            transaction = manager.beginTransaction();
            transaction.detach(frag2);
            transaction.commit();
        }
    }
    public void ReplaceAwB(View v) {
        frag = (MyFragment)manager.findFragmentByTag("A");
        if ( frag != null ){
            frag2 = new MyFragment2();
            transaction = manager.beginTransaction();
            transaction.replace(R.id.linearLayout1,frag2,"B");
            transaction.commit();
        }
    }
    public void ReplaceBwA(View v) {
        frag2 = (MyFragment2)manager.findFragmentByTag("B");
        if ( frag2 != null ){
            frag = new MyFragment();
            transaction = manager.beginTransaction();
            transaction.replace(R.id.linearLayout1,frag,"A");
            transaction.commit();
        }
    }
}
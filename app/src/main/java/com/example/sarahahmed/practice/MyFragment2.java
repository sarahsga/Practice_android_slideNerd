package com.example.sarahahmed.practice;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sarah Ahmed on 3/22/2015.
 */
public class MyFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("sarah", "onCreateView B");
        return inflater.inflate(R.layout.layout_my_2,container,false);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("sarah", "onCreate B");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("sarah","onAttach B");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("sarah","onActivityCreated B");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("sarah","onStart B");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("sarah","onResume B");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("sarah","onStop B");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("sarah","onPause B");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("sarah","onDetach B");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("sarah","onDestroy B");
    }

}
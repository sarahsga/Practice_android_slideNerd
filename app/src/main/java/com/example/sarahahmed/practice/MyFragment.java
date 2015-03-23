package com.example.sarahahmed.practice;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("sarah","onCreateView A");
        return inflater.inflate(R.layout.fragment_my,container,false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("sarah","onCreate A");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("sarah","onAttach A");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("sarah","onActivityCreated A");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("sarah","onStart A");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("sarah","onResume A");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("sarah","onStop A");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("sarah","onPause A");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("sarah","onDetach A");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("sarah","onDestroy A");
    }

}
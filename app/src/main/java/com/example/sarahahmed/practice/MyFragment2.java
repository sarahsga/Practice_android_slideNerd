package com.example.sarahahmed.practice;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sarah Ahmed on 3/22/2015.
 */
public class MyFragment2 extends Fragment {
    TextView text;
    String txt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("sarah", "onCreate 2");
        super.onCreate(savedInstanceState);
        if ( savedInstanceState == null) {
            Log.i("sarah", "savedInstanceState 2 == null");
            txt = "Choose an item from the list";
        }
        else {
            Log.i("sarah", "savedInstanceState 2 != null");
            txt = savedInstanceState.getString("descrip", "Choose an item from the list");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("sarah", "inflating 2");
        return  inflater.inflate(R.layout.layout_my_2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("sarah", "onActivityCreated 2");
        super.onActivityCreated(savedInstanceState);

        text = (TextView) getActivity().findViewById(R.id.textView);
        text.setText(txt);
    }

    public void changeData(int pos) {
        Resources res = getResources();
        String[] descriptions = res.getStringArray(R.array.descriptions);
        text.setText(descriptions[pos]);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("descrip", (String) text.getText());
    }
}
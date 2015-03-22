package com.example.sarahahmed.practice;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView list;
    Communicator comm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_my,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = (ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.titles, android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.e("sarah", "item clicked");
        comm.respond(position);
    }

    public interface Communicator {
        public abstract void respond(int pos);
    }

    public void setCommunicator(Communicator c) {
        comm = c;
    }
}
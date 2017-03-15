package com.example.federicamarini.fragmentcommunications;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentSecond extends Fragment {
    private TextView textView;

    public FragmentSecond() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        textView.setVisibility(View.GONE);
        return view;
    }

    public void updateInfo(String name){
        textView.setText("Hai scritto: "+name);
        textView.setVisibility(View.VISIBLE);
    }
}

package com.example.federicamarini.fragmentcommunications;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentFirst extends Fragment {
    private EditText editText;
    private Button button;
    OnNameSetListener onNameSetListener;

    public FragmentFirst() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        editText = (EditText) view.findViewById(R.id.edittext);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sth = editText.getText().toString();
                onNameSetListener.setName(sth);
            }
        });
        return view;
    }

    public interface OnNameSetListener{
        void setName(String name);
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        onNameSetListener = (OnNameSetListener) activity;
    }

}

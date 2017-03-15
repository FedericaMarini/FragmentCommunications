package com.example.federicamarini.fragmentcommunications;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentFirst.OnNameSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setName(String name) {

        FragmentSecond f2 = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.fragment_second);
        f2.updateInfo(name);

    }
}

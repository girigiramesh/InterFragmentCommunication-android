package com.interfragmentcommunication;

import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator {
    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        fragmentA = (FragmentA) manager.findFragmentById(R.id.fragment);
        fragmentA.setCommunicator(this);
    }

    @Override
    public void response(int index) {
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);

//============landscape mode============
        if (fragmentB != null && fragmentB.isVisible()) {
            fragmentB.changeData(index);

//============portrait mode==============
        } else {
            Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);

        }

    }
}

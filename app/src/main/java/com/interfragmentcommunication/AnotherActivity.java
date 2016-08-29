package com.interfragmentcommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Ramesh on 8/29/16.
 */
public class AnotherActivity extends Activity {
    FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if (fragmentB != null)
            fragmentB.changeData(index);
    }
}

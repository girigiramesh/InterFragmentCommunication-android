package com.interfragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ramesh on 8/29/16.
 */
public class FragmentB extends Fragment {
    TextView textview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textview = (TextView) view.findViewById(R.id.textview);
        return view;
    }

    public void changeData(int index) {
        String[] description = getResources().getStringArray(R.array.description);
        textview.setText(description[index]);
    }
}

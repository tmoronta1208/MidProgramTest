package com.example.android.midprogramtest;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class FirstFragment extends Fragment {
View rootView;
private EditText email;
private int displayNum;

    public FirstFragment() {
        // Required empty public constructor
    }

    public EditText getEmail() {
        return email;
    }

    public int getDisplayNum() {
        return displayNum;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



       rootView = inflater.inflate(R.layout.fragment_first, container, false);
        return rootView;
    }

}

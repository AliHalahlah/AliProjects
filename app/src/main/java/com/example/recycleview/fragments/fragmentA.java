package com.example.recycleview.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.recycleview.R;

public class fragmentA extends Fragment {

    private EditText editText;
    private Button buttonOk;


    public fragmentA(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_a,container,false);
        editText = v.findViewById(R.id.editText);
        buttonOk = v.findViewById(R.id.btnOk);

        return v;

    }
}

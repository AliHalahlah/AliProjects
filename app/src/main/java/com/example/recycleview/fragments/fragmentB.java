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

public class fragmentB extends Fragment {

    private EditText editText;
    private Button buttonOk;

    public fragmentB() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_b,container,false);
        editText = v.findViewById(R.id.editText2);
        buttonOk = v.findViewById(R.id.btnOk2);

        return v;
    }
}

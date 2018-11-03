package com.example.android.signs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Tab3All extends Fragment {
    private static final String TAG = "Tab3All";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflates the xml fragment
        View view = inflater.inflate(R.layout.tab3_all,container,false);

        //finds the button
        btnTEST = (Button) view.findViewById(R.id.btnTEST3);

        //onClickListenet for the button, showing a toast message
        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

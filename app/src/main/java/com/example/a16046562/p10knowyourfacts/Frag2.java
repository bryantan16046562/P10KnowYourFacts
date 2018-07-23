package com.example.a16046562.p10knowyourfacts;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {
    TextView tv1, tv2, tv3;
    Button btnchangecolor2;

    View view;
    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_frag2, container, false);

        tv1 = (TextView) view.findViewById(R.id.tv1frag2);
        tv2 = (TextView) view.findViewById(R.id.tv2frag2);
        tv3 = (TextView) view.findViewById(R.id.tv3frag2);
        btnchangecolor2 = (Button) view.findViewById(R.id.btnChangeColor);

        tv1.setText("ABC 1");
        tv2.setText("ABC 2");
        tv3.setText("ABC 3");

        btnchangecolor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rg = new Random();
                view.setBackgroundColor(Color.rgb(rg.nextInt(256),rg.nextInt(256),rg.nextInt(256)));
            }
        });
        return view;
    }

}

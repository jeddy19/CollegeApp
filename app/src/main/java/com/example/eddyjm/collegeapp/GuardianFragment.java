package com.example.eddyjm.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by eddyjm on 11/16/2017.
 */

public class GuardianFragment extends android.support.v4.app.Fragment {

    TextView mGFirstName;
    TextView mGLastName;
    TextView mGOccu;
    EditText mGEditFN;
    EditText mGEditLN;
    EditText mGEditOccu;
    Guardian mGuardian = new Guardian();
    Button mSubmitButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);

        mGFirstName = (TextView) rootView.findViewById(R.id.FirstName);
        mGLastName = (TextView) rootView.findViewById(R.id.LastName);
        mGOccu = (TextView) rootView.findViewById(R.id.Occupation);
        mGEditFN = (EditText) rootView.findViewById(R.id.EditFirst);
        mGEditLN = (EditText) rootView.findViewById(R.id.EditLast);
        mGEditOccu = (EditText) rootView.findViewById(R.id.EditOccupation);
        mGFirstName.setText(mGuardian.getFirstName());
        mGLastName.setText(mGuardian.getLastName());
        mSubmitButton = (Button) rootView.findViewById(R.id.submit);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v) {
               mGFirstName.setText(mGEditFN.getText());
               mGLastName.setText(mGEditLN.getText());
               mGOccu.setText(mGEditOccu.getText());
               mGEditFN.setText(" ");
               mGEditLN.setText(" ");
               mGEditOccu.setText(" ");

           }
        });

        return rootView;
    }
}

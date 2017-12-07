package com.example.eddyjm.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


/**
 * Created by eddyjm on 11/27/2017.
 */

public class ProfileFragment extends Fragment {

    TextView mPFirstName;
    TextView mPLastName;
    EditText mPEditFN;
    EditText mPEditLN;
    Profile mProfile = new Profile();
    Button mSubmitButton;
    DatePicker dob;
    Calendar calendar = Calendar.getInstance();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        mPFirstName = (TextView) rootView.findViewById(R.id.FirstName);
        mPLastName = (TextView) rootView.findViewById(R.id.LastName);
        mPEditFN = (EditText) rootView.findViewById(R.id.EditFirst);
        mPEditLN = (EditText) rootView.findViewById(R.id.EditLast);
        mPFirstName.setText(mProfile.getFirstName());
        mPLastName.setText(mProfile.getLastName());
        mSubmitButton = (Button) rootView.findViewById(R.id.submit);
        dob = (DatePicker) rootView.findViewById(R.id.dob);

        dob.init(mProfile.getDob().get(Calendar.YEAR),mProfile.getDob().get(Calendar.MONTH),mProfile.getDob().get(Calendar.DAY_OF_MONTH), null);
        mSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mPFirstName.setText(mPEditFN.getText());
                mPLastName.setText(mPEditLN.getText());
                mPEditFN.setText(" ");
                mPEditLN.setText(" ");

                int day = dob.getDayOfMonth();
                int month = dob.getMonth();
                int year = dob.getYear();

                calendar.set(year, month, day);
                mProfile.setDob(year, month, day);

            }
        });

        return rootView;
    }
}

package com.example.eddyjm.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewGroupCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eddyjm.collegeapp.R;

import org.w3c.dom.Text;

/**
 * Created by eddyjm on 11/16/2017.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {

    TextView mFMFirstName;
    TextView mFMLastName;
    EditText mFMEditFN;
    EditText mFMEditLN;
    FamilyMember mFamilyMember = new FamilyMember();
    Button mSubmitButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        mFMFirstName = (TextView) rootView.findViewById(R.id.FirstName);
        mFMLastName = (TextView) rootView.findViewById(R.id.LastName);
        mFMEditFN = (EditText) rootView.findViewById(R.id.EditFirst);
        mFMEditLN = (EditText) rootView.findViewById(R.id.EditLast);
        mFMFirstName.setText(mFamilyMember.getFirstName());
        mFMLastName.setText(mFamilyMember.getLastName());
        mSubmitButton = (Button) rootView.findViewById(R.id.submit);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v) {
               mFMFirstName.setText(mFMEditFN.getText());
               mFMLastName.setText(mFMEditLN.getText());
               mFMEditFN.setText(" ");
               mFMEditLN.setText(" ");

           }
        });

        return rootView;
    }
}

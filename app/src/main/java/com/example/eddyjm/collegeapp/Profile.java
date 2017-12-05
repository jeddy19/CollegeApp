package com.example.eddyjm.collegeapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by eddyjm on 11/27/2017.
 */

public class Profile {
    String firstName;
    String lastName;
    Date dob;
    DateFormat df = new SimpleDateFormat("dd-MM-yy");

    public Profile() {
        firstName = "Alan";
        lastName = "Turing";
        dob = df.format(dob);
    }

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

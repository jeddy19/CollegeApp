package com.example.eddyjm.collegeapp;

/**
 * Created by eddyjm on 11/27/2017.
 */

public class Guardian extends FamilyMember {
    String occupation;

    public Guardian() {
        firstName = "Ada";
        lastName = "Lovelace";
        occupation = "Occupational Therapist";
    }

    public Guardian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

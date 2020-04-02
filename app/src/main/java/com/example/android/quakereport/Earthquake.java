package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMiliseconds;


    public Earthquake(Double magnitude, String location, long timeInMiliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMiliseconds;
    }

    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getDate(){
        return mDate;
    }
    public long getTimeInMiliseconds(){
        return mTimeInMiliseconds;
    }
}

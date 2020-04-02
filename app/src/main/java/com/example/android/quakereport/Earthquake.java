package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMiliseconds;


    public Earthquake(String magnitude, String location, long timeInMiliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMiliseconds;
    }

    public String getMagnitude(){
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

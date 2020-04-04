package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private String mUrl;
    private long mTimeInMiliseconds;


    public Earthquake(Double magnitude, String location, long timeInMiliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMiliseconds;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getUrl(){
        return mUrl;
    }
    public long getTimeInMiliseconds(){
        return mTimeInMiliseconds;
    }
}

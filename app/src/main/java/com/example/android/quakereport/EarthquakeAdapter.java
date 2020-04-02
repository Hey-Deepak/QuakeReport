package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquake) {
        super(context, 0, earthquake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }


        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitudeTextView.setText(currentEarthquake.getMagnitude());


        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);

        locationTextView.setText(currentEarthquake.getLocation());

        Date dateObject = new Date(currentEarthquake.getTimeInMiliseconds());
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        String formattedDate = formatDate(dateObject);
        dateTextView.setText(formattedDate);

        TextView timeTextView = (TextView)listItemView.findViewById(R.id.time);
        String formattedTime = formatTime(dateObject);
        timeTextView.setText(formattedTime);

        return listItemView;
    }

    private String formatTime(Date dateObject) {

        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatDate(Date dateObject) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return  dateFormat.format(dateObject);
    }
}

package com.example.mohammedabraq.dentistapp;

/**
 * Created by Mohammed Abraq on 2/20/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class listAdapter extends BaseAdapter {

    ArrayList <String> mUserData;
    ArrayList <String> mSpecialityData;
    ArrayList <String> mExperienceData;
    ArrayList <String> mUnderGraduateData;
    ArrayList <String> mGraudateEducationData;
    ArrayList <String> mTimmingData;

    private LayoutInflater inflater;

    public listAdapter(DentistsListActivity dentistsListActivity, ArrayList<String> DoctorName, ArrayList<String> Speciality,
                       ArrayList<String> Experience, ArrayList<String> UnderGraduateEducation,
                       ArrayList<String> GraduateEducation, ArrayList<String> Timing){
        mUserData = DoctorName;
        mSpecialityData = Speciality;
        mExperienceData = Experience;
        mUnderGraduateData = UnderGraduateEducation;
        mGraudateEducationData = GraduateEducation;
        mTimmingData = Timing;
    }

    @Override
    public int getCount() {
        return mUserData.size();
    }

    @Override
    public String getItem(int position) {
        return mUserData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_item, parent, false);
        TextView NametextView = rowView.findViewById(R.id.docterName);
        TextView SpecialityTextView = rowView.findViewById(R.id.docterSpecialityData);
        TextView ExperiencetextView = rowView.findViewById(R.id.docterExperienceData);
        TextView TimeTextView = rowView.findViewById(R.id.docterTimingData);

        NametextView.setText(mUserData.get(position));
        SpecialityTextView.setText(mSpecialityData.get(position));
        ExperiencetextView.setText(mExperienceData.get(position));
        TimeTextView.setText(mTimmingData.get(position));
        return rowView;

        //RelativeLayout relativeLayout = new RelativeLayout(parent.getContext());

        //RelativeLayout.LayoutParams relativeLayoutParama = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.WRAP_CONTENT ,
         //       RelativeLayout.LayoutParams.WRAP_CONTENT);
        //relativeLayoutParama.addRule(relativeLayout.CENTER_IN_PARENT);

       /* TextView textView = new TextView(parent.getContext());
        textView.setText(mUserData.get(position));
        textView.setLayoutParams(relativeLayoutParama);
        textView.setTextColor(Color.WHITE);
        relativeLayout.addView(textView);

        ImageView imageView = new ImageView((parent.getContext()));
        imageView.setImageResource(R.drawable.user_icon_black);
        imageView.setLayoutParams(relativeLayoutParama);
        imageView.setPadding(0, 0 , 20,0);
        relativeLayout.addView(imageView);*/

        //return view;
    }

}
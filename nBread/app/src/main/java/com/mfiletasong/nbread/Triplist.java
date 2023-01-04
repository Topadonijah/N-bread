package com.mfiletasong.nbread;

import android.view.View;
import android.widget.Toast;

import com.mfiletasong.nbread.databinding.ChooseTripBinding;

public class Triplist {
    private int imageResourceID;
    private String tripTitle;
    private String duration;
    private String member;

    public Triplist(int id, String title, String duration, String member)
    {
        this.imageResourceID = id;
        this.tripTitle = title;
        this.duration = duration;
        this.member = member;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String getTripTitle(){
        return tripTitle;
    }

    public String getDuration() {
        return duration;
    }

    public String getMember() {
        return member;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setMember(String member) {
        this.member = member;
    }



}

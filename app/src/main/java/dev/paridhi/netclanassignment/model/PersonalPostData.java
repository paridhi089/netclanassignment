package dev.paridhi.netclanassignment.model;

import java.util.ArrayList;
import java.util.List;

public class PersonalPostData {

String name,location,occupation,photourl,about;
ArrayList<String> interests;
int distance;

    public PersonalPostData(String name, String location, String occupation, ArrayList<String> interests,  String photourl, int distance,String about) {
        this.name = name;
        this.location = location;
        this.occupation = occupation;
        this.interests = interests;
        this.photourl = photourl;
        this.distance = distance;
        this.about=about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getDistanceRange()
    {
        int lower=this.distance/100;
        lower=lower*100;
        int upper=lower+100;
        return "Within "+lower+"-"+upper+" m";
    }
    public String getInitials()
    {
        String[] names = this.name.split("\\s+");
        String initals;
        int lenArray=names.length;
        String fname=names[0];
        String lname=names[lenArray-1];
        initals=fname.substring(0,1)+lname.substring(0,1);
        return initals.toUpperCase();

    }

    public String getLocOccupation()
    {
        return this.location +" | "+this.occupation;
    }

    public String getInterestsAsString()
    {
        return String.join(" | ",this.interests);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }



    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}

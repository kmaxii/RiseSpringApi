package me.kmaxi.springapi.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entryID;
    private int userID;
    private String time;
    private double longitude;
    private double latitude;
    private String busTransport;
    private String activityChange;
    private float money;
    private boolean isOnScooter;
    private String activities;


    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setBusTransport(String busTransport) {
        this.busTransport = busTransport;
    }

    public void setActivityChange(String activityChange) {
        this.activityChange = activityChange;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void setOnScooter(boolean onScooter) {
        isOnScooter = onScooter;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public int getEntryID() {
        return entryID;
    }

    public int getUserID() {
        return userID;
    }

    public String getTime() {
        return time;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getBusTransport() {
        return busTransport;
    }

    public String getActivityChange() {
        return activityChange;
    }

    public float getMoney() {
        return money;
    }

    public boolean isOnScooter() {
        return isOnScooter;
    }

    public String getActivities() {
        return activities;
    }
}
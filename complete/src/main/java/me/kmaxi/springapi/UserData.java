package me.kmaxi.springapi;


public class UserData {
    private String time;
    private double longitude;
    private double latitude;
    private String busTransport;
    private String activityChange;
    private float money;
    private boolean isOnScooter;
    private String activities;

    // Getters and setters
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getBusTransport() {
        return busTransport;
    }

    public void setBusTransport(String busTransport) {
        this.busTransport = busTransport;
    }

    public String getActivityChange() {
        return activityChange;
    }

    public void setActivityChange(String activityChange) {
        this.activityChange = activityChange;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public boolean isOnScooter() {
        return isOnScooter;
    }

    public void setOnScooter(boolean isOnScooter) {
        this.isOnScooter = isOnScooter;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
}

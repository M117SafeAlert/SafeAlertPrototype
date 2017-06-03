package com.example.etake.safealert;

public class LocationData {
    public double currentLongitude;
    public double currentLatitude;
    public String typeDanger;

    public LocationData() {

    }

    public LocationData(double longitude, double latitude, String danger) {
        this.currentLatitude = latitude;
        this.currentLongitude = longitude;
        this.typeDanger = danger;

    }
    public double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public String getTypeDanger() {
        return typeDanger;
    }

    public void setTypeDanger(String typeDanger) {
        this.typeDanger = typeDanger;
    }

}

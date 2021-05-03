package com.travel.management.bean;

public class TravelAgencyInfo {
    private int id;
    private String travelAgencyName;
    private String ownerName;
    private String cityName;

    public TravelAgencyInfo() {
    }

    public TravelAgencyInfo(String travelAgencyName, String ownerName, String cityName) {
        this.travelAgencyName = travelAgencyName;
        this.ownerName = ownerName;
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "TravelAgencyInfo{" +
                "id=" + id +
                ", travelAgencyName='" + travelAgencyName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}

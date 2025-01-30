package com.example.dashboard.model;

public class Station {
    private String name;
    private String address;
    private boolean isOnline;
    private double onlinePercentage;
    private String workingHours;
    private double revenue;
    private double establishmentPercentage;
    private double managerPercentage;

    public Station(String s, String s1, boolean b, double v, String s2, double v1, double v2, double v3) {
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public double getOnlinePercentage() {
        return onlinePercentage;
    }

    public void setOnlinePercentage(double onlinePercentage) {
        this.onlinePercentage = onlinePercentage;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getEstablishmentPercentage() {
        return establishmentPercentage;
    }

    public void setEstablishmentPercentage(double establishmentPercentage) {
        this.establishmentPercentage = establishmentPercentage;
    }

    public double getManagerPercentage() {
        return managerPercentage;
    }

    public void setManagerPercentage(double managerPercentage) {
        this.managerPercentage = managerPercentage;
    }
}

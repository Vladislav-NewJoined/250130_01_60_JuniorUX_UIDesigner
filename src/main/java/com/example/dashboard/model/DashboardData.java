package com.example.dashboard.model;

public class DashboardData {
    private String title;
    private int value;

    // Конструкторы, геттеры и сеттеры
    public DashboardData(String title, int value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


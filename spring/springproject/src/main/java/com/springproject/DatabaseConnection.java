package com.springproject;

public class DatabaseConnection {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connecting to database at: " + url);
    }
}

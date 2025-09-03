package com.springproject;

public class UserRepository {
    private DatabaseConnection dbConnection;

    public UserRepository(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void saveUser(String name) {
        dbConnection.connect();
        System.out.println("Saving user: " + name);
    }
}


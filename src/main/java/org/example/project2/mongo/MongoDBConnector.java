package org.example.project2.mongo;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.ConnectionString;

public class MongoDBConnector {
    private MongoDatabase database;

    public MongoDBConnector() {
        try {
            // Створення підключення до MongoDB
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            // Вибір бази даних
            database = mongoClient.getDatabase("kursova");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MongoDatabase getDatabase() {
        return database;
    }
}
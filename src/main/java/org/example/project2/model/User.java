package org.example.project2.model;


import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.project2.mongo.MongoDBConnector;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public static User getByName(String username) {
        MongoDBConnector connector = new MongoDBConnector();
        MongoCollection<Document> users = connector.getDatabase().getCollection("user");
        Document user = users.find(new Document("login", username)).first();
        assert user != null;
        return new User(user.getString("login"), user.getString("password"));
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void save(User user) {
        MongoDBConnector connector = new MongoDBConnector();
        MongoCollection<Document> users = connector.getDatabase().getCollection("user");
        Document newUser = new Document("login", user.getUsername())
                .append("password", user.getPassword());
        users.insertOne(newUser);
    }


    public static boolean existsByName(String username) {
        MongoDBConnector connector = new MongoDBConnector();
        MongoCollection<Document> users = connector.getDatabase().getCollection("user");
        Document user = users.find(new Document("login", username)).first();
        return user != null;
    }

}

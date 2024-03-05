module org.example.project2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.driver.core;
    requires org.mongodb.bson;
    requires jbcrypt;


    opens org.example.project2 to javafx.fxml;
    exports org.example.project2;
    exports org.example.project2.controller;
    opens org.example.project2.controller to javafx.fxml;
}
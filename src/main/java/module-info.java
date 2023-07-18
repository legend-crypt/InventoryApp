 module com.example.konadlord {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires mysql.connector.java;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.konadulord to javafx.fxml;
    exports com.example.konadulord;
    exports com.example.konadulord.Controllers;
    exports com.example.konadulord.Controllers.Admin;
    exports com.example.konadulord.Controllers.Client;
    exports com.example.konadulord.Models;
    exports com.example.konadulord.Views;
    opens com.example.konadulord.Controllers to javafx.fxml;
}
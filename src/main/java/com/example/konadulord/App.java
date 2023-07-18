package com.example.konadulord;
# 10905415
import com.example.konadulord.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}

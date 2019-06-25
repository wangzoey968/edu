package com.controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by wangzy on 2019/6/25.
 */
public class EduApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox box = new HBox();
        stage.setWidth(600);
        stage.setHeight(300);
        stage.setScene(new Scene(box));
        stage.show();
    }
}

package com.controller;

import com.controller.ui.LoginStage;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by wangzy on 2019/6/25.
 */
public class EduApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        new Cans().loadInters();
        LoginStage.getInstance().show();
        Cans.getUserService().saveUser();
    }

}

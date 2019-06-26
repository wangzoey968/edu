package com.controller.ui;

import com.util.FxmlUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by wangzy on 2019/6/26.
 */
public class LoginStage extends Stage {

    //单例
    private static LoginStage login = null;

    public static LoginStage getStage() {
        if (login == null) login = new LoginStage();
        return login;
    }

    @FXML
    private ComboBox<String> cmbUsername;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Button btnLogin, btnExit;

    public LoginStage() {
        Node node = FxmlUtil.loadFXML(this);
        initStyle(StageStyle.UNDECORATED);
        HBox box = new HBox();
        box.getChildren().add(node);
        setScene(new Scene(box));

        btnLogin.setOnAction(e -> {
            e.consume();
            close();
            MainFrame.getFrame().show();
        });

    }

}

package com.controller.ui;

import com.controller.Cans;
import com.util.FxmlUtil;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by wangzy on 2019/6/26.
 */
public class LoginStage extends Stage {

    //单例
    private static LoginStage login = null;

    public static LoginStage getInstance() {
        if (login == null) login = new LoginStage();
        return login;
    }

    @FXML
    private ComboBox<String> cmbUsername;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Button btnLogin, btnExit;

    private LoginStage() {
        initStyle(StageStyle.UNDECORATED);
        setScene(new Scene((Parent) FxmlUtil.loadFXML(this)));

        btnLogin.setOnAction(e -> {
            e.consume();
            close();
            MainFrame.getInstance().show();
        });
        btnExit.setOnAction(e -> {
            e.consume();
            //close();
            Cans.getUserService().saveUser();
        });
    }

}

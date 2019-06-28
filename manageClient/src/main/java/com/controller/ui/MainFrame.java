package com.controller.ui;

import com.util.FxmlUtil;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by wangzy on 2019/6/26.
 */
public class MainFrame extends Stage {

    //单例
    private static MainFrame mainFrame = null;

    public static MainFrame getInstance() {
        if (mainFrame == null) mainFrame = new MainFrame();
        return mainFrame;
    }

    private MainFrame() {
        setTitle("XXXX");
        setScene(new Scene((Parent)FxmlUtil.loadFXML(this)));
    }

}

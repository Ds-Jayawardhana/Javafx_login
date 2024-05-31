package com.example.login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class LoginController2 {

    @FXML
    Label nameLabel;

    public void displayName(String username) {
        nameLabel.setText("Hello:" + username);
    }



    }


package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegController {
    @FXML
    private Button signUp;
    @FXML
    private Label errorMessage;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private CheckBox checkBox;

    @FXML
    protected void signup(ActionEvent event){
        if (firstName.getText().isBlank() || lastName.getText().isBlank() || email.getText().isBlank() || phone.getText().isBlank() || passwordField.getText().isBlank() || confirmPasswordField.getText().isBlank() || checkBox.isSelected() == false){
            errorMessage.setText("Something went wrong. Try again.");
        } else{
            // updates DB with user information
            errorMessage.setText("Registration complete."); // temporary placeholder
        }
    }
}

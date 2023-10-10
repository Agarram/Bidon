package sio.bidongithub;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick( ){
        elcomeText.setText("Welcome to JavaFX Application!");
    }
}
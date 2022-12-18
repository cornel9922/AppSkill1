package main.appskill1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignIn_button;

    @FXML
    private Text joke_text_main;

    @FXML
    void onImageClick(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert SignIn_button != null : "fx:id=\"SignIn_button\" was not injected: check your FXML file 'signUp-view.fxml'.";
        assert joke_text_main != null : "fx:id=\"joke_text_main\" was not injected: check your FXML file 'signUp-view.fxml'.";

    }

}

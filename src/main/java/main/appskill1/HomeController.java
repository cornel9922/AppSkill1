package main.appskill1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text joke_text_main;

    @FXML
    void onImageClick(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert joke_text_main != null : "fx:id=\"joke_text_main\" was not injected: check your FXML file 'Home-view.fxml'.";

    }

}

package main.appskill1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text joke_text_main;
    private boolean imageClicked = false;
    int count = 0;
    @FXML
    protected void onImageClick() {
            count++;
            if ((count % 2) == 0) joke_text_main.setText("");
                else              joke_text_main.setText("Don't click me pleeeease");
    }

    @FXML
    void initialize() {
    }

    public void openNewScene(String window) {

    }

}

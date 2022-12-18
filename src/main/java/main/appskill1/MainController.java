package main.appskill1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignIn_button;

    @FXML
    private Button SignUp_button;

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
        SignIn_button.setOnAction(actionEvent -> {
            openNewScene(SignIn_button,"Home-view.fxml");
        });
        SignUp_button.setOnAction(actionEvent -> {
            openNewScene(SignUp_button, "signUp-view.fxml");
        });
    }

    public void openNewScene(Button button, String window) {
        button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainPage.class.getResource(window));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

}

package main.appskill1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField logIn_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signIn_button;

    @FXML
    private Button signUp_button;

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
        signIn_button.setOnAction(actionEvent -> {
            openNewScene(signIn_button,"Home-view.fxml");
        });
        signUp_button.setOnAction(actionEvent -> {
            openNewScene(signUp_button, "signUp-view.fxml");
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
        stage.getIcons().add(new Image("C:\\Users\\Cornel\\IdeaProjects\\AppSkill1\\src\\main\\resources\\images\\app_image.png"));
        stage.setTitle("CornelApp");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }

}

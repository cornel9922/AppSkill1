package main.appskill1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField email_field;

    @FXML
    private TextField firstName_field;

    @FXML
    private CheckBox gender_box1;

    @FXML
    private CheckBox gender_box2;

    @FXML
    private Text joke_text_main;

    @FXML
    private TextField lastName_field;

    @FXML
    private TextField location_field;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUp_button;

    @FXML
    void onGenderBox1_click(ActionEvent event) {
        gender_box1.setSelected(true);
        gender_box2.setSelected(false);
    }

    @FXML
    void onGenderBox2_click(ActionEvent event){
        gender_box1.setSelected(false);
        gender_box2.setSelected(true);

    }

    @FXML
    void onImageClick(MouseEvent event) {

    }
    @FXML
    void initialize() {
        signUp_button.setOnAction(actionEvent ->  {
            new MainController().openNewScene(signUp_button, "appskill1-view.fxml");
        });
    }

}

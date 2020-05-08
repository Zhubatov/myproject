package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpName;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpNumber;

    @FXML
    private TextField login_field;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        signUpButton.setOnAction(event -> {
            dbHandler.signUpUser(signUpNumber.getText(),signUpName.getText(),
                    signUpLastName.getText(),login_field.getText(),password_field.getText(),"12345");
                });


    }
}

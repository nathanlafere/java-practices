import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Exercise004Controller {
    String a = "a";
    String b = "b";
    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordField;

    @FXML
    private Button registerButton;

    @FXML
    private TextField usernameField;

    @FXML
    void tryLogin(ActionEvent event) {
        if (usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            System.out.println("Please enter your username and password!");
        }else if (a.contains(usernameField.getText()) && b.contains(passwordField.getText())) {
            System.out.println("login made with the user "+usernameField.getText());
        } else {
            System.out.println("incorrect username or password.");
        }
    }

}
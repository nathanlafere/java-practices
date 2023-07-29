import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Hashtable;

public class Exercise004Controller {
    private Hashtable<String,String> accounts = new Hashtable<String,String>();
    private Stage stage;
    private Scene scene;
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
        }else if (accounts.containsKey(usernameField.getText()) && accounts.get(usernameField.getText()).equals(passwordField.getText())) {
            System.out.println("login made with the user "+usernameField.getText());
            try {
                switchScene(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("incorrect username or password.");
        }
    }
    @FXML
    void createAccount(ActionEvent event) {
        if (!((Hashtable<String, String>) accounts).containsKey(usernameField.getText())) {
            accounts.put(usernameField.getText(),passwordField.getText());
        }
    }
    
    public void switchScene(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("exercise004layout02.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Exercise004 - Greetings");
        stage.setScene(scene);
        stage.show();
    }
}
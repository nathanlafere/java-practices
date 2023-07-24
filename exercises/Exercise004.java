import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise004 extends Application {
    public static void main(String[] args) throws Exception{
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("exercise004layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene screen = new Scene(root);
        primaryStage.setTitle("Exercise004");
        primaryStage.setScene(screen);
        primaryStage.show();
    }
}
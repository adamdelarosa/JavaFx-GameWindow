package Game.Main;

import Game.KeyWindow.KeyboardSet;
import Game.Pic.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by ROSA on 4/3/16.
 */
public class Main extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    Parent root;

    @Override
    public void start(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getClassLoader().getResource("Game/Frame/windows.fxml"));
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(root, 600, 750));
        stage.show();


        mission();

    }

    public void mission(){
        KeyboardSet keyboardSet = new KeyboardSet();
        BackGround backGround = new BackGround();
    }
}

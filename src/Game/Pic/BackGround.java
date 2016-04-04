package Game.Pic;

import Game.Main.Main;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by ROSA on 4/3/16.
 */

public class BackGround {

    Main stageer;

    public BackGround(Main Stageer){
        Stageer = stageer;
    }

    public void backGround(){
        Stageer.fon.setTitle("fuck me.");

        BackgroundImage myBI= new BackgroundImage(new Image("my url",32,32,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
//then you set to your node
      //  myContainer.setBackground(new Background(myBI));

    }
}

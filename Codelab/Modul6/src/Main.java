import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    MediaPlayer jazzPlayer;

    @Override
    public void start(Stage primaryStage) {
        Media jazz = new Media(new File("src/sounds/jazz_with_clock_combined.wav").toURI().toString());
        jazzPlayer = new MediaPlayer(jazz);
        jazzPlayer.setVolume(0.4);
        jazzPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        jazzPlayer.play();

        new TebakAngkaApp().start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
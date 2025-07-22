package org.example.designpattternscode.Singleton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private final AudioPlayer player = new AudioPlayer();
    private final TextArea logArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {

        Button playBtn = new Button("Play/Pause");
        Button nextBtn = new Button("Next");
        Button prevBtn = new Button("Previous");
        Button lockBtn = new Button("Lock/Unlock");
        Button showLogsBtn = new Button("Show Logs");
        Button clearLogsBtn = new Button("Clear Logs");


        playBtn.setOnAction(e -> player.clickPlay());
        nextBtn.setOnAction(e -> player.clickNext());
        prevBtn.setOnAction(e -> player.clickPrevious());
        lockBtn.setOnAction(e -> player.clickLock());

        showLogsBtn.setOnAction(e -> {
            logArea.clear();
            Logger.getInstance().getLogHistory().forEach(log -> logArea.appendText(log + "\n"));
        });
        clearLogsBtn.setOnAction(e -> {
            logArea.clear();
            Logger.getInstance().removeHistory();

        });

        HBox controls = new HBox(10, playBtn, nextBtn, prevBtn, lockBtn, showLogsBtn,clearLogsBtn);
        VBox layout = new VBox(10, controls, logArea);
        layout.setPadding(new javafx.geometry.Insets(10));

        Scene scene = new Scene(layout, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Audio Player (State Pattern)");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

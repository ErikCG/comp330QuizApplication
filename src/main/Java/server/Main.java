package server;

import org.json.simple.parser.JSONParser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage primaryStage) throws Exception {

    QProcessor tester =
        new QProcessor("C:/Users/Brian/git/comp330QuizApplication/TestQProcessor.json");

    // Quiz Elements
    primaryStage.setTitle("Quiz Game");
    primaryStage.setScene(TitleScreen.createTitleScreen());

    // Button Functions
    TitleScreen.setTakeButton(primaryStage);

    primaryStage.show();
  }
}

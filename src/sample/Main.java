package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("BakuSoft");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
        System.out.println("Thank You For Using BakuSoft Copyright: 2017 "+ date());
    }


    public static void main(String[] args) {
        launch(args);
    }
}

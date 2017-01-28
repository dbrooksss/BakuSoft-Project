package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("BakuSoft");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
        System.out.println("Thank You For Using BakuSoft Copyright: 2017 " + date());

        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@Baku:1521:xe","CHARLES","agbakwu");
           Statement statement = con.createStatement();
           ResultSet rs =statement.executeQuery("Select * from Students");
           while(rs.next()){
               System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
           }
    con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

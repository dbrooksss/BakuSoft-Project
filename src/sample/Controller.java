package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller{
	@FXML
	private Label user;
	@FXML
	private Label pass;
	@FXML
	public Button button;
	@FXML
	public Button button2;
	@FXML
	public TextField username;
	@FXML
	public PasswordField password;
	@FXML
	public Label values;
	@FXML
	public Label title;

	@FXML
	public void initialize(){
		title.setTextFill(Color.BLUE);
		title.setFont(Font.font("Serif", 14));
	}

	@FXML
	public void help(){
		// do something here
	}

	@FXML
	public void doSomething(){
		if((username.getText().equals("John")) && (password.getText().equals("Doe"))){
			values.setTextFill(Color.GREEN);
			values.setFont(Font.font("Serif", 14));
			values.setText("Login Successful, Welcome " + username.getText() + "!");
		}else if((username.getText().isEmpty()) || (password.getText().isEmpty())){
			values.setTextFill(Color.RED);
			values.setFont(Font.font("Serif", 14));
			values.setText("Please Enter A Valid Username and Password");
		}else{
			values.setTextFill(Color.RED);
			values.setFont(Font.font("Serif", 14));
			values.setText("Please Enter A Valid Username and Password");
		}

		try{
			
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Baku:1522:xe", "charles", "agbakwu");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("Select * from Employees");
			while(rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
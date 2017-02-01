package sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class blah{
	public static void main(String[] args){

		DatabaseObject dbo = new DatabaseObject();
		runDB(dbo);
	}

	private static void runDB(DatabaseObject dbo){
		try{

			Connection con = dbo.getConnection();

			Statement statement = con.createStatement();
			String query = "Select LastName from Employees";
			ResultSet rs = statement.executeQuery(query);

			String column1 = "";
			String name = "Smith";

			while(rs.next()){
				column1 = rs.getString(1);
				System.out.println("LastName: " + column1);
				if(name.equalsIgnoreCase(column1)){
					System.out.println("A MATCH: " + column1 + "\n");
				}else{	
					System.out.println("NOT A MATCH! \n");
				}			
			}

			con.close();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Unable to Connect.");
		}
	}
}

package login_page;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class login_page_server {

	public static void main(String[] args) {
		try{
			String temp;
			ServerSocket srvsocket = new ServerSocket(7777);
			Socket socket = srvsocket.accept();
			Connection db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_login_credentials","root",null);
			Statement stmt = db_con.createStatement();
			Scanner sc_client = new Scanner(socket.getInputStream());
			PrintStream printstream = new PrintStream(socket.getOutputStream());
			String usr = sc_client.nextLine();
			String passwd = sc_client.nextLine();
			ResultSet result = stmt.executeQuery("Select * From db_users Where usr_name = "+"\""+usr+"\""+" And usr_passwd = "+"\""+passwd+"\"");
			while(result.next()){
				String uname = result.getString("usr_name");
				String upasswd = result.getString("usr_passwd");
				if(uname == usr && passwd == upasswd){
					temp = "Hello"+uname+"!";
				}
				else{
					temp = "Invalid username and/or password combination.";
				}
				
				printstream.println(temp);
			}
			
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

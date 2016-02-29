import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		try{
			Connection mysqlconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", null);
			Statement mysqlstmt = mysqlconn.createStatement();
			ResultSet result = mysqlstmt.executeQuery("Select * From Emp");
			while(result.next()){
				System.out.println(result.getString("EmpName")+","+result.getString("DeptName"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

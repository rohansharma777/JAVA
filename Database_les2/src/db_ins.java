import java.sql.*;

public class db_ins {

	public static void main(String[] args) {
		try{
			Connection insconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", null);
			Statement insstmt = insconn.createStatement();
			String sql = "insert into Emp" + " (EmpID,EmpName,DeptNO,DeptName)" + " values (20169,'Bablo',414,'CE')";
			insstmt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

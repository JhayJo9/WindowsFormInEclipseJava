package googleMain;
import java.sql.*;
public class Google1 {
	public static void main (String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jhay","root","");
		Statement stmt = con.createStatement();
		System.out.print("inserting records");
		String sql = "Insert into UserName values(20)";
		stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
 

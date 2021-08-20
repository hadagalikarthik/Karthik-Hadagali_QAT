import java.sql.*;

/*
 * 2. Write a JDBC Program in which first you create a connection 
 * with Oracle database Update a record in an existing table where id = 3 
 * and then fetch and print all the records data as output in java.
 */
public class JavaJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			String username = "karthik";
			String password = "hkpass";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connected...!");
			Statement stmt = con.createStatement();
			String u1 = "update student set name = 'Karthik',city = 'Bengaluru' where id=3";
			stmt.executeUpdate(u1);
			System.out.println("Record Updated...!");
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()){
				System.out.println(rs.getString("id")+' '+rs.getString("name") + ' ' +rs.getString("city"));
			}
			con.close();

	}

}

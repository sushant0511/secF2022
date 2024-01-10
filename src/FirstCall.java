import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstCall {
	public static void main(String[] args) {

		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");  // exception
		System.out.println("Driver found");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1222", "root", "root");
		System.out.println("Connection Success");
		Statement statement=connection.createStatement(); // execeute all query
		ResultSet set=statement.executeQuery("SELECT * FROM `1222`.student");
		while(set.next())
		{
			System.out.println(set.getInt(1)+"  "+set.getString(2)+"  "+set.getFloat(3));
		}
		
		
		
		
		
		
		}
		
		catch (Exception ee) {
			System.out.println("Error is = "+ee);
		}
	}

}

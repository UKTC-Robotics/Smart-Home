
package databaseConn;
import java.sql.*;

public class connectivity{

	//autoReconnect=true&useSSL=true
	
public static Connection connectivity() {
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Driver is not aplied");
			}
			
				String path = "jdbc:mysql://localhost:3306/homeautomation?characterEncoding=utf8&autoReconnect=true&useSSL=true";
				String name = "root";
				String pass = "admin";
				Connection con = null;
				
				try{
				con = DriverManager.getConnection(path, name, pass);
			    }
				
				catch(SQLException ex){
					
				ex.printStackTrace();
				System.out.println("Not connected to the database " + ex);
				
				}
		return con;	
    }
}

=======
package databaseConn;
import java.sql.*;

public class connectivity{

	//autoReconnect=true&useSSL=true
	
public static Connection connectivity() {
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Driver is not aplied");
			}
			
				String path = "jdbc:mysql://localhost:3306/homeautomation?characterEncoding=utf8&autoReconnect=true&useSSL=true";
				String name = "root";
				String pass = "admin";
				Connection con = null;
				
				try{
				con = DriverManager.getConnection(path, name, pass);
			    }
				
				catch(SQLException ex){
					
				ex.printStackTrace();
				System.out.println("Not connected to the database " + ex);
				
				}
		return con;	
    }
}



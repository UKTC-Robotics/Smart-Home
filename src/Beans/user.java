
package Beans;

import java.io.PrintWriter;
import java.sql.*;
import javax.xml.bind.DatatypeConverter;
import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.*;

import databaseConn.*;


public class user {


	private String firstName;
	private String lastName;
	private String userName;
	private String eMail;
	private String country;
	private String pass;
	
	
    public user(String firstName, String lastName, String userName, 
			String eMail, String country, String pass) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.userName=userName;
    	this.eMail=eMail;
    	this.country=country;
    	this.pass=pass;
    
    
	}
    
    public user( String userName, String pass) {
    	this.userName=userName;
    	this.pass=pass;
	}
public void hash() {
    SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest512();
    byte[] digest = digestSHA3.digest(pass.getBytes());
    pass=Hex.toHexString(digest);
    System.out.println("SHA3-512 = " + pass);

}
    
    public  void insertIntoDB()	{
    	hash();
    	java.sql.PreparedStatement ps;
    	Connection con=connectivity.connectivity();
    	String query = "insert into user(firstName, lastName, userName, eMail, country, pass) value(?,?,?,?,?,?)";
    	try {
    	ps = con.prepareStatement(query);		 
		System.out.println(lastName);
		 ps.setString(1,firstName);
		 ps.setString(2,lastName);
		 ps.setString(3,userName);
		 ps.setString(4,eMail);
		 ps.setString(5,country);
		 ps.setString(6,pass);
		 ps.executeUpdate();
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    		}
    	}
    
    public void userCheking() {
    	java.sql.PreparedStatement ps;
        Connection con;
        ResultSet rs;
        hash();
        String query = "SELECT * FROM user WHERE userName=? AND pass=?";
try {
        con=connectivity.connectivity();
 		 ps = con.prepareStatement(query);		 
		 ps.setString(1,userName);
		 ps.setString(2,pass);
		 ps.executeQuery();
		 rs=ps.executeQuery();
		if(rs.first())
		{System.out.println("Logging successful");
    }
		else {
			 System.out.println("Logging unsuccesful, please try again");
		 }
}
		 catch(SQLException e) {
	    		e.printStackTrace();		
    }
}
    }



=======
package Beans;

import java.sql.*;

import javax.xml.bind.DatatypeConverter;

import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.*;

import databaseConn.*;


public class user {


	private String firstName;
	private String lastName;
	private String userName;
	private String eMail;
	private String country;
	private String pass;
	
	
    public user(String firstName, String lastName, String userName, 
			String eMail, String country, String pass) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.userName=userName;
    	this.eMail=eMail;
    	this.country=country;
    	this.pass=pass;
    
    
	}
public void hash() {
	String input = "Hello world !";
	String str;
    SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest512();
    byte[] digest = digestSHA3.digest(pass.getBytes());
    str=Hex.toHexString(digest);
    System.out.println("SHA3-512 = " + str);
    byte[] bytes = DatatypeConverter.parseHexBinary(str);
    String result= new String(bytes);
pass=result;

}
    
    public  void insertIntoDB()	{
    	hash();
    	java.sql.PreparedStatement ps;
    	Connection con=connectivity.connectivity();
    	String query = "insert into user(firstName, lastName, userName, eMail, country, pass) value(?,?,?,?,?,?)";
    	try {
    	ps = con.prepareStatement(query);		 
		System.out.println(lastName);
		 ps.setString(1,firstName);
		 ps.setString(2,lastName);
		 ps.setString(3,userName);
		 ps.setString(4,eMail);
		 ps.setString(5,country);
		 ps.setString(6,pass);
		 ps.executeUpdate();
    	}
    	catch(SQLException e) {
    		e.printStackTrace();}
    }
}

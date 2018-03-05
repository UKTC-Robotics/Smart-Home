
package Beans;

public class admin {

	private String firstName;
	private String userName;
	private String pass;

	
	public admin(String firstName, String userName, String pass) {
		
		this.firstName = firstName;
		this.userName = userName;
		this.pass = pass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
=======
package Beans;

public class admin {

	private String firstName;
	private String userName;
	private String pass;
	
	public admin(String firstName, String userName, String pass) {
		
		super();
		this.firstName = firstName;
		this.userName = userName;
		this.pass = pass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}

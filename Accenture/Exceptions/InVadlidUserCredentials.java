/* Activity
Exception Handling
-------------------
1. Create a main class 
	a) inside the main method get two values from the user
	username & password using scanner
	b) invoke the method validateUserCredentials() which takes username & password as parameter
	c) inside the validateUserCredentials() check whether the username is valid "admin" & password is "admin@123"
	using if statement
	d) if valid print "Welcome user"
	e) if invalid raise a custom exception "InvalidUserCredentialsException" using throw keyword.
	with error message "Invalid Credentials"
2. Create the custom exception class "InvalidUserCredentialsException" with two constructors default & parameterized (String)
3. use throws declaration to propagate the exception from called method to calling method.
*/

package com.accenture.corejava;
public class InvalidUserCredentialsException extends Exception{
	public InvalidUserCredentialsException() {
		super();
	}
	public InvalidUserCredentialsException(String message) {
		super(message);
	}
}

/* --------------------------------------------------------------------------------------------------------------------------*/

package com.accenture.corejava;
import java.util.Scanner;
public class Main {
	public static void validateUserCredentials(String user, String pass) throws InvalidUserCredentialsException{
		if(user.equals("admin") == false || pass.equals("admin@123")==false) {
			throw new InvalidUserCredentialsException("Invalid Credentials");
		}
		else {
		System.out.println("Welcome user");
		}
	}
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the user name: ");
		String username = s.next();
		System.out.println();
		System.out.print("Enter the password: ");
		String password = s.next();
		try {
			validateUserCredentials(username, password);
		}catch(InvalidUserCredentialsException e) {
			e.printStackTrace();
		}
	}
}

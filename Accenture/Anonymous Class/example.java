package oops;

public interface Vehicle{
	public void greet(String message);
	public void greetMe();
}


/*---------------------------------------------------------------------------------------------------------------------*/

package oops;
public class TestVehicle {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(){   //Here we are creating an anonymous class, which doesn't have name and implements Vehicle interface. Syntax looks like we are creating an object of Vehicle interface, but what’s actually happening in that code is that an instance of an anonymous class is being created.
			public void greet(String message) {
				System.out.println("Hi I am " + message);
			}
			public void greetMe() {
				System.out.println("Hello User, I'm greeting you");
			}
		};    //anonymous class must be closed with semicolon
		v.greet("eshan");
		v.greetMe();
	}
}


//We cannot create a variable in anonymous class and access it outside it
//eg:
package oops;

public interface Vehicle{
	public void greet(String message);
	public void greetMe();
}
/*-----------------------------------------------------------------------------------------------------------*/
package oops;
public class TestVehicle {

	public static void main(String[] args) {
Vehicle v = new Vehicle(){
      int x = 200;
			public void greet(String message) {
				System.out.println("Hi I am " + message);
			}
			public void greetMe() {
				System.out.println("Hello User, I'm greeting you");
			}
			
		};
System.out.println(v.x);   //This is not possible, it leads to error [x cannot be resolved or is not a field]



/*---------------------------------------------------------------------------------------------------------------------
  --------------------------------------------------------------------------------------------------------------------*/

    
//But, if we create a variable in the interface itself, then we can use that variable, it doesnt give error.

package oops;
public interface Vehicle{
	public void greet(String message);
	public void greetMe();
	public int x = 100;    //creating the variable in interface itself
}

/*-----------------------------------------------------------------------------------------------------------------------*/
package oops;
public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(){
			public void greet(String message) {
				System.out.println("Hi I am " + message);
			}
			public void greetMe() {
				System.out.println("Hello User, I'm greeting you");
			}
		};
		v.greet("eshan");
		v.greetMe();
		System.out.println(v.x);   //It WORKS perfectly fine.
	}
}



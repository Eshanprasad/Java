package javaeightfeatures;
public interface Vehicle{
	public void greet(String message);
}

/*---------------------------------------------------------------------------------------------------------------------*/

package javaeightfeatures;
public class TestVehicle {

	public static void main(String[] args) {
		Vehicle veh = (message) -> System.out.println("Welcome "+ message);  //Vehicle veh = (message) -> {System.out.println("Welcome "+message);};

		veh.greet("eshan");
	}
}

//output: Welcome eshan

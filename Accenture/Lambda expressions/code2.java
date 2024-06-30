
package practice;

public interface Sample {
	void display(String message);
}

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------*/

package practice;

public class Test {
	public final static void main(String args[]){
		Sample s = new Sample() {
			public void display(String message) {
				System.out.println(message + " message from anonymous class");
			}
		};
		Sample s1 = (message)->System.out.println(message + " message from lambda");
		s.display("Hello");
		s1.display("Hello");
	}
}

/*
output:
Hello message from anonymous class
Hello message from lambda
*/

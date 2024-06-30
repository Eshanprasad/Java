package practice;

public class Printer {
	 int inkLevel = 20;
	 void printInkLevel() {
	 System.out.println(inkLevel);
	 }
	}


/*----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
package practice;

public class LaserPrinter extends Printer{
	int pagesPerMin = 10;
	 void printPagesPerMin() {
	 System.out.println(pagesPerMin);
	 }
}

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------*/

package practice;
public class Test {
	public static void main(String s[]){
		Printer myprinter = new LaserPrinter();
		System.out.println(((LaserPrinter)myprinter).pagesPerMin);
		 myprinter.printInkLevel();
	}
}


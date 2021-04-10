//Implement a main() function that will carry out the following instructions:
//▪ Instantiate a grove object named Grove One
//▪ Print the grove object named Grove One
//▪ Instantiate seven Tree objects of species Fir and age 20, and add them to Grove One
//▪ Print the grove object named Grove One
//▪ Remove the Trees from Grove One at index 3 and 5.
//▪ Print the grove object named Grove One
//▪ Instantiate one Tree object of species Pine and age 10, and add it to Grove One
//▪ Print the grove object named Grove One


public class GroveTester {

	public static void main(String[] args) {
		// instantiate grove
		Grove grove = new Grove("Randall Orchards");
		// print the grove
		System.out.println(grove);
		// instantiate 7 fir trees, each age 20, and add them to Grove One
		for (int j = 0; j < 7; j++) {
			grove.Plant(new Tree(j, 20, "Fir"));}
		// print Grove One (using its ToString())
		System.out.println(grove);
		// Remove the Trees from Grove One at index 3 and 5.
		grove.uproot(3);
		grove.uproot(5);
		// print Grove One
		System.out.println(grove);
		// Instantiate one Tree object of species Pine and age 10
		Tree Pine = new Tree(0,10,"Pine");
		// plant the pine in Grove One
		grove.Plant(Pine);
		// print Grove One
		System.out.println(grove);
	}
}
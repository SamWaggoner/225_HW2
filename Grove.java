//◦ Contains two instance variables for an Array of Trees (size 12), and a grove name
//◦ Implements a parameterized constructor that takes (and sets) a single parameter for the name
//of the grove
//◦ Implements a method that will plant a Tree object in the first available spot. The method
//should take a Tree object as a parameter, and return an int identifying the spot where the tree
//is planted. If no spots are open, return -1.
//◦ Implements a method that will remove a Tree object from a given spot. The method should
//take an int as a parameter, and remove and return the Tree object at that location in the array.
//◦ Implement a ToString() method that will print a single int representing the number of Tree's in
//the array


public class Grove {
	String groveName;
	
	//◦ Contains two instance variables for an Array of Trees (size 12), and a grove name
	Tree[] grove = new Tree[12];
		
	//◦ Implements a parameterized constructor that takes (and sets) a single parameter for the name
	//of the grove
	public Grove(String groveName) {
		this.groveName = groveName;
	}

//Implements a method that will plant a Tree object in the first available spot. The method
//should take a Tree object as a parameter, and return an int identifying the spot where the tree
//is planted. If no spots are open, return -1.
	public int Plant(Tree spot){
		for (int i = 0; i < 12; i++) {
			if (grove[i] == null) {
				grove[i] = spot;
				return i;
			}
		}
			return -1;
	}

	
	public Tree uproot(int spot) {
		Tree uprootedTree = grove[spot];
		grove[spot] = null;
		return uprootedTree;
	}
	
	// Create a toString() with a single int representing the number of trees in the arary
	@Override
	public String toString() {
		int numPlantedTrees = 0;
		for (int i = 0; i < 12; i++) {
			if (grove[i] != null) {
				numPlantedTrees ++;
			}
		}
		return numPlantedTrees + "";
	}
	
}

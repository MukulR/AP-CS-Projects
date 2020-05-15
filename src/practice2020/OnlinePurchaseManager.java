package practice2020;

import java.util.ArrayList;

public class OnlinePurchaseManager {
	// Solver's note: I'm assuming some of the methods are implemented,
	// as mandated by the problem statement. This code will not compile
	// due to the lack of certain methods.
	
	/**
	 * An ArrayList of purchased Gizmo objects, instantiated in the constructor.
	 */
	private ArrayList<Gizmo> purchases;
	
	/**
	 * Returns the number of purchased Gizmo objects that are electronic and are
	 * manufactured by maker, as described in part (a).
	 */
	public int countElectronicsByMaker(String maker) {
		int gizmosMadeByMaker = 0;
		for(Gizmo gizmo : purchases) {
			if(gizmo.getMaker().equals(maker)) {
				gizmosMadeByMaker++;
			}
		}
		return gizmosMadeByMaker;
	}

	/**
	 * Returns true if any pair of adjacent purchased Gizmo objects are equivalent,
	 * and false otherwise, as described in part (b).
	 */
	public boolean hasAdjacentEqualPair() {
		for(int i = 0; i < purchases.size() - 1; i++) {
			if(purchases.get(i).equals(purchases.get(i+1))) {
				// The equals() used in this method is a method in the Gizmo class.
				// Compiles because of String's equal method
				return true;
			}
		}
		return false;
	}

	// There may be instance variables, constructors, and methods not shown
}

/**
 * To write the getCheapestGizmoByMaker() method, I would make the following changes:
 * Write the method with header: public Gizmo getCheapestGizmoByMaker(String maker)
 * Add a "price" field in the gizmo class: private int price;
 * Add a price parameter in the gizmo constructor so the price field can be set
 * Add a method in the gizmo class that returns the price of a gizmo: 
 *     getPrice() { return this.price; } 
 */

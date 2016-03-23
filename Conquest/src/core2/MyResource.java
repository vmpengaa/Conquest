package core2;

import java.util.ArrayList;

import data.Material;
import data2.Resource;

public class MyResource {
	/**
	 * Liste de toute mes resources (cf. repertoire).
	 */
	protected ArrayList<Resource> myRsrc = new ArrayList<Resource>();
	
	/**
	 * Consultation de mes resources
	 */
	public String toString() {
		String result = "";
		for (Resource rsrc : myRsrc) {
			result += rsrc.toString() + "\n";
		}
		return result;
	}
	
	/**
	 * Ajouter une resources dans ma liste
	 */
	public void add(Resource rsrc) {
		if (myRsrc.contains(rsrc)) {
			rsrc.setAmount(rsrc.getAmount() + 1);
		} else {
			myRsrc.add(rsrc);
		}
	}
	
	
	/**
	 * 
	 */
	
	/**
	 * 
	 */
}

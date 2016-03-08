package core;

import java.util.ArrayList;
import java.util.Iterator;

import data.Material;

public class MyMaterial {
	private ArrayList<Material> myMaterial = new ArrayList<Material>();

	public void add(Material material) {
			myMaterial.add(material);
	}
	
	public Material searchByName(String name) {
		Material result = null;
		Iterator<Material> iterator = myMaterial.iterator();
		
		while (iterator.hasNext()) {
			Material material = iterator.next();
			if (material.getName().equals(name)) {
				result = material;
			}
		}
		if (result == null) {
			System.out.println("mess d'erreur1." + result);
		} else {
			return result;
		}
		return result;
	}

	public void remove(Material material) {
		myMaterial.remove(material);
	}

	public void removeAll() {
		myMaterial.clear();
	}

	public int getCurrentMaterialCount() {
		return myMaterial.size();
	}
	
	public String toString() {
		String result = "";
		for (Material material : myMaterial) {
			result += material.toString() + "\n";
		}
		return result;
	}
}

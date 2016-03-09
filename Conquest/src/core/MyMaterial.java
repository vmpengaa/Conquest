package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import data.Material;

public class MyMaterial {
	private ArrayList<Material> myMaterial = new ArrayList<Material>();

	public void add(Material material) {
		if (myMaterial.contains(material)) {
			material.setAmount(material.getAmount() + 1);
		} else {
			myMaterial.add(material);
		}
	}
	
	public Material searchByName(String name) throws NoSuchElementException {
		Material result = null;
		Iterator<Material> iterator = myMaterial.iterator();
		
		while (iterator.hasNext()) {
			Material material = iterator.next();
			if (material.getName().equals(name)) {
				result = material;
			}
		}
		if (result == null) {
			throw new NoSuchElementException("L'objet " + name + " n'existe pas.");
		}
		else {
			return result;
		}
	}

	public void remove(Material material) {
		myMaterial.remove(material);
	}

	public void removeAll() {
		myMaterial.clear();
	}

	public int getCurrentMaterialCount() {
		int size = 0; 
		
		for (Material material : myMaterial) {
			size = size + (1 * material.getAmount());
		}
		return size;
	}
	
	public String toString() {
		String result = "";
		for (Material material : myMaterial) {
			result += material.toString() + "\n";
		}
		return result;
	}
}

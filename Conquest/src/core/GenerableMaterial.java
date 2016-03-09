package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import data.Material;

public class GenerableMaterial {
	private ArrayList<Material> generableMaterial = new ArrayList<Material>();

	public void add(Material material) {
		if (generableMaterial.contains(material)) {
			material.setAmount(material.getAmount() + 1);
		} else {
			generableMaterial.add(material);
		}
	}
	
	public Material searchByName(String name) throws NoSuchElementException {
		Material result = null;
		Iterator<Material> iterator = generableMaterial.iterator();
		
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
		generableMaterial.remove(material);
	}

	public void removeAll() {
		generableMaterial.clear();
	}

	public int getCurrentGenerableMaterialCount() {
		int size = 0; 
		
		for (Material material : generableMaterial) {
			size = size + (1 * material.getAmount());
		}
		return size;
	}
	
	public String toString() {
		String result = "";
		for (Material material : generableMaterial) {
			result += material.toString() + "\n";
		}
		return result;
	}
}

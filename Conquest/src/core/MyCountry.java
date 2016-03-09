package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import data.Country;
import exception.CountryAlreadyExistsException;

/**
 * @author Vmpengaa
 *
 */
public class MyCountry {
	private ArrayList<Country> myCountry = new ArrayList<Country>();

	public void add(Country country) throws CountryAlreadyExistsException{
		if (myCountry.contains(country)) {
			throw new CountryAlreadyExistsException(country);
		} else {
			myCountry.add(country);
		}
	}
	
	public Country searchByName(String name) throws NoSuchElementException {
		Country result = null;
		Iterator<Country> iterator = myCountry.iterator();
		
		while (iterator.hasNext()) {
			Country country = iterator.next();
			if (country.getName().equals(name)) {
				result = country;
			}
		}
		if (result == null) {
			throw new NoSuchElementException("Vous n'avez pas encore conquis " + name + ".");
		}
		else {
			return result;
		}
	}

	public void remove(Country country) {
		myCountry.remove(country);
	}

	public void removeAll() {
		myCountry.clear();
	}

	public int getCurrentCountryCount() {
		return myCountry.size();
	}
	
	public String toString() {
		String result = "";
		for (Country country : myCountry) {
			result += country.toString() + "\n";
		}
		return result;
	}
}

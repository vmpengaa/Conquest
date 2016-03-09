package exception;

import data.Country;

@SuppressWarnings("serial")

public class CountryAlreadyExistsException extends Exception {
	public CountryAlreadyExistsException(Country country) {
		super("Pays existant : " + country.toString());
	}
}

package exception;

import data.Country;

/**
 * @author Vmpengaa
 *
 */
@SuppressWarnings("serial")

public class CountryAlreadyExistsException extends Exception {
	public CountryAlreadyExistsException(Country country) {
		super("Pays existant : " + country.toString());
	}
}

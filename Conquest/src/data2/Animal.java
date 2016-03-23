package data2;

/**
 * @author Vmpengaa
 *
 */
public class Animal extends Natural {
	/**
	 * Animal properties
	 */
	protected int chcCatch;

	public Animal(String name, int price, int chcfind, int hpRegeneration, int chcCatch) {
		super(name, price, chcfind, hpRegeneration);
		this.chcCatch = chcCatch;
	}

	/**
	 * Returns the chance to catch the animal (%).
	 * 
	 * @return the chance to catch the animal
	 */
	public int getChcCatch() {
		return chcCatch;
	}
}

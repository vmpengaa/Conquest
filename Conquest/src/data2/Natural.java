package data2;

/**
 * @author Vmpengaa
 *
 */
public class Natural extends Resource {
	/**
	 * NaturalResource properties
	 */
	protected int hpRegeneration; // point of regeneration. non maximal. exception for QG

	public Natural(String name, int price, int chcfind, int hpRegeneration) {
		super(name, price, chcfind, hpRegeneration);
		this.hpRegeneration = hpRegeneration;
	}

	/**
	 * Returns the regeneration life point.
	 * 
	 * @return regeneration life point
	 */
	public int getHpRegeneration() {
		return hpRegeneration;
	}
}

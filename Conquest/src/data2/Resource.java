package data2;

/**
 * @author Vmpengaa
 *
 */
public class Resource {
	/**
	 * Resource properties
	 */
	protected String name;
	protected int price;
	protected int amount;
	protected int chcfind; // chance to find resource (%)
	
	public Resource(String name, int price, int chcfind, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.chcfind = chcfind;
	}

	/**
	 * Returns the name of resource.
	 * 
	 * @return name of resource
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the price (in resource for moment) of resource.
	 * 
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Returns the chance to find resource in territories(%).
	 * 
	 * @return the chance to find resource
	 */
	public int getChcfind() {
		return chcfind;
	}

	/**
	 * Returns the chance to find resource in territories(%).
	 * 
	 * @return the chance to find resource
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Returns the chance to find resource in territories(%).
	 * 
	 * @return the amount for to modification
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}

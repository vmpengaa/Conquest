package data;

/**
 * @author Vmpengaa
 *
 */
public class Resource extends Material {
	private String particularity;

	public Resource(String type, String name, int amount, String particularity) {
		super(type, name, particularity, particularity, amount, amount, amount);
		this.particularity = particularity;
	}

	public String getParticularity() {
		return particularity;
	}

	public void setParticularity(String particularity) {
		this.particularity = particularity;
	}
}

package data;

public class Resource extends Material {
	private String particularity;

	public Resource(String type, String name, int amount, String particularity) {
		super(type, name, amount);
		this.particularity = particularity;
	}

	public String getParticularity() {
		return particularity;
	}

	public void setParticularity(String particularity) {
		this.particularity = particularity;
	}
}

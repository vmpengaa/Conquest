package data;

public class Material {
	private String type;
	private String name;
	private String nameResourceExchange;
	private int amount;
	private  int value;
	private int price;
	
	public Material(String type, String name, int amount) {
		super();
		this.type = type;
		this.name = name;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getNameResourceExchange() {
		return nameResourceExchange;
	}

	public void setNameResourceExchange(String nameResourceExchange) {
		this.nameResourceExchange = nameResourceExchange;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Material [type=" + type + ", name=" + name + ", nameResourceExchange=" + nameResourceExchange
				+ ", amount=" + amount + ", value=" + value + ", price=" + price + "]";
	}
}

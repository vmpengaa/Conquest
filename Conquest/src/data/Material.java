package data;

/**
 * @author Vmpengaa
 *
 */
public class Material {
	private String type;
	private String name;
	private String nameResourceExchange;
	private String nameResourceGenerate;
	private int amount;
	private  int value;
	private int price;
	
	public Material(String type, String name, String nameResourceExchange, String nameResourceGenerate, int amount,
			int value, int price) {
		super();
		this.type = type;
		this.name = name;
		this.nameResourceExchange = nameResourceExchange;
		this.nameResourceGenerate = nameResourceGenerate;
		this.amount = amount;
		this.value = value;
		this.price = price;
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

	public String getNameResourceGenerate() {
		return nameResourceGenerate;
	}

	public void setNameResourceGenerate(String nameResourceGenerate) {
		this.nameResourceGenerate = nameResourceGenerate;
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

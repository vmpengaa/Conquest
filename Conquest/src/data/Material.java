package data;

public class Material {
	private String type;
	private String name;
	private int amount;
	
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

	public Object getNameResourceExchange() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Material [type=" + type + ", name=" + name + ", amount=" + amount + "]";
	}
}

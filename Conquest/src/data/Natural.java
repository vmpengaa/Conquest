package data;

/**
 * @author Vmpengaa
 *
 */
public class Natural extends Resource {
	private int value; // for creation && sale
	private String NameResourceExchange; // for creation && sale
	
	public Natural(int value, String nameResourceExchange) {
		super(nameResourceExchange, nameResourceExchange, value, nameResourceExchange);
		this.value = value;
		NameResourceExchange = nameResourceExchange;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getNameResourceExchange() {
		return NameResourceExchange;
	}

	public void setNameResourceExchange(String nameResourceExchange) {
		NameResourceExchange = nameResourceExchange;
	}
}

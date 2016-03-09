package data;

/**
 * @author Vmpengaa
 *
 */
public class HardwarePlayer extends Material {
	private int value; // for creation && sale
	private String NameResourceExchange; // for creation && sale
	
	public HardwarePlayer(String type, String name, int amount, int value, String nameResourceExchange) {
		super(type, name, nameResourceExchange, nameResourceExchange, amount, value, value);
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

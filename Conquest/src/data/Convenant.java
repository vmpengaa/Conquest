package data;

public class Convenant {
	private String name;
	private String nameCreator;
	private String color;
	
	public Convenant(String name, String nameCreator, String color) {
		super();
		this.name = name;
		this.nameCreator = nameCreator;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameCreator() {
		return nameCreator;
	}
	
	public void setNameCreator(String nameCreator) {
		this.nameCreator = nameCreator;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}

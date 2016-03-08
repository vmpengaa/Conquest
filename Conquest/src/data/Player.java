package data;

public class Player {
	private String pseudo;
	private String color;
	private int point;
	
	
	public Player(String pseudo, String color, int point) {
		super();
		this.pseudo = pseudo;
		this.color = color;
		this.point = point;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPoint() {
		return point;
	}
}

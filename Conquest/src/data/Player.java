package data;

/**
 * @author Vmpengaa
 *
 */
public class Player {
	private String pseudo;
	private String color;
	private int point;
	private Convenant myConvenant;

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
	
	public String getMyConvenant() {
		return myConvenant.getName();
	}
	
	public Convenant getMyConvenant2() {
		return myConvenant;
	}

	public void setMyConvenant(Convenant myConvenant) {
		this.myConvenant = myConvenant;
	}
	
	public int getPoint() {
		return point;
	}

	@Override
	public String toString() {
		return "Player [pseudo=" + pseudo + ", color=" + color + ", point=" + point + ", myConvenant=" + myConvenant.getName()
				+ "]";
	}
	
	
}

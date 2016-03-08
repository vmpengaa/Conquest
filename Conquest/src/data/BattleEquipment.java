package data;

/**
 * @author Vmpengaa
 *
 */
public class BattleEquipment extends HardwarePlayer {
	private int coefAttack; // attackUnity
	private int coefResistance; // attackUnity
	
	public BattleEquipment(String type, String name, int amount, int value, String nameResourceExchange, int coefAttack,
			int coefResistance) {
		super(type, name, amount, value, nameResourceExchange);
		this.coefAttack = coefAttack;
		this.coefResistance = coefResistance;
	}

	public int getCoefAttack() {
		return coefAttack;
	}

	public void setCoefAttack(int coefAttack) {
		this.coefAttack = coefAttack;
	}

	public int getCoefResistance() {
		return coefResistance;
	}

	public void setCoefResistance(int coefResistance) {
		this.coefResistance = coefResistance;
	}
}

package data2;

/**
 * @author Vmpengaa
 *
 */
public class AttackEquipment extends FightingEquipment {
	/**
	 * AttackEquipment properties
	 */
	protected int attBonus;

	public AttackEquipment(int attBonus) {
		super("AttackBonus");
		this.attBonus = attBonus;
	}

	/**
	 * Returns the bonus that increases the attack 
	 * 
	 * @return bonus for attack
	 */
	public int getAttBonus() {
		return attBonus;
	}
}

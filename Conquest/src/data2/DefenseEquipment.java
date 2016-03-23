package data2;

/**
 * @author Vmpengaa
 *
 */
public class DefenseEquipment extends FightingEquipment {
	/**
	 * DefenseEquipment properties
	 */
	protected int defBonus;

	public DefenseEquipment(int defBonus) {
		super("DefBonus");
		this.defBonus = defBonus;
	}

	/**
	 * Returns the bonus that increases the resistance  
	 * 
	 * @return bonus for resistance
	 */
	public int getDefBonus() {
		return defBonus;
	}
}

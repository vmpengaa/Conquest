package data;

/**
 * @author Vmpengaa
 *
 */
public class FightingEquipment extends HardwarePlayer {
	private int positivAttackEffect; // equipmentAttack
	private int positivDefenceEffect; // equipmentDefence
	
	public FightingEquipment(String type, String name, int amount, int value, String nameResourceExchange,
			int positivAttackEffect, int positivDefenceEffect) {
		super(type, name, amount, value, nameResourceExchange);
		this.positivAttackEffect = positivAttackEffect;
		this.positivDefenceEffect = positivDefenceEffect;
	}

	public int getPositivAttackEffect() {
		return positivAttackEffect;
	}

	public void setPositivAttackEffect(int positivAttackEffect) {
		this.positivAttackEffect = positivAttackEffect;
	}

	public int getPositivDefenceEffect() {
		return positivDefenceEffect;
	}

	public void setPositivDefenceEffect(int positivDefenceEffect) {
		this.positivDefenceEffect = positivDefenceEffect;
	}
}

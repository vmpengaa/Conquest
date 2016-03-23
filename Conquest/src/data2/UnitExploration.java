package data2;

/**
 * @author Vmpengaa
 *
 */
public class UnitExploration extends Unit {
	/**
	 * UnitExploration properties
	 */
	protected int pasgr;
	
	public UnitExploration(String name, int hp, int maxHp, int dmg, int hit, int def, int mat, int move, int pasgr) {
		super(name, hp, maxHp, dmg, hit, def, mat, move);
		this.pasgr = pasgr;
	}
	
	/**
	 * Returns number of passenger.
	 * 
	 * @return passengerNumber
	 */
	public int getPasgr() {
		return pasgr;
	}
}

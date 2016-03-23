package data2;

/**
 * @author Vmpengaa
 *
 */
public class Tank extends Unit {
	/**
	 * Tank properties
	 */
	protected int scp;
	
	public Tank(String name, int hp, int maxHp, int dmg, int hit, int def, int mat, int move, int scp) {
		super("Tank", hp, maxHp, dmg, hit, def, mat, move);
		this.scp = scp;
	}
	
	/**
	 * Return the scope of hit tank (measurement unit).
	 * 
	 * @return scope
	 */

	public int getScp() {
		return scp;
	}
}

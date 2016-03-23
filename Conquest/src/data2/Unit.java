package data2;

/**
 * @author Vmpengaa
 *
 */
public class Unit {
	/**
	 * Unity properties
	 * 
	 *  private int mat; (incompris) deplacement après attack
	 *  private int move; (incompris) deplacement max durant un tour
	 */
	protected String name;
	protected int hp; 
	protected int maxHp;
	protected int dmg;
	protected int hit;
	protected int def;
	protected int mat;
	protected int move;
	
	public Unit(String name, int hp, int maxHp, int dmg, int hit, int def, int mat, int move) {
		super();
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.dmg = dmg;
		this.hit = hit;
		this.def = def;
		this.mat = mat;
		this.move = move;
	}

	/**
	 * Returns the name of unity.
	 * 
	 * @return name of unity
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns life points during a battle.
	 * 
	 * @return Current life point
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * Returns life points before a battle.
	 * 
	 * @return starting life point
	 */
	public int getMaxHp() {
		return maxHp;
	}

	/**
	 * Returns the damage (measurement unit).
	 * 
	 * @return the damage
	 */
	public int getDmg() {
		return dmg;
	}

	/**
	 * Returns hit(measurement unit).
	 * 
	 * @return hit
	 */
	public int getHit() {
		return hit;
	}

	/**
	 * Returns the resistance(measurement unit). 
	 * 
	 * @return resistance
	 */
	public int getDef() {
		return def;
	}

	/**
	 * Returns the number of movements after attack.
	 * 
	 * @return the number of movements after attack
	 */
	public int getMat() {
		return mat;
	}

	/**
	 * Returns the number of movements.
	 * 
	 * @return the number of movements
	 */
	public int getMove() {
		return move;
	}
}

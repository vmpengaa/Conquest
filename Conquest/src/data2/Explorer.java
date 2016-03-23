package data2;

/**
 * @author Vmpengaa
 *
 */
public class Explorer extends UnitExploration {
	/**
	 * Explorer properties
	 */
	protected int prbGold;
	protected int probAlum;
	protected int probOil;
	protected int probIron;
	
	public Explorer(int hp, int maxHp, int dmg, int hit, int def, int mat, int move, int pasgr,
			int prbGold, int probAlum, int probOil, int probIron) {
		super("Explorer", hp, maxHp, dmg, 0, def, mat, move, pasgr);
		this.prbGold = prbGold;
		this.probAlum = probAlum;
		this.probOil = probOil;
		this.probIron = probIron;
	}

	/**
	 * Return the probability to find gold in a territory (%).
	 * 
	 * @return probability to find gold
	 */
	public int getPrbGold() {
		return prbGold;
	}

	/**
	 * Return the probability to find aluminum in a territory (%).
	 * 
	 * @return probability to find aluminum
	 */
	public int getProbAlum() {
		return probAlum;
	}

	/**
	 * Return the probability to find oil in a territory (%).
	 * 
	 * @return probability to find oil
	 */
	public int getProbOil() {
		return probOil;
	}

	/**
	 * Return the probability to find iron in a territory (%).
	 * 
	 * @return probability to find iron
	 */
	public int getProbIron() {
		return probIron;
	}
}

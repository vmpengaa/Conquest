package core2;

import data2.Unit;

public abstract class MyUnitFactory {
	/**
	 * Returns the name of all the units of the factory.
	 * 
	 * @return names of all the units
	 */
	public abstract String[] getNamesOfUnits();

	/**
	 * @param str : the name of the unit
	 *            
	 * @return the new unit
	 */
	public abstract Unit getUnit(String str);
}

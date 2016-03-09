package core;

import data.Material;

/**
 * @author Vmpengaa
 *
 */
public class Generate {
	@SuppressWarnings("null")
	public void generate(String name, int count, GenerableMaterial generableMaterial, MyMaterial myMaterial) {
		Material found = generableMaterial.searchByName(name);
		Material found2 = null;
		int trueValue = 0;
		
		if (found != null) {
			found2 = myMaterial.searchByName(found.getNameResourceGenerate());
			if (found2 != null) { 							  // j'ai le resource necessaire a la generation de ma donnee
				trueValue = found.getValue() * count;
				if (found2.getAmount() >= trueValue) { // j'ai la quantite necessaire de la resource necessaire a la generation de ma donnee
					for (int i = 0 ; i < count ; i++) {
						myMaterial.add(found);
					}
					found2.setAmount(found2.getAmount() - trueValue);
					System.out.println(name + " a bien �t� g�n�r� et il vous reste " + found2.getAmount() + " " + found2.getName() + ".");
				} else {
					System.out.println("Vous n'avez pas la quantit� n�cessaire de " + found.getNameResourceGenerate() + " pour g�n�rer les " + count + " donn�e(s) : " + name + " et il vous reste " + found2.getAmount() + " " + found2.getName() + ".");
				}
			} else {
				System.out.println("Vous ne poss�dez pas la resource necessaire � la generation de les " + count + " donn�e(s) : " + name + " et il vous reste " + found2.getAmount() + " " + found2.getName() + ".");
			}
		}
		else {
			System.out.println(name + " n'est pas g�n�rable.");
		}
	}	
}

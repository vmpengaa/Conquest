package core;

import data.Material;

/**
 * @author Vmpengaa
 *
 */
public class Exchange {
	public static void exchange(Material saleProduct, Material myProduct, MyMaterial myMaterial) {

		// perte de ressource
		if (saleProduct.getNameResourceExchange().equals(myProduct.getName()) && (saleProduct.getValue() <= myProduct.getAmount())) {
			myProduct.setAmount(myProduct.getAmount() - saleProduct.getPrice());
			if (myProduct.getAmount() == 0) {
				myProduct = null;
			}
		} else {
			System.out.println("Echange impossible. Pas assez de ressource.");
		}

		// gain d'un objet
		myMaterial.add(saleProduct);

		// bilan
		System.out.println("nombre de saleProduct : " + saleProduct.getAmount() + "nombre de " + myProduct.getName() + " : " + myProduct.getAmount());
	}
}

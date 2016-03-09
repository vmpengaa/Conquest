package main;

import java.util.NoSuchElementException;

import core.MyMaterial;
import data.Material;

public class TestMyMaterial {
	
	public static void main(String[] args) {
		System.out.println("--Mon materiel de jeu--");
		MyMaterial myMaterial = new MyMaterial();
		testOperations(myMaterial);
	}
	
	private static void testOperations(MyMaterial myMaterial) {
		try {
			Material material1 = new Material("BattleEquipment","tank",1);
			Material material2 = new Material("FightingEquipment","attackEquipment",1);
			
			// ajout de materiel dans mon arsenal
			myMaterial.add(material1);
			myMaterial.add(material1);
			myMaterial.add(material2);
			
			// recherche dans mon arsenal
			Material foundMaterial1 = myMaterial.searchByName("tank");
			Material foundMaterial2 = myMaterial.searchByName("attackEquipment");
			Material foundMaterial3 = myMaterial.searchByName("tank2");
			
			// nb element dans ma liste
			int CurrentMaterialCount = myMaterial.getCurrentMaterialCount();
			System.out.println("Nombre d'objet dans ma liste de matériel : ");
			System.out.println(CurrentMaterialCount);
			
			// resultat de mes recherche
			System.out.println("Résultat de recherche(s) : ");
			System.out.println(foundMaterial1.toString());
			System.out.println(foundMaterial2.toString());
			System.out.println(foundMaterial3.toString());
			
			// contenue integrale de ma liste
			System.out.println("Contenu intégrale de ma liste : ");
			System.out.println(myMaterial.toString());
			
		} catch (NoSuchElementException nsee) {
			System.err.println(nsee.getMessage());
		}
	}

}

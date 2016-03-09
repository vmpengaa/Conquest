package main;

import java.util.NoSuchElementException;
import data.Material;
import core.GenerableMaterial;
import core.Generate;
import core.MyMaterial;

/**
 * @author Vmpengaa
 *
 */
public class TestGenerate {

	public static void main(String[] args) {
		testGenerate();
	}
	
	public static MyMaterial MyMaterial() {
		System.out.println("-- Remplissage de myMaterial --");
		MyMaterial myMaterial = new MyMaterial();
		useMyMaterial(myMaterial);
		return myMaterial;
	}
	
	public static GenerableMaterial generableMaterial() {
		System.out.println("-- Remplissage de materialGenerable --");
		GenerableMaterial generableMaterial = new GenerableMaterial();
		defaultGenerableMaterial(generableMaterial);
		return generableMaterial;
	}
	
	public static void testGenerate() {
		System.out.println("-- Génération d'une donnée --");
		Generate generate = new Generate();
		useGenerate(generate);
	}
	
	public static MyMaterial useMyMaterial(MyMaterial myMaterial) {
		try {
			Material material = new Material(null,"oil",null,null,1,0,0);
			
			for (int i = 0; i < 10 ; i++) {
				myMaterial.add(material);
			}
			
			int CurrentMaterialCount = myMaterial.getCurrentMaterialCount();
			System.out.println("Nombre d'objet dans ma liste de matériel : ");
			System.out.println(CurrentMaterialCount);
			
			System.out.println("Contenu intégrale de ma liste : ");
			System.out.println(myMaterial.toString());
			
		} catch (NoSuchElementException nsee) {
			System.err.println(nsee.getMessage());
		}
		return myMaterial;
	}
	
	public static GenerableMaterial defaultGenerableMaterial(GenerableMaterial generableMaterial) {
		int defaultAmount = 1;
		int defaultprice = 0;
		
		try {
			Material material = new Material("BattleEquipment","soldier","oil","oil",defaultAmount,5,defaultprice);
			Material material2 = new Material("BattleEquipment","tank","iron","iron",defaultAmount,6,defaultprice);
			Material material3 = new Material("BattleEquipment","plane","aluminum","aluminum",defaultAmount,7,defaultprice);
			Material material4 = new Material("BattleEquipment","boatExploration","gold","gold",defaultAmount,3,defaultprice);
			
			generableMaterial.add(material);
			generableMaterial.add(material2);
			generableMaterial.add(material3);
			generableMaterial.add(material4);
			
			int CurrentGenerableMaterialCount = generableMaterial.getCurrentGenerableMaterialCount();
			System.out.println("Nombre d'objet générable : ");
			System.out.println(CurrentGenerableMaterialCount);
			
			System.out.println("Contenu intégrale de ma liste : ");
			System.out.println(generableMaterial.toString());
			
		} catch (NoSuchElementException nsee2) {
			System.err.println(nsee2.getMessage());
		}
		return generableMaterial;
	}
	
	public static void useGenerate(Generate generate) {
		MyMaterial myMaterial = MyMaterial();
		GenerableMaterial generableMaterial = generableMaterial();
		
		try {
			generate.generate("soldier",1, generableMaterial, myMaterial);
			generate.generate("soldier",1, generableMaterial, myMaterial);
			generate.generate("soldier",3, generableMaterial, myMaterial);
			
			int CurrentMaterialCount = myMaterial.getCurrentMaterialCount();
			System.out.println("Nombre d'objet dans ma liste de matériel : ");
			System.out.println(CurrentMaterialCount);
			
			System.out.println("Contenu intégrale de ma liste : ");
			System.out.println(myMaterial.toString());
			
		}  catch (NoSuchElementException nsee2) {
			System.err.println(nsee2.getMessage());
		}
	}
}

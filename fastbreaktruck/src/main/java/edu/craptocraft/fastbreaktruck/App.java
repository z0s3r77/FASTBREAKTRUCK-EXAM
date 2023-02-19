package edu.craptocraft.fastbreaktruck;

import edu.craptocraft.fastbreaktruck.behaviour.FastBreakTruck;
import edu.craptocraft.fastbreaktruck.domain.Desayuno;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		/**
		 * Desayuno Eyeholes
		 */

		Desayuno eyeDes = FastBreakTruck.prepararEyeHoles();
		System.out.println("\nNo abras la caja de Eyeholes!");
		eyeDes.mostrarItems();
		System.out.print("Precio pedido: " + eyeDes.getCoste());

		/**
		 * Desayuno Smiggles
		 */
		
		// Desayuno smigDes = FastBreakTruck.prepararSmiggles();
		// System.out.println("\nSmiggles per als nins!");
		// smigDes.mostrarItems();
		// System.out.print("Precio pedido: " + smigDes.getCoste());

		/**
		 * Plumbus
		 */

		// eyeDes = FastBreakTruck.prepararEyeHoles();
		// FastBreakTruck.incluirJuguete(eyeDes);
		// System.out.println("\nEyeholes con plumbus!");
		// eyeDes.mostrarItems();
		// System.out.print("Precio pedido: " + eyeDes.getCoste());
	}
}

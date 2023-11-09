package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] cibiPreferiti = {"Pizza", "Lasagne", "Fiorentina", "Tiramisù", "Cioccolata"};
		
		System.out.println("La lunghezza dell'array è di: " +cibiPreferiti.length + " " + "elementi");
		System.out.println("Il cibo in prima posizione è: " + cibiPreferiti[0]);
		System.out.println("Il cibo che mi piace ma non troppo è: " + cibiPreferiti[4]);
		
		// BONUSES		
		int mediano = cibiPreferiti.length / 2;
		System.out.println("Il cibo di mezza classifica è: " + cibiPreferiti[mediano]);
	}
}

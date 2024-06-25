package org.ss.orchestre.couplagefort;
public class App {
	public static void main(String[] args) {
		Musicien pianiste = new Musicien();
		Piano piano = new Piano();
		pianiste.ajout(piano);
		pianiste.jouerMorceau("La 9eme de Beethoven");

		System.out.println("Le violoniste : ");
		Musicien violoniste = new Musicien();
		Violon violon = new Violon();
		violoniste.ajout(violon);
		violoniste.jouerMorceau("La 9eme de Beethoven");

		System.out.println("Le batteur : ");
		Musicien batteur = new Musicien();
		Batterie batterie = new Batterie();
		batteur.ajout(batterie);
		batteur.jouerMorceau("La 9eme de Beethoven");

		System.out.println("L'orchestre : ");
		Orchestre orchestre = new Orchestre( "La 9eme de Beethoven");
		orchestre.ajout(pianiste);
		orchestre.ajout(violoniste);
		orchestre.ajout(batteur);
		orchestre.jouer();
	}
}

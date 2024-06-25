package org.ss.orchestre.couplagefort;
import java.util.ArrayList;

public class Musicien {
	private ArrayList<Instrument> instruments;

	public Musicien() {
		instruments = new ArrayList<>();
	}

	public void jout(Instrument instrument) {
		instruments.add(instrument);
	}

	public void jouerMorceau(String morceau) {
		for(Instrument instrument: instruments) {
			instrument.afficher();
			System.out.println("et je joue le morceau " + morceau);
			instrument.jouer();
		}
	}
}
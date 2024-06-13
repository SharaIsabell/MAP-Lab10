package Main;

import sanduiche.Natuiche;
import sanduiche.Sanduiche;
import sanduiche.SanduicheIche;
import sanduiche.SanduicheNhamNham;

public class Main {
	public static void main(String[] args) {
		Sanduiche natuiche = new Natuiche();
		System.out.println("Natuiche:");
		System.out.println(natuiche.fazerSanduiche());
		System.out.println();
		
		Sanduiche sanduicheIche = new SanduicheIche();
		System.out.println("SanduicheIche:");
		System.out.println(sanduicheIche.fazerSanduiche());
		System.out.println();
		
		Sanduiche sanduicheNhamNham = new SanduicheNhamNham();
		System.out.println("SanduicheNhamNham:");
		System.out.println(sanduicheNhamNham.fazerSanduiche());
	}
}

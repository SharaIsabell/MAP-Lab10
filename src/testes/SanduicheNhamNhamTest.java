package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import sanduiche.SanduicheNhamNham;

public class SanduicheNhamNhamTest {

	static SanduicheNhamNham sanduicheNhamNham;
	
	@BeforeClass
	public static void criarObjetos(){
		sanduicheNhamNham = new SanduicheNhamNham();
	}
	
	@Test
	public void fazerSanduicheTest() {
		assertEquals("Fatia de pão francês 🥖\n"
				+ "Fatias de tomate cereja 🍅\n"
				+ "Fatia de queijo cheddar 🧀\n"
				+ "Ovo de granja 🥚\n"
				+ "Fatia de presunto de frango 🍗\n"
				+ "Fatia de pão francês 🥖", sanduicheNhamNham.fazerSanduiche());
	}

}

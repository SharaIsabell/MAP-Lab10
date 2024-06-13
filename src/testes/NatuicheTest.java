package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import sanduiche.Natuiche;

public class NatuicheTest {

	static Natuiche natuiche;
	
	@BeforeClass
	public static void criarObjetos(){
		natuiche = new Natuiche();
	}
	
	@Test
	public void fazerSanduicheTest() {
		assertEquals("Fatia de pão integral 🍞\n"
				+ "Fatias de tomate 🍅\n"
				+ "Fatia de queijo prato 🧀\n"
				+ "Ovo de granja 🥚\n"
				+ "Fatia de presunto de frango 🍗\n"
				+ "Fatia de pão integral 🍞", natuiche.fazerSanduiche());
	}

}

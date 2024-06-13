package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import sanduiche.SanduicheIche;

public class SanduicheIcheTest {
	
	static SanduicheIche sanduicheIche;
	
	@BeforeClass
	public static void criarObjetos(){
		sanduicheIche = new SanduicheIche();
	}
	
	@Test
	public void fazerSanduicheTest() {
		assertEquals("Fatia de pão bola 🫓\n"
				+ "Fatias de tomate 🍅\n"
				+ "Fatia de queijo mussarela 🧀\n"
				+ "Ovo de capoeira 🥚\n"
				+ "Fatia de presunto de peru 🥩\n"
				+ "Fatia de pão bola 🫓", sanduicheIche.fazerSanduiche());
	}

}

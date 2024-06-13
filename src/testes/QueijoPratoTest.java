package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import queijo.QueijoPrato;

public class QueijoPratoTest {

	static QueijoPrato queijoPrato;
	
	@BeforeClass
	public static void criarObjetos(){
		queijoPrato = new QueijoPrato();
	}
	
	@Test
	public void fatiaQueijoTest() {
		assertEquals("Fatia de queijo prato 🧀", queijoPrato.fatiaQueijo());
	}

}

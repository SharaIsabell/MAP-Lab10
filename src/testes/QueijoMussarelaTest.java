package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import queijo.QueijoMussarela;

public class QueijoMussarelaTest {

	static QueijoMussarela queijoMussarela;
	
	@BeforeClass
	public static void criarObjetos(){
		queijoMussarela = new QueijoMussarela();
	}
	
	@Test
	public void fatiaQueijoTest() {
		assertEquals("Fatia de queijo mussarela 🧀", queijoMussarela.fatiaQueijo());
	}

}

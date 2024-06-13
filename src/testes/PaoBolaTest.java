package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pao.PaoBola;

public class PaoBolaTest {

	static PaoBola paoBola;
	
	@BeforeClass
	public static void criarObjetos(){
		paoBola = new PaoBola();
	}
	
	@Test
	public void fatiaPaoTest() {
		assertEquals("Fatia de pão bola 🫓", paoBola.fatiaPao());
	}

}

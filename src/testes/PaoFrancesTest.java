package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pao.PaoFrances;

public class PaoFrancesTest {

	static PaoFrances paoFrances;
	
	@BeforeClass
	public static void criarObjetos(){
		paoFrances = new PaoFrances();
	}
	
	@Test
	public void fatiaPaoTest() {
		assertEquals("Fatia de pão francês 🥖", paoFrances.fatiaPao());
	}

}

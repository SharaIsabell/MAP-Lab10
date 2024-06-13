package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pao.PaoIntegral;

public class PaoIntegralTest {

	static PaoIntegral paoIntegral;
	
	@BeforeClass
	public static void criarObjetos(){
		paoIntegral = new PaoIntegral();
	}
	
	@Test
	public void fatiaPaoTest() {
		assertEquals("Fatia de pão integral 🍞", paoIntegral.fatiaPao());
	}

}

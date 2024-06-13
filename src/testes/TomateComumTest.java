package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import tomate.TomateComum;

public class TomateComumTest {

	static TomateComum tomate;
	
	@BeforeClass
	public static void criarObjetos(){
		tomate = new TomateComum();
	}
	
	@Test
	public void fatiasTomateTest() {
		assertEquals("Fatias de tomate 🍅", tomate.fatiasTomate());
	}

}

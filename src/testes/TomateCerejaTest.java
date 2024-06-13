package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import tomate.TomateCereja;

public class TomateCerejaTest {

	static TomateCereja tomate;
	
	@BeforeClass
	public static void criarObjetos(){
		tomate = new TomateCereja();
	}
	
	@Test
	public void fatiasTomateTest() {
		assertEquals("Fatias de tomate cereja 🍅", tomate.fatiasTomate());
	}

}

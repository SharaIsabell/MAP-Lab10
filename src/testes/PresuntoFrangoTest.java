package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import presunto.PresuntoFrango;

public class PresuntoFrangoTest {

	static PresuntoFrango presuntoFrango;
	
	@BeforeClass
	public static void criarObjetos(){
		presuntoFrango = new PresuntoFrango();
	}
	
	@Test
	public void fatiaPresuntoTest() {
		assertEquals("Fatia de presunto de frango 🍗", presuntoFrango.fatiaPresunto());
	}

}

package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import presunto.PresuntoPeru;

public class PresuntoPeruTest {

	static PresuntoPeru presuntoPeru;
	
	@BeforeClass
	public static void criarObjetos(){
		presuntoPeru = new PresuntoPeru();
	}
	
	@Test
	public void fatiaPresuntoTest() {
		assertEquals("Fatia de presunto de peru 🥩", presuntoPeru.fatiaPresunto());
	}

}

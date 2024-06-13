package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ovo.OvoGranja;

public class OvoGranjaTest {

	static OvoGranja ovoGranja;
	
	@BeforeClass
	public static void criarObjetos(){
		ovoGranja = new OvoGranja();
	}
	
	@Test
	public void tipoOvoTest() {
		assertEquals("Ovo de granja 🥚", ovoGranja.tipoOvo());
	}
}

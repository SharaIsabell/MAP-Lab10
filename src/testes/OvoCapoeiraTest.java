package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ovo.OvoCapoeira;

public class OvoCapoeiraTest {

	static OvoCapoeira ovoCapoeira;
	
	@BeforeClass
	public static void criarObjetos(){
		ovoCapoeira = new OvoCapoeira();
	}
	
	@Test
	public void tipoOvoTest() {
		assertEquals("Ovo de capoeira 🥚", ovoCapoeira.tipoOvo());
	}

}

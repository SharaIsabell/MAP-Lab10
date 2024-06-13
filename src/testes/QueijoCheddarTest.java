package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import queijo.QueijoCheddar;

public class QueijoCheddarTest {

	static QueijoCheddar queijoCheddar;
	
	@BeforeClass
	public static void criarObjetos(){
		queijoCheddar = new QueijoCheddar();
	}
	
	@Test
	public void fatiaQueijoTest() {
		assertEquals("Fatia de queijo cheddar 🧀", queijoCheddar.fatiaQueijo());
	}

}

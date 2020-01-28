package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
	
		assertTrue(arreglo!=null);
		assertEquals(0, arreglo.darTamano()); 
	}

	@Test
	public void testDarElemento() {
		//setUp1();
		setUp2();
		// TODO
		String d="d1"; 
		String d2="d2";
		arreglo.agregar("d1");
		arreglo.agregar("d2");

		assertEquals(202, arreglo.darTamano());
		assertEquals(d,arreglo.darElemento(200));
		assertEquals(d2,arreglo.darElemento(201));
 System.out.println(arreglo.darElemento(201));
	}

}

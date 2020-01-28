package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO  
	setUp2();
	assertEquals(100, modelo.darTamano());
	modelo.agregar("d1");
	assertEquals(101, modelo.darTamano());

	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		String d = "dato";
		setUp2();
		modelo.agregar(d);
		assertEquals("dato", modelo.buscar(d));
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		String d1= "d1";
		String d2 = "d2";
		String d3 = "d3";
		
		modelo.agregar("d1");
		modelo.agregar("d2");
		modelo.agregar("d3");
		assertEquals("d1", modelo.buscar(d1));
		assertEquals("d2", modelo.buscar(d2));
		assertEquals("d3", modelo.buscar(d3));
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		String d1= "d1";
		modelo.agregar("d1");
		assertEquals(101, modelo.darTamano());
		modelo.eliminar(d1);
		assertEquals(100, modelo.darTamano());


	}

}

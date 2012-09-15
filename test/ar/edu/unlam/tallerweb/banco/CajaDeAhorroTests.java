package ar.edu.unlam.tallerweb.banco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CajaDeAhorroTests {

	CajaDeAhorro c;
	
	@Before
	public void setUp(){
		c = new CajaDeAhorro(1500);
	}
	
	@Test
	public void testQueUnaCajaDeAhorroEsUnaCuenta() {
		Assert.assertEquals(Cuenta.class, CajaDeAhorro.class.getSuperclass());
	}
	
	@Test
	public void testQueNoPermiteExtraerMasDeMil(){
		c.extraer(1001);
		Assert.assertEquals(1500, c.getSaldo());
	}
	
	@Test
	public void testQuePermiteExtraerMil(){
		c.extraer(1000);
		Assert.assertEquals(500, c.getSaldo());
	}
	
	
}

package ar.edu.unlam.tallerweb.banco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CuentaTests {

	Cuenta c;

	@Before
	public void setUp() {
		c = new Cuenta(100);
	}

	@Test
	public void testQueSePuedeDepositar() {
		c.depositar(50);
		Assert.assertEquals(150, c.getSaldo());
	}

	@Test
	public void testQueSePuedaDepositarCero() {
		c.depositar(0);
		Assert.assertEquals(100, c.getSaldo());

	}

	@Test
	public void testQueNoSePuedeDepositarNegativo() {
		c.depositar(-1);
		Assert.assertEquals(100, c.getSaldo());
	}
	
	@Test
	public void testQueSePuedeExtraerCero(){
		c.extraer(0);
		Assert.assertEquals(100, c.getSaldo());
	}
	
	@Test
	public void testQueSePuedeExtraer(){
		c.extraer(50);
		Assert.assertEquals(50, c.getSaldo());
	}
	
	@Test
	public void testQueNoSePuedeExtraerMasDeLoQueTengo(){
		c.extraer(150);
		Assert.assertEquals(100, c.getSaldo());
	}
	
	@Test
	public void testQueSePuedeExtraerTodoLoQueTengo(){
		c.extraer(100);
		Assert.assertEquals(0, c.getSaldo());
	}
	
	@Test
	public void testQueNoSePuedeExtraerNegativo(){
		c.extraer(-50);
		Assert.assertEquals(100, c.getSaldo());
	}

}

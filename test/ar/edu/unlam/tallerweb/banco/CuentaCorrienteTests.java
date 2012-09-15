package ar.edu.unlam.tallerweb.banco;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CuentaCorrienteTests {

	CuentaCorriente cc;
	
	@Before
	public void setUp(){
		cc = new CuentaCorriente(1500);
	}
	
	@Test
	public void testQueUnaCuentaCorrienteEsUnaCuenta(){
		Assert.assertEquals(Cuenta.class, CuentaCorriente.class.getSuperclass());
	}
	
	public void multipleExtraer(CuentaCorriente cuenta, int veces, int monto) {
		for (int cantidad = 0; cantidad < veces; cantidad++) {
			cuenta.extraer(monto);
		}
	}

	@Test
	public void testQueLuegoDeCincoExtraccionesCobraDosPesosDeRecargo(){
		multipleExtraer(cc, 6, 1);
		
		Assert.assertEquals(1492, cc.getSaldo());
	}
	
}

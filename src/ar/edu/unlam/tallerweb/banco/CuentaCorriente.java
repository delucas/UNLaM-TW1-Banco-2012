package ar.edu.unlam.tallerweb.banco;

public class CuentaCorriente extends Cuenta{

	private int cantidadExtracciones = 0;

	public CuentaCorriente(int saldo) {
		super(saldo);
	}

	@Override
	public void extraer(int monto) {
		
		if (correspondeMulta()) {
			monto += 2;
			// conceptualmente no es un monto... pero: cómo lo arreglaríamos?
		}
		
		if (this.puedoPagar(monto)){
			super.extraer(monto);
			this.cantidadExtracciones++;
		}
				
	}
	
	private boolean puedoPagar(int montoAPagar) {
		return this.getSaldo() >= montoAPagar;
	}

	private boolean correspondeMulta() {
		return this.cantidadExtracciones >= 5;
	}
	
}

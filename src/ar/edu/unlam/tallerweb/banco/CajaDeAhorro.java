package ar.edu.unlam.tallerweb.banco;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro(int saldo) {
		super(saldo);
	}

	@Override
	public void extraer(int monto){
		if (monto <= 1000) {
			super.extraer(monto);
		}
	}
	
}

package ar.edu.unlam.tallerweb.banco;

public class Cuenta {

	private int saldo = 0;

	public Cuenta(int saldoInicial) {
		this.saldo = saldoInicial;
	}

	public void depositar(int monto) {
		if (monto > 0) {
			this.saldo = this.saldo  + monto;
		}
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void extraer(int monto) {

		if (monto <= this.saldo && monto > 0) {
			this.saldo = this.saldo - monto;
		}
	}

}

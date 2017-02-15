package br.com.miltonjneto.oo.classesAbstratas;

public abstract class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxaSelic);
	
}

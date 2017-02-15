package br.com.miltonjneto.oo.interfaces_3;

public class ContaCorrente extends Conta implements Tributavel{

	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calcularTributos() {
		return this.getSaldo() * 0.01;
	}
	
}

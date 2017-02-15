package br.com.miltonjneto.oo.interfaces_2;

public class ContaCorrente extends Conta {

	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}

}

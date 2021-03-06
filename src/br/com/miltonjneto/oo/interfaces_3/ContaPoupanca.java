package br.com.miltonjneto.oo.interfaces_3;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
	
}

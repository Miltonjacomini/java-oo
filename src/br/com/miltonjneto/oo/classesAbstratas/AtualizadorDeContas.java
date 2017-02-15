package br.com.miltonjneto.oo.classesAbstratas;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta conta){
		System.out.println("===============================================");
		System.out.println("Saldo anterior:"+conta.getSaldo());
		conta.atualiza(selic);
		System.out.println("Saldo atual:"+conta.getSaldo());
		System.out.println("===============================================");
		this.saldoTotal+= conta.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
}

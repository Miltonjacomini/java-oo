package br.com.miltonjneto.oo.interfaces_2;

/**
 * Desenvolvendo classes com Herança , Reescrita e Polimorfismo
 * 
 * 
 * @author miltonjneto
 *
 */

public class TestaContas {

	public static void main(String[] args) {

		// testaDepositaAtualiza();

		testaAtualizadorDeContas();

	}

	private static void testaAtualizadorDeContas() {

		Conta conta = new ContaCorrente();
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();

		conta.deposita(1000);
		contaCorrente.deposita(1000);
		contaPoupanca.deposita(1000);

		AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01);

		atualizador.roda(conta);
		atualizador.roda(contaCorrente);
		atualizador.roda(contaPoupanca);

		System.out.println("Saldo total: " + atualizador.getSaldoTotal());
	}

	@SuppressWarnings("unused")
	private static void testaDepositaAtualiza() {
		Conta conta = new ContaCorrente();
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();

		conta.deposita(1000);
		contaCorrente.deposita(1000);
		contaPoupanca.deposita(1000);

		conta.atualiza(0.01);
		contaCorrente.atualiza(0.01);
		contaPoupanca.atualiza(0.01);

		System.out.println(conta.getSaldo());
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}

}

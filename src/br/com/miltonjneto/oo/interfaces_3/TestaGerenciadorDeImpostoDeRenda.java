package br.com.miltonjneto.oo.interfaces_3;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida segVida = new SeguroDeVida();
		gerenciador.adiciona(segVida);

		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100);
		gerenciador.adiciona(conta);

		System.out.printf("O Saldo é: %.2f\n", conta.getSaldo()); //printf imprimindo com casas decimais
		System.out.println("Total: " + gerenciador.getTotal());

	}

}

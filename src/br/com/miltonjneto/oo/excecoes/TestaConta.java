package br.com.miltonjneto.oo.excecoes;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		try {
			conta.deposita(-100);
			System.out.println("Saldo conta:: " + conta.getSaldo());
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}

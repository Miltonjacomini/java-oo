package br.com.miltonjneto.oo.interfaces_3;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		System.out.println("Calcula Tributos = " + contaCorrente.calcularTributos());
			
		//Testando polimorfismo
		Tributavel tributavelConta = contaCorrente;
		System.out.println("Calcula Tributos = " + tributavelConta.calcularTributos());
		
		
		
	}
	
}

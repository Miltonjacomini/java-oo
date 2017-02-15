package br.com.miltonjneto.oo.interfaces_3;

public class GerenciadorDeImpostoDeRenda {

	public double total;

	void adiciona(Tributavel trib) {
		System.out.println("Adicionando tributavel: " + trib);
		this.total += trib.calcularTributos();
	}

	public double getTotal() {
		return this.total;
	}

}

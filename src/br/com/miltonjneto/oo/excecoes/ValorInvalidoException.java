package br.com.miltonjneto.oo.excecoes;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor){
		super("Valor inválido: " + valor);
	}

}

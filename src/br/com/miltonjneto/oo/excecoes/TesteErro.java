package br.com.miltonjneto.oo.excecoes;

public class TesteErro {

	public static void main(String[] args) {

		System.out.println(">>> Inicio do main <<<");
		try {
			metodoUm();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estouro no tamanho do Array ::: " + e.getMessage());
		}
		System.out.println(">>> Fim do main <<<");
	}

	private static void metodoUm() {

		System.out.println("> Inicio do Método UM <");
		metodoDois();
		System.out.println("> Fim do Método UM <");
	}

	private static void metodoDois() {

		System.out.println("> Inicio do Método DOIS <");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}

		System.out.println("> Fim do Método DOIS <");

	}

}

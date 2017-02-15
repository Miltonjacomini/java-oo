package br.com.miltonjneto.oo.interfaces;

public class CalcularArea {

	public static void main(String[] args) {
		
		AreaCalculavel calcularRetangulo = new Retangulo(3, 2);
		AreaCalculavel calcularQuadrado = new Quadrado(2);
		AreaCalculavel calcularCirculo = new Circulo(10);
		
		System.out.println("Calculo retangulo : " + calcularRetangulo.calculaArea());
		System.out.println("Calculo quadrado : " + calcularQuadrado.calculaArea());
		System.out.println("Calculo circulo : " + calcularCirculo.calculaArea());
		
	}
	
}

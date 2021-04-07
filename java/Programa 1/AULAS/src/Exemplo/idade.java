package Exemplo;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int soma;
		
		System.out.println("digite o valor 1");
		valor1=leia.nextInt();
		System.out.println("digite o valor 2");
		valor2=leia.nextInt();
		soma = valor1+valor2;
		System.out.print(soma);
	}

}

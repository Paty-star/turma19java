package Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Exerciciowhile1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		// 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		
		int idade;
		System.out.printf("Digite sua idade:");
		idade = leia.nextInt();
		while (idade<=21)
			System.out.printf("Digite sua idade: %d",idade);
		idade = leia.nextInt();
		if (idade<=21)
		{
			System.out.printf("Você é menor de idade...");
			
			else System.out.printf("Digite sua idade: %d",idade);
			idade = leia.nextInt();
			if (idade>=50)
			{
				
			}
		}
		{
			System.out.printf("");
		}
		
		

	}

}

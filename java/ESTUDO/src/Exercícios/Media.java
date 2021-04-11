package Exercícios; //nome do Pacote

import java.util.Scanner;

public class Media { 

	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
	double	nota1, nota2, nota3, media ;
	
	System.out.println("digite a nota:");
	nota1 = leia.nextDouble();
	
	System.out.println("digite a nota:");
	nota2 = leia.nextDouble();
	
	System.out.println("digite a nota:");
	nota3 = leia.nextDouble();
	
	media = (nota1 + nota2 + nota3) / 3;
	
	System.out.println("A média é :" + media);
	
	

	}

}

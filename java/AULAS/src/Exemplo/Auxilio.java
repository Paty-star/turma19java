package Exemplo;

import java.util.Scanner;

public class Auxilio {
	public static void main (String[] args)	{
	Scanner leia = new Scanner (System.in);
	
	char situacaoEmergencial;
	
	
	System.out.println("Voc� emergencial antes 1-sim ou 2- N�o:");
	situacaoEmergencial=leia.next().charAt(0);
	if(situacaoEmergencial=='s') {
		System.out.println("vc recebeu algum auxilio extra como o bolsa familia?");
		situacaoEmergencial=leia.next().toUpperCase().charAt(0);
		if (situacaoEmergencial=='s') {
		System.out.println("Vc tem direito a r$ 300,00");
	}else if(situacaoEmergencial=='n') {
		System.out.println("Vc n�o tem direito ao beneficio!");
	}
	else
	{
		System.out.println("vc n�o escolheu nem s nem n, tchau");
	}
	System.out.println("fim de programa");
	
	
		
		
	}
	}
	
	
	
}

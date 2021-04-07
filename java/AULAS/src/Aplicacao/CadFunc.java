package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Classes.Pessoa;

public class CadFunc {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Pessoa func1= new Pessoa();
		Pessoa func2= new Pessoa();	
		
		int idade1;
		int idade2;
		
		
		//instanciar uma pessoa
		System.out.println("digite o nome do funcionario:");
		func1.nome = leia.next();
		System.out.println("digite o nome do funcionario:");
		func2.nome = leia.next();
		System.out.println("digite o ano de nascimento:");
		func1.anoNascimento=leia.nextInt();
		System.out.println("digite o ano de nascimento:");
		func2.anoNascimento=leia.nextInt();
		
		idade1=2021 - func1.anoNascimento;
		idade2=2021 - func2.anoNascimento;
		System.out.printf("idade pessoa 1-%d anos/n");
		System.out.printf("idade pessoa 2-%d anos/n");
	if(func1.calculaidade()<func2.calculaidade()) {
		System.out.printf("0 %s %s é a pessoa velha",func1.genero);
		
	}
	
	}
	
	

}

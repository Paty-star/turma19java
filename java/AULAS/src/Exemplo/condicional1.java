package Exemplo;
import java.util.*;
public class condicional1 {
	public static void main (String[] args)	{
		{
			Scanner ler= new Scanner(System.in);
			int idade;
			String nome;
			System.out.printf("entre com a sua idade:");
			idade = ler.nextInt();
			ler.nextLine();
			System.out.printf("entre com o seu nome:");
			nome = ler.nextLine();
			System.out.printf("\nseu nome:%s",nome);
			System.out.printf("\nSua idade:%d",idade);
			
			if(idade>=18)
			{
				System.out.printf("você é maior de idade..");
			 
			}
				
			}
			else if (idade>=1&& idade<18)
			{
				System.out.printf("\nvocê é menor de idade..");
				else 
				{
					System.out.printf("vc entrou com uma idade invalida!");
					
				
			}
		
					
					
					
					
					
			
			
			
					
		}
	}
		

}

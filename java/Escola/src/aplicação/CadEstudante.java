package aplica��o;

import java.util.Locale;
import java.util.Scanner;

public class CadEstudante {



	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Eesola ED+");
		System.out.println("aqui vai ou vai mesmo");
		System.out.println("\n1 - basico\2 - m�dio\3 -");
		System.out.println("digite o codigo da Op��o:");
		opcao = leia.next().charAt(0);
		if (opcao = = '1') {
		
			System.out.println("digite a matricula:");
			int matricula = leia.nextInt();
			System.out.println("digite o cpf:");
			String cpf = leia.next();
			System.out.println("");
			
			
	} while (opcao != '6');
	
	
	
	
	System.out.println("fim de programa");

	}
		

	}

}

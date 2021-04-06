package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class exemplopara {
public static void main (String[]args) {
	Scanner leia =new Scanner(System.in);
	
	
	final double HABITANTES =20;
	double salario=0.00;
	double numerofilhos=0;
	double mediasalario=0.00;
	double totalsalario=0.00;
	double medianumerofilhos=0.00;
	double totalfilhos=0.00;
	double maiorsalario=0.00;
	double percentualPessoasSalarioAte100=0.00;
	double contadorPessoasSalario100=0;
	
	for(int x=1;x<=HABITANTES;x++) {
		System.out.println("Informe o salario do habitante "+x+" R$:");
		salario = leia.nextDouble();
		System.out.println("Informe a qtde de filhos:");
		numerofilhos = leia.nextDouble();
		
		totalsalario = totalsalario +salario;
		
		mediasalario = totalsalario / HABITANTES;
		
		
		System.out.printf("\ntotal dos salarios R$ 2F", totasalario  );
		System.out.printf("\nmedia salarios: R$ %.2f\", mediaSalario);
		
		
		
		
	

				
		
		
		
		
	}
	}
	
}
}

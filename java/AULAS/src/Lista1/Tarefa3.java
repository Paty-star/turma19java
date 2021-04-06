package Lista1;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double tempoduracao;
		double horas;
		double minutos;
		double segundos;
		
		
	 System.out.println("digite o tempo de duracao do evento em segundos:");
		tempoduracao = leia.nextDouble();
		
		horas = tempoduracao / 3600;
		minutos =tempoduracao % 3600 /60;
		segundos = tempoduracao %3600 %60;
				
				System.out.printf("horas: %0f,horas,");
		
		
	}

}

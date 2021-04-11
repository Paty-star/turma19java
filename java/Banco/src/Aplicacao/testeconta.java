package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Conta;

public class testeconta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta contajaoa = new Conta();
		System.out.println("digite o numero da conta:");
		contajaoa.numero = leia.nextInt();
		System.out.println("digite o cpf da conta:");
		contajaoa.cpf = leia.next();
		System.out.println("operação de 1-credito ou 2-debito?");
		char opcao = leia.next().charAt(0);
		if (opcao=='1') {
			contajaoa.credito(valor);
		}
		
		System.out.printf("cpf: %s \n",contajaoa.cpf);
		System.out.printf("numero conta: %s \n",contajaoa.numero);
		System.out.printf("saldo: %s \n",contajaoa.saldo);
	}

}

import java.util.Scanner;

public class TesteTry {

	public static void main(String[] args) {
		Scanner leia  = new Scanner(System.in);
		int nota;
		String nomes[]=new String[3];
		int aux=0;
		String situacao;
		System.out.println("digite a posicao da pessoa no vetor[0-2]");
		aux = leia.nextInt();
		System.out.println("digite o nome da pessoa:");
		nomes[aux] = leia.next();
		System.out.println("digite a nota:");
		nota = leia.nextInt();
		if (nota <=5) {
		situacao = "ainda nao estude um pouco mais";	
		}
		else 
		{
			situacao = "pode seguir para o proximo nivel";
			
		}
		catch(InputMismatchException erro) 
		
		System.out.println("vc nao digitou um numero");
		
		catch
	}

}

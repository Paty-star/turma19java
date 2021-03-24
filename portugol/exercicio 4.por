programa
{
	
	funcao inicio()
	{
	inteiro matriz [3][3]
	inteiro totaldiagonal=0
	escreva("forma de matriz")
		para (inteiro linha=0;linha<3;linha++){
			
		para(inteiro coluna=0; coluna<3;  coluna++)
		{
			escreva("digite o valor da linha 4", linha,"coluna", coluna,":")
			escreva(matriz[linha][coluna]," ")
			se(linha==coluna){
				totaldiagonal=totaldiagonal+matriz[linha][coluna]
			}
			escreva("\n")
			
		}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
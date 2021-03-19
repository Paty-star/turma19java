programa
{
	
	funcao inicio()
	{
		real pesotomate
		real excesso
		real multa = 0.0
		real multapeso

		escreva("oi joão,adicione quantos kilos de tomates voce possui. ")
		leia(pesotomate)

		se(pesotomate<=50){
	     escreva("peso esta dentro do limite a multa é de r$:",multa)

	     se(pesotomate>50){
	     excesso =pesotomate-50
	     multa =4.0
          multapeso= excesso * multa
          escreva("o peso excedeu o limite, a multa é de r$",multapeso)
	     }
		}
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
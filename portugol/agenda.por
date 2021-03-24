programa
{
	
	funcao inicio()
	{
		cadeia agenda[24][31]
		inteiro dia, hora
		caracter opcao
		escreva("digite o dia do compromisso:")
		leia(dia)
		dia=dia-1
		escreva("digite a hora;")
		leia(hora)
		escreva("informe o compromisso:")
		leia(agenda[hora][dia])
		escreva("continua sim ou nao s\n:")
		leia (opcao)
		se (opcao=='n' ou opcao=='n'){
			pare
		}
		enquanto (verdadeiro)
	para (inteiro d=0;d<31;d++){
		para(inteiro h=0;h<24;h++){
			ecreva("agenda dia", dia ,"as" h, ,agenda[h][d])
		}
		limpa()
		escreva("agenda dia", dia,"as",hora,"")
		
		
		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 557; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
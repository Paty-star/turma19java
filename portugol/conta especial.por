programa
{
	
	funcao inicio()
	{
		inteiro numero 0.0
		cadeia cpf ""
		real limitetotal 0.0
		
		logico ativa  // verdadeiro ou falso
		caracter opcao
		cadeia tipo
	}
	funcao basico(){
		real limite //camelcase
		caracter auxusarlimiteousoma
		inteiro  auxlimite
		escreva("Banco EdMais!\n")
		
		escreva("O banco que desenvolve\n")
		escreva("\n")
		escreva("Escolha uma opção:\n (1) Conta Poupança\t (2) Conta corrente\n (3) Conta Especial\t (4) Conta Empresa\n (5) Conta Estudantil\t (6) Sair\n")
		escreva("\nDigite aqui sua opção: ")
		leia(opcao)}
		limpa()
		tipo="basico"
		cabecalho(tipo)
		util.aguarde(2000)
		
	

		funcao cabecalho(){ (cadeia tipo){
			limpa()
			escreva("Banco EdMais!\n")
			escreva("digite limite")
			leia(limite)
			para (real x=3; x<=10; x++)
			escreva("movimento: ",x"\n")
			escreva("limite")
			escreva("limite atual:",limite)
			escreva("1 -usar limite , 2 soma no saldo ou 3 tira do limite")
			escreva("valor do limite:")
			leia(limite)
			leia(auxusarlimiteousoma)
			se (auxusarlimiteousoma=='3'){
				limite=limite+limitetotal
			}senao{
				limite=limite-limitetotal
				escreva("qual o limite?")
				leia(auxlimite)
				se (auxlimite==limitetotal)
				limite=limite*0,05)+limite

				escreva("limite:",limite
				escreva("cpf",cpf)
				escreva("limitetotal:",status)
				
				
			}
			
			
			
		escreva("O banco que desenvolve\n")
		escreva("\n")
		escreva("Conta", contaTipo, "\n")
		escreva("\nSaldo Atual: R$ \n")
		escreva("movimento D-debito ou c-credito\n ")
		leia(aux)
		se (aux=='3'){
			ativo = verdadeiro
		} senao {
			ativo = falso
			
		
		}
			
		}
	}
	
	
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 126; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
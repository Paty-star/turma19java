package Entidade;

import java.util.Locale;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Produto prod1 = new Produto ("camisa","x001", 100,25);
		revista prod2 = new revista("craudia","R0002",25.50, "Abril");
		
		prod2.incluirestoque(10);
		
		
		
		
		
		System.out.println(prod1.getDescricao()+"R$"+prod1.getValorunitario()+"estoque"+prod1.getQtdeestoque());
		prod1.setValorunitario(80.55);
		prod1.

	}

}

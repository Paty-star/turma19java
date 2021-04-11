package Entidade;

public class revista extends Produto {
	public String editora;

	public revista(String descricao, String codigo, double valorunitario, String editora) {
		super(descricao, codigo, valorunitario, qtdeestoque);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	
	
}

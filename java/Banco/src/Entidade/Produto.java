package Entidade;

public class Produto {

	private String descricao;
	private String codigo;
	private double valorunitario;
	private int qtdeestoque;
	Produto(String descricao, String codigo, double valorunitario, int i) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorunitario = valorunitario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValorunitario() {
		return valorunitario;
	}
	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}
	public int getQtdeestoque() {
		return qtdeestoque;
	}
	public void setQtdeestoque(int qtdeestoque) {
		this.qtdeestoque = qtdeestoque;
	}
	
	
	public void incluirestoque(int valorserincluido) {
		this.qtdeestoque = this.qtdeestoque  + valorserincluido;
		this.qtdeestoque+= valorserincluido;
				
	}	public void tirarestoque(int valoraserexcluido ) {
			
		}
	}

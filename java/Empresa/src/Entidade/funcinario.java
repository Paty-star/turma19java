package Entidade;

public class funcinario {
	private String matricula;
	private String nome;
	private int horastrabalhadas;
	private double valorhora;
	public funcinario(String matricula, String nome, int horastrabalhadas, double valorhora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horastrabalhadas = horastrabalhadas;
		this.valorhora = valorhora;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorastrabalhadas() {
		return horastrabalhadas;
	}
	public void setHorastrabalhadas(int horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}
	public double getValorhora() {
		return valorhora;
	}
	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}

}    public double salario() {
	return horastrabalhadas * valorhora;


package Entidade;

public class terceiro extends funcinario{
	
	public terceiro(String matricula, String nome, int horastrabalhadas, double valorhora) {
		super(matricula, nome, horastrabalhadas, valorhora);
		
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	private double adicional;

	public double salarioterceiro() {
		return super.salario(getAdicional());
	}

	public terceiro(String matricula, String nome, int horastrabalhadas, double valorhora, double adicional) {
		super(matricula, nome, horastrabalhadas, valorhora);
		this.adicional = adicional;
	}

}

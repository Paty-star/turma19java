package Entidades;

public class Basico extends Estudante {
	private int diaaniversario;

	public Basico(int matricula, String cpf, double pontos, boolean status, int diaaniversario) {
		super(matricula, cpf, pontos, status);
		this.diaaniversario = diaaniversario;
	}

	public int getDiaaniversario() {
		return diaaniversario;
	}

	public void setDiaaniversario(int diaaniversario) {
		this.diaaniversario = diaaniversario;
	}
	
		public void bonusaniversario(int diaAtual) {
		if	(diaaniversario == diaAtual) {
			super.incluirPontos(super.getPontos()*0.10);
		}
		}
}     

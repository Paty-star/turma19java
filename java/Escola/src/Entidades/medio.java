package Entidades;

public class medio extends Estudante {
	private int contadorBoletim;

	public medio(int matricula, String cpf, double pontos, boolean status, int contadorBoletim) {
		super(matricula, cpf, pontos, status);
		this.contadorBoletim = contadorBoletim;
	}

	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	public void  imprimirBoletim() {
		System.out.println("BOLETIM");
		System.out.println("Pontos atuais: "+super.getPontos());
	}

}

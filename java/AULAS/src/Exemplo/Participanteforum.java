package Exemplo;

public class Participanteforum implements leitor, Programador{
	String pensamento;
	public String lendo()
	{
		return "forum";
	}
		public void pensamento(char[]ideias)
		{
			pensamento = new String (ideias);
		}
	}

}

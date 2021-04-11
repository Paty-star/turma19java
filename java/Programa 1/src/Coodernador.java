
public class Coodernador extends Pessoa {
private String cursocoodenado;

public Coodernador(String nome, int matricula, String cursocoodenado) {
	super(nome, matricula);
	this.cursocoodenado = cursocoodenado;
	
} 

public String getCursocoodenado() {
	return cursocoodenado;
}

public void setCursocoodenado(String cursocoodenado) {
	this.cursocoodenado = cursocoodenado;
}

}

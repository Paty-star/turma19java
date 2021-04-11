import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
public static void main(String args[]) {
	
	Set<Aluno> conjunto new HashSet<Aluno>();
	Aluno a= new Aluno("joao da silva", "java",6.8);
	Aluno b= new Aluno("maria da santos", "linux",5.8);
	Aluno c= new Aluno("joana da silveira", "portugol",7.8);
    Aluno d= new Aluno("carlos da costa", "java",9.0);
    
    conjunto.add(a);
    conjunto.add(b);
    conjunto.add(c);
    conjunto.add(d);
    
    
    
    System.out.println(conjunto);
    
    
}
}
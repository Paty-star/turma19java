import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class coleções {

	public static void main(String[] args) {
			Collection<String> nomes = new ArrayList();
			nomes.add("mario");
			nomes.add("maria");
			nomes.add("rafa");
			nomes.add("mari");
			nomes.add("mariah");
			List<String> nomes2 = Arrays.asList("mario","joana");
			nomes.addAll(nomes2);
			System.out.println("contem o nome maria?"+nomes.contains("maria"));
			System.out.println("lista:"+nomes);
			System.out.println("lista de nomes:"+nomes);
			for(String name:nomes)
				System.out.println("lista de nomes:"+name);
				
		
			System.out.println("lista de nomes:"+nomes);
			nomes.clear();
			if(nomes.isEmpty())
				
				System.out.println("lista vazia!");
			
			else 
			System.out.println("lista de nomes:"+nomes);

			nomes.remove("mario");
			System.out.println("lista de nomes:"+nomes);

	}       
	

}

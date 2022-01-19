package fase1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//Cadenes Inicials
		Stream<String>  noms      = Stream.of("Anna","ana","Dani","Ana","Ane","An");
		Stream<Integer> numeros   = Stream.of(2,3,44,33,1,4,88,55,31,28);
		Stream<String>  paraules  = Stream.of("Casa","Carro","Orgue","Conte","Teclat","Ratoli","Bici");
		Stream<String>  paraules2 = Stream.of("Casa","Carro","Orgue","Conte","Teclat","Ratoli","Bici");
		Stream<String>  mesos     = Stream.of("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
		Stream<String>  mesos2    = Stream.of("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
		
		
		//Lambdas
		System.out.println(noms.filter(s->s.startsWith("A")).filter(s -> s.length()==3).collect(Collectors.toList()));;
		
		System.out.println(numeros.map(a->(a%2==0)? "e"+a : "o"+a ).collect(Collectors.toList()));
				
		System.out.println(paraules.filter(s-> (s.contains("o") || (s.contains("O")))).collect(Collectors.toList()));
		
		System.out.println(paraules2.filter(s-> s.length()>=5).collect(Collectors.toList()));
		
		mesos.forEach(m-> System.out.print(m+" "));
		System.out.println();
		
		mesos2.map(s->s+" ").forEach(System.out::print);
		
				
	}

}

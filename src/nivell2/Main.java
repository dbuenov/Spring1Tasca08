package nivell2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ExerciciLambdasStreams      exercici1 = new ExerciciLambdasStreams();
		ExerciciInterficieFuncional exercici2 = new ExerciciInterficieFuncional();
		
		//exercici1.executa();
		exercici2.executa();
				
	}

}

class ExerciciLambdasStreams{
	public void executa() {
		List<String> matriu = Arrays.asList("Woody", "14", "Mr Potato", "Eddie", "18", "Buzz Lightyear",
				"42", "Elephant","Ham","67", "Rex", "Jessie", "Mrs Potato", "23", "201", "0101");  
		
		//Ordeneu-lo per longitud ( de m�s curta a m�s llarga)
		System.out.println("Ordre per longitud de - a +");
		matriu.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);
		System.out.println();		
		
		//Ordeneu-lo longitud inversa (de  m�s llarga a  m�s curta)
		System.out.println("Ordre per longitud de + a -");
		matriu.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		System.out.println();
		
		//Ordeneu-lo alfab�ticament pel primer car�cter ( Nota: charAt (0) retorna el  codi num�ric del primer  car�cter)
		System.out.println("Ordre alfabetic");
		matriu.stream().sorted(Comparator.comparing(s -> s.charAt(0))).forEach(System.out::println);
		System.out.println();
		
		//Ordeneu-lo per les cadenes que contenen "e" primer, tota la resta en segon lloc. De moment , poseu el codi directament a la lambda.  
		System.out.println("Contenen la e primer");
		matriu.stream().sorted(Comparator.comparing((String s) -> s.toLowerCase().contains("e")).reversed()).forEach(System.out::println);
		System.out.println();
				
		//Modifica tots els elements de la  matriu per canviar els caracters  �a� a �4�
		System.out.println("Canviar a per 4");
		matriu.stream().map(s->s.replace("a","4")).forEach(System.out::println);
		System.out.println();
		
		//Mostra nom�s els elements que siguin 100% numerics . (tot i que  estigui guardats com strings)   
		System.out.println("Nom�s numeros");
		matriu.stream().filter(v -> v.matches("\\d+")).forEach(System.out::println);
		System.out.println();
	}
		
}

class ExerciciInterficieFuncional {
	/*
		Crea una Functional Interface que continga un m�tode abstracte operacio (), 
		que retorne un valor float; injecta a la interf�cie creada mitjan�ant una 
		lambda el cos del m�tode, de manera que pugis transformar la operaci� a una 
		suma, resta, multiplicaci� i divisio. 
	*/
	
	public void executa() {
		
		InterfaceFuncional suma = (a,b) -> a+b;
		InterfaceFuncional resta = (a,b) -> a-b;
		InterfaceFuncional multiplicacio = (a,b) -> a*b;
		//cal controlar que b no sigui 0, cal enviar missatge per pantalla?		
		InterfaceFuncional divisio = (a,b) -> (b!=0)?a/b:0;
		System.out.println(suma.operacio(2.3F, 3.8F));
		System.out.println(resta.operacio(2.3F, 3.8F));
		System.out.println(multiplicacio.operacio(2.3F, 3.8F));
		System.out.println(divisio.operacio(2.3F, 3.8F));
	}
}

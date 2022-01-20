package nivell3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Llista llistat = new Llista();
		
		List<Alumne> llista = llistat.llista;
				
		//Mostra per pantalla el nom i l’edat de cada alumne
		ex1(llista);
				
		//Filtra la llista per tots els alumnes que el  nom comenci per “a”, asigna-ho a un altre  llista y  mostra per pantalla la nova llista (tot  amb lambdas)
		//ex2(llista);
						
		//Filtra y mostra per pantalla els alumnes que  tinguin un 5 o mes de nota
		//ex3(llista);
				
		//Filtra y mostra per pantalla els alumnes que  tinguin un 5 o mes de nota y que no siguin  de PHP. 
		//ex4(llista);
				
		//Mostra tots els alumnes que facin JAVA i siguin majors d’edat. 
		//ex5(llista);
				
	}
	
	//lambes
	public static void ex1(List<Alumne> llista) {
		llista.stream().forEach(a->System.out.println(a.getNom()+" "+a.getEdat()));
	}

	public static void ex2(List<Alumne> llista) {
		System.out.println(llista.stream().filter(a->a.getNom().startsWith("A")).collect(Collectors.toList()));
	}
	
	public static void ex3(List<Alumne> llista) {
		llista.stream().filter(a->a.getNota()>=5).forEach(System.out::println);
	}
	
	public static void ex4(List<Alumne> llista) {
		llista.stream().filter(a->a.getNota()>=5).filter(a-> !(a.getCurs().toLowerCase().equals("php"))).forEach(System.out::println);
	}
	
	public static void ex5(List<Alumne> llista) {
		llista.stream().filter(a->a.getEdat()>=18).filter(a-> a.getCurs().toLowerCase().equals("java")).forEach(System.out::println);
	}
	
		
	

}

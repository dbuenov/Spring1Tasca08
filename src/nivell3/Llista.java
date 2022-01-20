package nivell3;

import java.util.ArrayList;
import java.util.List;

public class Llista {
	
	public List<Alumne> llista;
	
	public Llista() {
		this.llista = new ArrayList<Alumne>();
		
		llista.add(new Alumne("Marc", 17, "PHP", 8.3));
		llista.add(new Alumne("Pau", 21, "Java", 6.7));
		llista.add(new Alumne("Paula", 24, "java", 4.6));
		llista.add(new Alumne("Pere", 23, "React", 7.8));
		llista.add(new Alumne("Anna", 45, "Node", 9.2));
		llista.add(new Alumne("Bernat", 74, "php", 7.5));
		llista.add(new Alumne("Simon", 15, "Data", 3.1));
		llista.add(new Alumne("Carla", 16, "React", 5.6));
		llista.add(new Alumne("Bruno", 41, "Data", 4.9));
		llista.add(new Alumne("Elian", 17, "JAVA", 8.9));
		llista.add(new Alumne("Albert", 19, "php", 9.3));
			
	}
	
	
}

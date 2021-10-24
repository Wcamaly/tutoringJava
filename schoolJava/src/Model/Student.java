package Model;

import java.util.List;
import java.util.Map;

public class Student extends Person {

	int legajo;
	Map<String, List<String>> notas; // TODO buscar como se escribe notas en ingles
	
	public Student(String name, String surname, String document, String typeDocument) {
		super(name, surname, document, typeDocument);
		// TODO Auto-generated constructor stub
	}
	
	

}

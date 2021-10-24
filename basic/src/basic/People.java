package basic;

public class People {
	
	// Constantes
	public final static String DNI = "DNI";
	public final static String PASSPORT = "PASSPORT";
	public final static String LIB = "LIB";
	public final static String RUT = "RUT";
	
	
	// Atributos
	private String name; 
	private String surname;
	private String document;
	private String typeDocument;
	private int age;
	
	// Constructores
	public People() {
		this.name="";
		this.setSurname("");
		this.setDocument("");
		this.setTypeDocument("");
	}
	
	public People(String name, String surname, String document, String typeDocument) {
		this.name = name;
		this.setSurname(surname);
		this.setDocument(document);
		this.setTypeDocument(typeDocument);
	}
	
	public People(String name, String surname) {
		this.name = name;
		this.setSurname(surname);
		this.setDocument("");
		this.setTypeDocument("");
	}
	
	
	// Getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Methods
	
	
	void hablar (String sMensaje) {
		System.out.println(sMensaje);
	}
	
	void hablar (int iNumber) {
		System.out.println(iNumber);
	}
	
	
	
	
}

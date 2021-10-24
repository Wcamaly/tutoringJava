package Model;

public class Person {
	private String name;
	private String surname;
	private String document;
	private String typeDocument;
	public Person(String name, String surname, String document, String typeDocument) {
		super();
		this.name = name;
		this.surname = surname;
		this.document = document;
		this.typeDocument = typeDocument;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
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

}

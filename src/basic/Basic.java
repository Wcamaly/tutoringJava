package basic;

public class Basic {

	public static void main (String args[]) {
		
		System.out.println("Start Program.........");
		People people = new People("name", "surname", "document", People.DNI);
		People people2 = new People("name", "surname");
		People people3 = new People();
		people3.setName("Juan");
		
		people2.setName("Analia");
		people2.setSurname("Herrera");
		
		
		
		System.out.println("name: " + people2.getName() + "\nsurname: "+ people2.getSurname());
		
	}		
}
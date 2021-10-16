package basic;

public class DefinitionInterfaceClassAndClassAbstrct {

}

interface IDefinitionInterface {
	public String getDatabaseConect();
	public int getTablesCount();
	
}

abstract class DomElement {
	private String name;	
	abstract void onClick();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Button extends DomElement {

	@Override
	void onClick() {
		// TODO Auto-generated method stub
		System.out.println("Hizo click en un boton");
		
	}


}

class TexBox extends DomElement {

	@Override
	void onClick() {
		// TODO Auto-generated method stub
		System.out.println("Hizo click en un TexBox");
	}
	
}
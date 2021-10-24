package basic;

public class DefinitionInterfaceClassAndClassAbstrct implements IDefinitionInterface {

	@Override
	public String getDatabaseConect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTablesCount() {
		// TODO Auto-generated method stub
		return 0;
	}

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

	Button () {
		super();
	}
	
	@Override
	void onClick() {
		System.out.println("Hizo click en un boton");
	}

	@Override
	public void setName(String name) {
		super.setName(name);
		System.out.println("Hello "+ name + ". Welcome to Java course");
	}

}

class TexBox extends DomElement {

	@Override
	void onClick() {
		System.out.println("Hizo click en un TexBox");
	}
	
}
package examples;

import java.util.Collection;

public interface ClassList<E> {
	
	void add (E e);
	void addAll (Collection<E> e);
	E getElement(int indx);
	
}

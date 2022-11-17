package TPE;

import java.util.Iterator;

public class IteradorNodo<T> implements Iterator<T> {
	
	private Nodo<T> siguiente;
	
	public IteradorNodo(Nodo<T> primerNodo) {
		this.siguiente= primerNodo;
	}
	
	
	@Override
	public boolean hasNext() {
		return (this.siguiente!=null);
	}

	@Override
	public T next() {
		T result = (T) siguiente.getValor();
		this.siguiente = siguiente.getSiguienteNodo();
		return result;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

}
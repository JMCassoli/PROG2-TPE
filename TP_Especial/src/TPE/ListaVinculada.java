package TPE;

import java.util.Comparator;
import java.util.Iterator;


public class ListaVinculada<T> implements Iterable<T> {
	
	private Nodo<T> primerNodo;
	private Comparator<T> orden;
	private Nodo<T> anteriorNodo;
	private IteradorNodo iterador;
	
	public ListaVinculada(Comparator<T> orden) {
		this.primerNodo=null;
		this.orden=orden;
		this.iterador = (IteradorNodo) iterator();
	}
	
	public void insertarOrdenado(T nuevoValor) {
		if(primerNodo == null) {
			primerNodo = new Nodo<T>(nuevoValor);
			System.out.println(iterador.getSiguiente());
		} else {
			while (this.iterador.hasNext()) {
				System.out.println("1");
				this.iterador.next();
			}
		}
	}
		
	public void imprimir() {
		for (T n : this) {
			System.out.println(1);
		}
		
	}
	
	public void ordenar() {
		
	}

	@Override
	public Iterator<T> iterator() {
		IteradorNodo it = new IteradorNodo(this.primerNodo);
		this.setIterador(it);
		return it;
	}

	public void setOrden(Comparator<T> orden) {
		this.orden = orden;
	}

	public Nodo<T> getPrimerNodo() {
		return primerNodo;
	}

	public void setPrimerNodo(Nodo<T> primerNodo) {
		this.primerNodo = primerNodo;
	}

	public Iterator<T> getIterador() {
		return iterador;
	}

	public void setIterador(IteradorNodo<T> iterador) {
		this.iterador = iterador;
	}
	
	

}
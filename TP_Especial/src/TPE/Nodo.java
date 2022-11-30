package TPE;

public class Nodo<T> {

	private Nodo<T> siguienteNodo;
	private T valor;
	
	public Nodo(T valor) {
		this.valor = valor;
		this.siguienteNodo = null;
	}

	public Nodo<T> getSiguienteNodo() {
		return siguienteNodo;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}

	public void setSiguienteNodo(Nodo<T> nodo) {
		this.siguienteNodo = nodo;
	}

	public T getValor() {
		return this.valor;
	}
	
	public String toString() {
		return this.getValor().toString();
	}

}
    
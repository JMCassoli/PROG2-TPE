package TPE;

import java.util.Iterator;

public class Nodo implements Comparable<Nodo>, Iterator<Nodo>{

	private int posicion;
	private Object elemento;
	
	public Nodo(int pos, Object elem) {
		this.posicion=pos;
		this.elemento = elem;
	}
	
	
	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	@Override
	public boolean hasNext() {
		return posicion<ListaVinculada.maxIteraciones;		
	}

	@Override
	public Nodo next() {
		posicion++;
		return new Nodo(posicion, null);
	}

	@Override
	public int compareTo(Nodo o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public Object getElemento() {
		return elemento;
	}


	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	public String toString() {
		String result = "posicion" + this.posicion;
		return result;
	}

}

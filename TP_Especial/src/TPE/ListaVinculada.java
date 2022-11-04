package TPE;

import java.util.Iterator;

public class ListaVinculada implements Iterable<Nodo> {
	
	private int criterio; 
	public static int maxIteraciones = 0;
	
	public ListaVinculada(int criterio) {
		
		this.criterio = criterio;
		this.maxIteraciones=maxIteraciones;
	}
	
	public void addNodo() {
		ListaVinculada.maxIteraciones++;
		
	}
	

	@Override
	public Nodo iterator() {
		return new Nodo(-1, null);
	}


}

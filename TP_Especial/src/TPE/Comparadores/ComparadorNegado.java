package TPE.Comparadores;

public class ComparadorNegado<T> extends Comparador<T> {

	private Comparador<T> comparador;
	
	public ComparadorNegado(Comparador<T> comp){
		this.comparador=comp;
	}
	
	@Override
	public int compare(T o1, T o2) {
		return (this.comparador.compare(o1, o2))*-1;
		
	}

}

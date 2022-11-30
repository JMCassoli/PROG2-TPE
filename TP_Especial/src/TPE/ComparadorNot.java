package TPE;
import java.util.Comparator;
public class ComparadorNot<T> implements Comparator<T>{

	private Comparator<T> comparador;

	
	public ComparadorNot(Comparator<T> comparador) {
		super();
		this.comparador = comparador;
	}

	@Override
	public int compare(T o1, T o2) {
		
		return (comparador.compare (o1, o2))* -1 ;
	}
	
	public Comparator<T> getComparador() {
		return comparador;
	}

	public void setComparador(Comparator<T> comparador) {
		this.comparador = comparador;
	}

}

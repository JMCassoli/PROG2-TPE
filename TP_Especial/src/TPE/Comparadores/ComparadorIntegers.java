package TPE.Comparadores;

import java.util.Comparator;

public class ComparadorIntegers<T> extends Comparador<T> {
	@Override
	public int compare(T o1, T o2) {
		int aux1= (int)o1;
		int aux2=(int)o2;
		return aux1-aux2;
	}


}
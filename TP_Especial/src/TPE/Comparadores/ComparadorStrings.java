package TPE.Comparadores;

import java.util.Comparator;

public class ComparadorStrings<T> extends Comparador<T>  {

	@Override
	public int compare(T o1, T o2) {
		return ((String)o1).compareTo((String) o2);
	}

}

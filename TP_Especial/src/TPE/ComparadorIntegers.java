package TPE;

import java.util.Comparator;

public class ComparadorIntegers implements Comparator<Object> {

    public int compare(Object a,Object b) {
    	Integer aux = (Integer)((Nodo)a).getValor();
    	Integer baux = (Integer)b;
    	return aux.compareTo(baux);    	
    }
}
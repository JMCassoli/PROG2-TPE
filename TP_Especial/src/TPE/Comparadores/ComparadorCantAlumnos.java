package TPE.Comparadores;

import TPE.ElementoFacultad;

public class ComparadorCantAlumnos<T> extends Comparador<T> {

	@Override
	public int compare(T o1, T o2) {
		
		ElementoFacultad e1 = (ElementoFacultad) o1;
		ElementoFacultad e2 = (ElementoFacultad) o2;
		return e1.getCantidadAlumnos() - e2.getCantidadAlumnos();
	}

}

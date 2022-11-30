package TPE.Comparadores;

import TPE.Alumno;

public class ComparadorAlumnos<T> extends Comparador<T> {

	@Override
	public int compare(T o1, T o2) {
		Alumno alumno1 = (Alumno) o1;
		Alumno alumno2 = (Alumno) o2;
		
		ComparadorStrings cs = new ComparadorStrings();
		ComparadorIntegers ci = new ComparadorIntegers();
		
		if(cs.compare(alumno1.getNombre(), alumno2.getNombre())==0) {
			if(cs.compare(alumno1.getApellido(), alumno2.getApellido())==0) {
				return ci.compare(alumno1.getDNI(), alumno2.getDNI()); 	
			}return cs.compare(alumno1.getApellido(), alumno2.getApellido());
		} return cs.compare(alumno1.getNombre(), alumno2.getNombre());
		
	}

}

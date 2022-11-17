package TPE;

public class Main {

	public static void main(String[] args) {
		ComparadorIntegers comparador = new ComparadorIntegers();
		ListaVinculada lista = new ListaVinculada(comparador);
		lista.insertarOrdenado(3);
		lista.insertarOrdenado(4);
		lista.imprimir();
		
	}
	

}

package TPE;

public class Main {

	public static void main(String[] args) {
		ComparadorIntegers comparador = new ComparadorIntegers();
		ListaVinculada lista = new ListaVinculada();
		lista.setOrden(comparador);
		lista.insertarOrdenado(2);
		lista.insertarOrdenado(1);
		lista.insertarOrdenado(2);
		lista.insertarOrdenado(3);
		lista.insertarOrdenado(5);
		lista.insertarOrdenado(5);
		lista.insertarOrdenado(1);
		lista.insertarOrdenado(2);
		lista.insertarOrdenado(4);
		lista.insertarOrdenado(5);
		lista.insertarOrdenado(4);
		lista.insertarOrdenado(7);
		lista.insertarOrdenado(7);
		lista.insertarOrdenado(2);
		
		lista.mostrarLista();
		System.out.println("---------------------------");
		System.out.println("posicion : " + lista.obtenerPosicion(1));
		ComparadorIntegersDesc comparador2 = new ComparadorIntegersDesc();
		lista.setOrden(comparador);
		lista.mostrarLista();
		}
}

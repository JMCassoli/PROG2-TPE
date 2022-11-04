package TPE;

public class Main {

	public static void main(String[] args) {
		ListaVinculada lista = new ListaVinculada(1);
		lista.addNodo();
		for(Nodo nodo:lista) {
			System.out.println(nodo);
		}
		System.out.println(getNodo(0 ,lista));
			
	}
	
	public static Nodo getNodo(int pos,ListaVinculada lista) {
		for (Nodo nodo : lista) {
			if(nodo.getPosicion() == pos) {
				return nodo;
			}
		}
		return null;
	}

}

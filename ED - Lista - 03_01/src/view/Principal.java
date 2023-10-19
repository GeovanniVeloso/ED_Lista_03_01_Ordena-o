package view;

import br.edu.fatec.zl.Lista;
import controller.OrdenaController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = { 10, 5, 8, 1, 9, 2, 4, 7, 3, 6 };
		Lista<Integer> lista = new Lista<Integer>();
		OrdenaController oc = new OrdenaController();

		int c = 0;

		while (c < 10) {
			if (lista.isEmpty()) {
				lista.addFirst(vetor[c]);
			} else {
				try {
					lista.addLast(vetor[c]);
				} catch (Exception e) {
					System.err.println(e);
				}
			}
			c += 1;
		}

		oc.OrdLista(lista);

		c = 0;
		while (c < 10) {
			try {
				System.out.println(lista.get(c));
			} catch (Exception e) {
				System.err.println(e);
			}
			c += 1;
		}

	}

}

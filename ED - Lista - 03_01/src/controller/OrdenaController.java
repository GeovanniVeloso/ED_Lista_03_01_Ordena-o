package controller;

import br.edu.fatec.zl.Lista;
import br.edu.fatec.zl.QuickSort;

public class OrdenaController {

	public OrdenaController() {
		super();
	}

	public void OrdLista(Lista<Integer> lista) {
/*		int[] vetor = new int[10];
		int c = 0;
		while (c < 10) {
			try {
				vetor[c] = lista.get(c);
			} catch (Exception e) {
				System.err.println(e);
			}
			c = c + 1;
		}

		QuickSort qs = new QuickSort();

		qs.quickSort(vetor, 0, 9);
		c = 0;
		while (c < 10) {
			try {
				lista.addLast(vetor[c]);
				lista.removeFirst();
			} catch (Exception e) {
				System.err.println(e);
			}
			c = c + 1;
		}
		
		*/
		int aux = 0;
		int aux2 = 0;
		for(int n = 10; n >=1; n--) {
			for(int i = 0; i < n-1; i++) {
				try {
					if(lista.get(i) < lista.get(i+1)) {
						aux = lista.get(i);
						lista.remove(i);
						aux2 = lista.get(i);
						lista.remove(i);
						lista.add(aux, i);
						lista.add(aux2, i);
					}
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}
	}

}

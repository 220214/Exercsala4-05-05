package view;

import br.mari.listaInt.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista l = new Lista();
		Lista aux =new Lista();
		int [ ]v= {3,5,8,12,9,7,6,2,3,7,16};
		for(int va: v) {
			if(l.isEmpty()) {
				l.addFirst(va);
				aux.addFirst(va);
			}else {
				try {
					l.addLast(va);
					aux.addLast(va);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for (int i=0; i<aux.size();i++) {
			for(int j=(i+1);j<(aux.size());j++) {
			
					try {
						
						if(aux.get(i)>aux.get(j)) {
							int au =aux.get(i);
							aux.add(aux.get(j), i+1);
							aux.remova(i);
							aux.add(au,j+1);
							aux.remova(j);
						}
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			}
			
		
		try {
			System.out.println(" Maior valor: "+ aux.get(aux.size()-1) + "\t segundo maior valor: "+aux.get(aux.size()-2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package modelo;

public class Principal {
	
	 public static void main(String[] args) {
	        ArvoreBinaria arvore = new ArvoreBinaria();

	        arvore.inserir(50);
	        arvore.inserir(30);
	        arvore.inserir(20);
	        arvore.inserir(40);
	        arvore.inserir(70);
	        arvore.inserir(60);
	        arvore.inserir(80);

	        System.out.println("Buscar por 20: " + arvore.buscar(20));
	        System.out.println("Buscar por 90: " + arvore.buscar(90));

	        arvore.deletar(20);
	        System.out.println("Buscar por 20 após exclusão: " + arvore.buscar(20));
	    }
}

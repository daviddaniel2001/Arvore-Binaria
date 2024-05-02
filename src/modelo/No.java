package modelo;

public class No {
	
	int chave;
    No esquerda, direita;

    public No(int chave) {
        this.chave = chave;
        esquerda = direita = null;
    }
}

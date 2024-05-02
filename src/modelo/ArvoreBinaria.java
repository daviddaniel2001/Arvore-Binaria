package modelo;

public class ArvoreBinaria {
	
	No raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    No inserirRec(No raiz, int chave) {
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }

        if (chave < raiz.chave)
            raiz.esquerda = inserirRec(raiz.esquerda, chave);
        else if (chave > raiz.chave)
            raiz.direita = inserirRec(raiz.direita, chave);

        return raiz;
    }

    void deletar(int chave) {
        raiz = deletarRec(raiz, chave);
    }

    No deletarRec(No raiz, int chave) {
        if (raiz == null) return raiz;

        if (chave < raiz.chave)
            raiz.esquerda = deletarRec(raiz.esquerda, chave);
        else if (chave > raiz.chave)
            raiz.direita = deletarRec(raiz.direita, chave);
        else {
            if (raiz.esquerda == null)
                return raiz.direita;
            else if (raiz.direita == null)
                return raiz.esquerda;

            raiz.chave = valorMinimo(raiz.direita);
            raiz.direita = deletarRec(raiz.direita, raiz.chave);
        }

        return raiz;
    }

    int valorMinimo(No raiz) {
        int valorMinimo = raiz.chave;
        while (raiz.esquerda != null) {
            valorMinimo = raiz.esquerda.chave;
            raiz = raiz.esquerda;
        }
        return valorMinimo;
    }

    boolean buscar(int chave) {
        return buscarRec(raiz, chave);
    }

    boolean buscarRec(No raiz, int chave) {
        if (raiz == null)
            return false;

        if (raiz.chave == chave)
            return true;

        if (chave < raiz.chave)
            return buscarRec(raiz.esquerda, chave);
        else
            return buscarRec(raiz.direita, chave);
    }
}

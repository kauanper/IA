package grafo;

public class Transicao {
    public Estado estadoDestino;
    public int custo;

    public Transicao(Estado estadoDestino, int custo) {
        this.estadoDestino = estadoDestino;
        this.custo = custo;
    }
}

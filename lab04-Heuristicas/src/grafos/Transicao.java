package grafos;

public class Transicao {
    public grafo.Estado estado;
    public int custo;

    public Transicao(grafo.Estado estadoDestino, int custo) {
        this.estado = estadoDestino;
        this.custo = custo;
    }
}

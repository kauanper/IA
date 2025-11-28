package grafo;

public class Transicao {
    public Estado estado;
    public int custo;

    public Transicao(Estado estadoDestino, int custo) {
        this.estado = estadoDestino;
        this.custo = custo;
    }
}

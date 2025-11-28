import grafo.Estado;
import grafo.Transicao;

public class No {
    Estado cidadeAtual;
    No pai;
    Transicao acao;
    int custoAcumulado;

    public No(Estado cidadeAtual, No pai, Transicao acao, int custoAcumulado) {
        this.cidadeAtual = cidadeAtual;
        this.pai = pai;
        this.acao = acao;
        this.custoAcumulado = custoAcumulado;
    }

}

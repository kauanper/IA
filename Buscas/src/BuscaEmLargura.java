import grafo.Estado;
import grafo.Mapa;
import grafo.Transicao;

import java.util.*;

public class BuscaEmLargura {

    public List<No> execute(Estado inicial, Estado destino) {

        List<No> caminho = new ArrayList<>();
        No raiz = new No(inicial, null, null, 0);


        if(raiz.cidadeAtual.equals(destino)) {
            caminho.add(raiz);
            return caminho;
        }

        Queue<No> borda = new LinkedList<>();
        borda.add(raiz);

        List<Estado> explorados = new ArrayList<Estado>();

        while(!borda.isEmpty()) {
            No u = borda.poll();
            explorados.add(u.cidadeAtual);

            for(Transicao acao : u.cidadeAtual.transicoes){ //percorrer listAdj
                No filho = new No(acao.estado, u, acao, u.custoAcumulado + acao.custo);

                if(!explorados.contains(filho.cidadeAtual) && !borda.contains(filho)) {

                    if(filho.cidadeAtual.equals(destino)) {
                        while (filho.pai != null) { //retornar a lsita de caminhos
                            caminho.add(filho);
                            filho = filho.pai;
                        }
                        caminho.add(raiz);
                        return caminho;
                    }
                    borda.add(filho);
                }

            }

        }
        return caminho;
    }
}

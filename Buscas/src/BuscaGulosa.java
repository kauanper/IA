import grafo.Estado;
import grafo.Transicao;

import java.util.*;

public class BuscaGulosa {

    public List<No> execute (Estado inicial, Estado destino){
        List<No> caminho = new ArrayList<No>();
        No raiz = new No(inicial, null, null, 0);
        if(raiz.cidadeAtual.equals(destino)){
            caminho.add(raiz);
            return caminho;
        }

        PriorityQueue<No> borda = new PriorityQueue<>(
                Comparator.comparingInt(n -> n.cidadeAtual.Heuristica)
        );
        borda.add(raiz);
        List<Estado> explorados = new ArrayList<>();

        while(!borda.isEmpty()){
            No u = borda.poll();
            explorados.add(u.cidadeAtual);

            if(u.cidadeAtual.equals(destino)){
                while(u.pai != null){
                    caminho.add(u);
                    u = u.pai;
                }
                caminho.add(raiz);
                return caminho;
            }

            for(Transicao acao : u.cidadeAtual.transicoes){
                No filho = new No(acao.estado, u, acao, acao.custo + u.custoAcumulado);

                if(explorados.contains(filho.cidadeAtual)){
                    continue;
                }

                borda.add(filho);

            }

        }





        return caminho;
    }
}

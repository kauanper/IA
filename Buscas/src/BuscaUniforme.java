import grafo.Estado;
import grafo.Transicao;

import java.util.*;

public class BuscaUniforme {
    public List<No> execute(Estado inicio, Estado dest){
        List<No> caminho = new ArrayList<>();

        No raiz = new No(inicio, null, null, 0);

        if(raiz.cidadeAtual.equals(dest)){
            caminho.add(raiz);
            return caminho;
        }

        PriorityQueue<No> borda = new PriorityQueue<>(
                Comparator.comparingInt(n -> n.custoAcumulado)
        );

        borda.add(raiz);
        List<Estado> explorados = new ArrayList<>();

        while(!borda.isEmpty()){

            No u = borda.poll();
            explorados.add(u.cidadeAtual);

            if(u.cidadeAtual.equals(dest)){
                while (u.pai != null){
                    caminho.add(u);
                    u = u.pai;
                }
                caminho.add(raiz);
                return caminho;
            }

            for(Transicao acao : u.cidadeAtual.transicoes){

                No filho = new No(acao.estado, u, acao, acao.custo + u.custoAcumulado);

                if(explorados.contains(filho.cidadeAtual)) {
                    continue;
                }

                No naBorda = null;

                for(No no : borda){
                    if(no.cidadeAtual.equals(filho.cidadeAtual)){
                        naBorda = no;
                        break;
                    }
                }

                if(naBorda == null){
                    borda.add(filho);
                } else if(filho.custoAcumulado < naBorda.custoAcumulado){
                    borda.remove(naBorda);
                    borda.add(filho);
                }
            }

        }

        return caminho;
    }
}

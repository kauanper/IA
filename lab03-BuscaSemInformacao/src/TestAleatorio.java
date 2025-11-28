import grafo.Estado;
import grafo.Transicao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TestAleatorio {

    public List<No> execute(Estado i, Estado f){
        List<No> nos = new ArrayList<No>();
        No raiz = new No(i, null, null, 0);

        if(raiz.cidadeAtual.equals(f)){
            nos.add(raiz);
            return nos;
        }

        PriorityQueue<No> borda = new PriorityQueue<>(
                Comparator.comparingInt(n -> n.custoAcumulado)
        );
        borda.add(raiz);
        List<Estado> explorado = new ArrayList<>();

        while(!borda.isEmpty()){
            No u = borda.poll();
            explorado.add(u.cidadeAtual);

            if(u.cidadeAtual.equals(f)){
                while(u.pai != null){
                    nos.add(u.pai);
                    u = u.pai;
                }
                nos.add(raiz);
                return nos;
            }

            for(Transicao acao : u.cidadeAtual.transicoes){
                No filho = new No(acao.estado, u, acao, u.custoAcumulado + acao.custo);

                if(explorado.contains(filho.cidadeAtual)){
                    continue;
                }

                No naBorda = null;
                for(No n : borda){
                    if(n.cidadeAtual.equals(filho.cidadeAtual)){
                        naBorda = n;
                        break;
                    }
                }

                if(naBorda == null){
                    borda.add(filho);
                }else if(filho.custoAcumulado < naBorda.custoAcumulado){
                    borda.remove(naBorda);
                    borda.add(filho);
                }

            }


        }


        return nos;
    }
}

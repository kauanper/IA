import grafos.Estado;
import grafos.Transicao;

import java.util.*;

public class Aestrela {

    public List<No> execute(Estado inicial, Estado destino){
        List<No> caminho = new ArrayList<No>();
        No raiz = new No(inicial, null, null, 0);

        if(inicial.equals(destino)){
            caminho.add(raiz);
            return caminho;
        }

        PriorityQueue<No> borda = new PriorityQueue<>(
                Comparator.comparingInt(n -> n.cidadeAtual.Heuristica + n.custoAcumulado)
        );
        borda.add(raiz);
        List<Estado> explorado = new ArrayList<>();

        while(!borda.isEmpty()){
            No u = borda.poll();
            explorado.add(u.cidadeAtual);

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
                }else{
                    int funcFilho = filho.custoAcumulado + filho.cidadeAtual.Heuristica;
                    int funcNaBorda = naBorda.custoAcumulado + naBorda.cidadeAtual.Heuristica;
                    if(funcFilho < funcNaBorda){
                        borda.remove(naBorda);
                        borda.add(filho);
                    }
                }




            }

        }



        return caminho;
    }
}

import grafo.Estado;
import grafo.Transicao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class b2 {

    public static List<No> execute(Estado i, Estado f){
        List<No> lista = new ArrayList<No>();

        No raiz = new No(i, null, null, 0);
        if(raiz.cidadeAtual.equals(f)){
            lista.add(raiz);
            return lista;
        }

        Queue<No> q = new LinkedList<No>();
        q.add(raiz);
        List<Estado> explorados = new ArrayList<>();

        while(!q.isEmpty()){
            No n = q.poll();
            explorados.add(n.cidadeAtual);

            for(Transicao acao : n.cidadeAtual.transicoes){
                No filho = new No(acao.estado, n, acao, n.custoAcumulado + acao.custo);

                if(!explorados.contains(filho) && !q.contains(filho)){

                    if(filho.cidadeAtual.equals(f)){
                        while (filho.pai != null){
                            lista.add(filho);
                            filho = filho.pai;
                        }
                        lista.add(raiz);
                        return lista;
                    }
                    q.add(filho);
                }
            }

        }



        return lista;
    }
}

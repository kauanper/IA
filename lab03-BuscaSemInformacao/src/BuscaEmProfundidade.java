import grafo.Estado;
import grafo.Transicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuscaEmProfundidade {

    public List<No> execute(Estado inicio, Estado dest){
        List<No> caminho = new ArrayList<No>();
        No raiz = new No(inicio, null, null, 0);
        if(raiz.cidadeAtual.equals(dest)){
            caminho.add(raiz);
            return caminho;
        }

        Stack<No> borda = new Stack<>();
        borda.push(raiz);
        List<Estado> explorados = new ArrayList<>();

        while(!borda.isEmpty()){
            No u = borda.pop();
            explorados.add(u.cidadeAtual);

            for(Transicao acao : u.cidadeAtual.transicoes){
                No filho = new No(acao.estado, u, acao, u.custoAcumulado + acao.custo);
                if(!explorados.contains(filho.cidadeAtual)){
                    if(filho.cidadeAtual.equals(dest)){
                        while (filho.pai != null){
                            caminho.add(filho);
                            filho = filho.pai;
                        }
                        caminho.add(filho);
                        return caminho;
                    }
                    borda.push(filho);
                }
            }
        }






        return caminho;
    }
}

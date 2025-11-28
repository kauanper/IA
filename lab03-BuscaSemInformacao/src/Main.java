import grafo.Estado;
import grafo.Romenia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Romenia romenia = new Romenia();
        romenia.init(); // inicializar romenia

        BuscaEmLargura bfs = new BuscaEmLargura();
        BuscaUniforme uniform = new BuscaUniforme();
        TestAleatorio aleatorio = new TestAleatorio();

        Estado inicio = romenia.getEstado("Bucharest");
        Estado destino = romenia.getEstado("Arad");

        if(inicio != null && destino != null) {
            //---------------------------------------------------
            List<No> caminhos = bfs.execute(inicio, destino);

            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                    continue;
                }
                System.out.println(caminhos.get(i).cidadeAtual.nome);
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
        }

        if(inicio != null && destino != null) {
            //---------------------------------------------------
            List<No> caminhos = uniform.execute(inicio, destino);

            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                    continue;
                }
                System.out.println(caminhos.get(i).cidadeAtual.nome);
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
        }

    }
}

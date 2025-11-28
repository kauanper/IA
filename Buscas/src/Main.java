import grafo.Estado;
import grafo.Romenia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Romenia romenia = new Romenia();
        romenia.init(); // inicializar romenia

        BuscaEmLargura bfs = new BuscaEmLargura();
        BuscaUniforme uniform = new BuscaUniforme();
        BuscaEmProfundidade dfs = new BuscaEmProfundidade();
        BuscaGulosa gulosa = new BuscaGulosa();
        Aestrela a  = new Aestrela();

        Estado inicio = romenia.getEstado("Arad");
        Estado destino = romenia.getEstado("Bucharest");

        if(inicio != null && destino != null) {

            // ----------------------------- BFS -----------------------------
            long t0 = System.nanoTime();
            List<No> caminhos = bfs.execute(inicio, destino);
            long t1 = System.nanoTime();
            double tempoMs = (t1 - t0) / 1_000_000.0;

            System.out.print("\nBFS: ");
            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                } else {
                    System.out.println(caminhos.get(i).cidadeAtual.nome);
                }
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
            System.out.println("TEMPO: " + tempoMs + " ms");
        }


        if(inicio != null && destino != null) {

            // ----------------------------- UCS -----------------------------
            long t0 = System.nanoTime();
            List<No> caminhos = uniform.execute(inicio, destino);
            long t1 = System.nanoTime();
            double tempoMs = (t1 - t0) / 1_000_000.0;

            System.out.print("\nUCS: ");
            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                } else {
                    System.out.println(caminhos.get(i).cidadeAtual.nome);
                }
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
            System.out.println("TEMPO: " + tempoMs + " ms");
        }


        if(inicio != null && destino != null) {

            // ----------------------------- DFS -----------------------------
            long t0 = System.nanoTime();
            List<No> caminhos = dfs.execute(inicio, destino);
            long t1 = System.nanoTime();
            double tempoMs = (t1 - t0) / 1_000_000.0;

            System.out.print("\nDFS: ");
            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                } else {
                    System.out.println(caminhos.get(i).cidadeAtual.nome);
                }
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
            System.out.println("TEMPO: " + tempoMs + " ms");
        }


        if(inicio != null && destino != null) {

            // --------------------------- Gulosa ----------------------------
            long t0 = System.nanoTime();
            List<No> caminhos = gulosa.execute(inicio, destino);
            long t1 = System.nanoTime();
            double tempoMs = (t1 - t0) / 1_000_000.0;

            System.out.print("\nGul: ");
            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                } else {
                    System.out.println(caminhos.get(i).cidadeAtual.nome);
                }
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
            System.out.println("TEMPO: " + tempoMs + " ms");
        }


        if(inicio != null && destino != null) {

            // ----------------------------- A* ------------------------------
            long t0 = System.nanoTime();
            List<No> caminhos = a.execute(inicio, destino);
            long t1 = System.nanoTime();
            double tempoMs = (t1 - t0) / 1_000_000.0;

            System.out.print("\nA*: ");
            for(int i = caminhos.size() - 1; i >= 0; i--) {
                if(i != 0){
                    System.out.print(caminhos.get(i).cidadeAtual.nome + " -> ");
                } else {
                    System.out.println(caminhos.get(i).cidadeAtual.nome);
                }
            }
            System.out.println("CUSTO: " + caminhos.get(0).custoAcumulado);
            System.out.println("TEMPO: " + tempoMs + " ms");
        }

    }
}

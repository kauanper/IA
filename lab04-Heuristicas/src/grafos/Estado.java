package grafos;

import grafos.Transicao;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    public String nome;
    public int Heuristica;
    public List<Transicao> transicoes;


    public Estado(String nome, int Heuristica) {
        this.nome = nome;
        this.Heuristica = Heuristica;
        this.transicoes = new ArrayList<>();
    }
}

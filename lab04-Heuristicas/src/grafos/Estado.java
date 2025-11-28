package grafo;

import grafos.Transicao;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    public String nome;
    public List<Transicao> transicoes;

    public Estado(String nome) {
        this.nome = nome;
        this.transicoes = new ArrayList<>();
    }
}

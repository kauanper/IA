package grafos;

import java.util.ArrayList;
import java.util.List;

public class Romenia {
    List<grafo.Estado> estados = new ArrayList<>();

    public void init() {

        grafo.Estado arad = new grafo.Estado("Arad");
        grafo.Estado zerind = new grafo.Estado("Zerind");
        grafo.Estado oradea = new grafo.Estado("Oradea");
        grafo.Estado sibiu = new grafo.Estado("Sibiu");
        grafo.Estado timisoara = new grafo.Estado("Timisoara");
        grafo.Estado lugoj = new grafo.Estado("Lugoj");
        grafo.Estado mehadia = new grafo.Estado("Mehadia");
        grafo.Estado drobeta = new grafo.Estado("Drobeta");
        grafo.Estado craiova = new grafo.Estado("Craiova");
        grafo.Estado rimnicuVilcea = new grafo.Estado("Rimnicu Vilcea");
        grafo.Estado fagaras = new grafo.Estado("Fagaras");
        grafo.Estado pitesti = new grafo.Estado("Pitesti");
        grafo.Estado bucharest = new grafo.Estado("Bucharest");
        grafo.Estado giurgiu = new grafo.Estado("Giurgiu");
        grafo.Estado urziceni = new grafo.Estado("Urziceni");
        grafo.Estado hirsova = new grafo.Estado("Hirsova");
        grafo.Estado eforie = new grafo.Estado("Eforie");
        grafo.Estado vaslui = new grafo.Estado("Vaslui");
        grafo.Estado iasi = new grafo.Estado("Iasi");
        grafo.Estado neamt = new grafo.Estado("Neamt");

        estados.add(arad);
        estados.add(zerind);
        estados.add(oradea);
        estados.add(sibiu);
        estados.add(timisoara);
        estados.add(lugoj);
        estados.add(mehadia);
        estados.add(drobeta);
        estados.add(craiova);
        estados.add(rimnicuVilcea);
        estados.add(fagaras);
        estados.add(pitesti);
        estados.add(bucharest);
        estados.add(giurgiu);
        estados.add(urziceni);
        estados.add(hirsova);
        estados.add(eforie);
        estados.add(vaslui);
        estados.add(iasi);
        estados.add(neamt);

        Mapa mapa = new Mapa();
        mapa.estados = estados;

        // Arad
        arad.transicoes.add(new Transicao(zerind, 75));
        arad.transicoes.add(new Transicao(sibiu, 140));
        arad.transicoes.add(new Transicao(timisoara, 118));
        // Zerind
        zerind.transicoes.add(new Transicao(arad, 75));
        zerind.transicoes.add(new Transicao(oradea, 71));
        // Oradea
        oradea.transicoes.add(new Transicao(zerind, 71));
        oradea.transicoes.add(new Transicao(sibiu, 151));
        // Sibiu
        sibiu.transicoes.add(new Transicao(oradea, 151));
        sibiu.transicoes.add(new Transicao(arad, 140));
        sibiu.transicoes.add(new Transicao(fagaras, 99));
        sibiu.transicoes.add(new Transicao(rimnicuVilcea, 80));
        // Timisoara
        timisoara.transicoes.add(new Transicao(arad, 118));
        timisoara.transicoes.add(new Transicao(lugoj, 111));
        // Lugoj
        lugoj.transicoes.add(new Transicao(timisoara, 111));
        lugoj.transicoes.add(new Transicao(mehadia, 70));
        // Mehadia
        mehadia.transicoes.add(new Transicao(lugoj, 70));
        mehadia.transicoes.add(new Transicao(drobeta, 75));
        // Drobeta
        drobeta.transicoes.add(new Transicao(mehadia, 75));
        drobeta.transicoes.add(new Transicao(craiova, 120));
        // Craiova
        craiova.transicoes.add(new Transicao(drobeta, 120));
        craiova.transicoes.add(new Transicao(rimnicuVilcea, 146));
        craiova.transicoes.add(new Transicao(pitesti, 138));
        // Rimnicu Vilcea
        rimnicuVilcea.transicoes.add(new Transicao(sibiu, 80));
        rimnicuVilcea.transicoes.add(new Transicao(craiova, 146));
        rimnicuVilcea.transicoes.add(new Transicao(pitesti, 97));
        // Fagaras
        fagaras.transicoes.add(new Transicao(sibiu, 99));
        fagaras.transicoes.add(new Transicao(bucharest, 211));
        // Pitesti
        pitesti.transicoes.add(new Transicao(rimnicuVilcea, 97));
        pitesti.transicoes.add(new Transicao(craiova, 138));
        pitesti.transicoes.add(new Transicao(bucharest, 101));
        // Bucharest
        bucharest.transicoes.add(new Transicao(fagaras, 211));
        bucharest.transicoes.add(new Transicao(pitesti, 101));
        bucharest.transicoes.add(new Transicao(giurgiu, 90));
        bucharest.transicoes.add(new Transicao(urziceni, 85));
        // Giurgiu
        giurgiu.transicoes.add(new Transicao(bucharest, 90));
        // Urziceni
        urziceni.transicoes.add(new Transicao(bucharest, 85));
        urziceni.transicoes.add(new Transicao(hirsova, 98));
        urziceni.transicoes.add(new Transicao(vaslui, 142));
        // Hirsova
        hirsova.transicoes.add(new Transicao(urziceni, 98));
        hirsova.transicoes.add(new Transicao(eforie, 86));
        // Eforie
        eforie.transicoes.add(new Transicao(hirsova, 86));
        // Vaslui
        vaslui.transicoes.add(new Transicao(urziceni, 142));
        vaslui.transicoes.add(new Transicao(iasi, 92));
        // Iasi
        iasi.transicoes.add(new Transicao(vaslui, 92));
        iasi.transicoes.add(new Transicao(neamt, 87));
        // Neamt
        neamt.transicoes.add(new Transicao(iasi, 87));
    }

    public grafo.Estado getEstado(String termo) {
        for (grafo.Estado estado : estados) {
            if(estado.nome.equals(termo)) {
                return estado;
            }
        }
        return null;
    }
}

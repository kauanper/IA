package grafos;

import java.util.ArrayList;
import java.util.List;

public class Romenia {
    List<Estado> estados = new ArrayList<>();

    public void init() {

        Estado arad = new Estado("Arad", 366);
        Estado zerind = new Estado("Zerind", 374);
        Estado oradea = new Estado("Oradea", 380);
        Estado sibiu = new Estado("Sibiu", 253);
        Estado timisoara = new Estado("Timisoara", 329);
        Estado lugoj = new Estado("Lugoj", 244);
        Estado mehadia = new Estado("Mehadia", 241);
        Estado drobeta = new Estado("Drobeta", 242);
        Estado craiova = new Estado("Craiova", 160);
        Estado rimnicuVilcea = new Estado("Rimnicu Vilcea", 193);
        Estado fagaras = new Estado("Fagaras", 176);
        Estado pitesti = new Estado("Pitesti", 100);
        Estado bucharest = new Estado("Bucharest", 0);
        Estado giurgiu = new Estado("Giurgiu", 77);
        Estado urziceni = new Estado("Urziceni", 80);
        Estado hirsova = new Estado("Hirsova", 151);
        Estado eforie = new Estado("Eforie", 161);
        Estado vaslui = new Estado("Vaslui", 199);
        Estado iasi = new Estado("Iasi", 226);
        Estado neamt = new Estado("Neamt", 234);

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

    public Estado getEstado(String termo) {
        for (Estado estado : estados) {
            if (estado.nome.equals(termo)) {
                return estado;
            }
        }
        return null;
    }
}

package AgenteReativoSimples;

class World {
    Environment enviroment;
    Agent agent;

    World(Agent agent){
        this.enviroment = new Environment(true, false, 'A');
        this.agent = agent;
    }

    public void run(int steps) {
        System.out.println("\n " + "agente" + " \n");
        for (int step = 0; step < steps; step++) {
            System.out.println("Passo " + (step + 1));
            System.out.println(enviroment);

            Perception perception = agent.perceive(enviroment);
            System.out.println(perception);

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.printModel();
    }
}

package AgenteReativoSimples;

public class Environment {
    boolean isDirtyA;
    boolean isDirtyB;
    char location;

    public Environment(boolean A, boolean B, char location) {
        this.isDirtyA = A;
        this.isDirtyB = B;
        this.location = location;
    }

}

// Subklass Orm som ärver Djur och implementerar interfacet Äter
public class Ormen extends Djur implements Äter {

    // Konstruktor som ärver från super konstruktorn
    public Ormen(int vikt, String namn) {
        super(vikt, namn);
    }

    // Polymorfism av metoden som ligger i interfacet Äter
    @Override
    public double djurÄter() {
        return 20;
    }
}

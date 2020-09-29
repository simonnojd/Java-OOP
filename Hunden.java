// Subklass Hund som ärver Djur och implementerar interfacet Äter
public class Hunden extends Djur implements Äter {

    // Konstruktor som ärver från super konstruktorn
    public Hunden(int vikt, String namn) {
        super(vikt, namn);
    }

    // Polymorfism av metoden som ligger i interfacet Äter
    @Override
    public double djurÄter() {
        setGramMat(getVikt() * 1000 / 100);
        return getGramMat();
    }
}

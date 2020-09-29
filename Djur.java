// Super klassen Djur
public class Djur {

    // Deklarerar uppräkningstyp för alla olika sorters mat som kommer att användas
    enum Mat { hundfoder, kattfoder, ormpelleter }

    // Ange variabler till uppräkningsvärdena
    Mat hundfoder = Mat.hundfoder;
    Mat kattfoder = Mat.kattfoder;
    Mat ormpelleter = Mat.ormpelleter;

    // Deklaration och inkapsling av variabler som man sen kan nå via get metoder
    private int vikt;
    private String namn;
    private double gramMat;

    // Super konstruktor där man matar in vikt och namn
    public Djur(int vikt, String namn) {
        this.vikt = vikt;
        this.namn = namn;
    }

    // Default konstruktor
    public Djur() {}

    // Getters och Setters
    public int getVikt() {
        return vikt;
    }
    public String getNamn() { return namn; }
    public double getGramMat() {
        return gramMat;
    }
    public double setGramMat(double gramMat) {
        return this.gramMat = gramMat;
    }
}

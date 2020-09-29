import javax.swing.*;

public class HealthyPets {

    // Skapar object av alla olika klasser, med hjälp av super konstruktorn
    Hunden Sixten = new Hunden(5, "Sixten");
    Hunden Dogge = new Hunden(10, "Dogge");
    Katten Venus = new Katten(5, "Venus");
    Katten Ove = new Katten(3, "Ove");
    Ormen Hypno = new Ormen(1, "Hypno");

    HealthyPets() {
        // Dialogruta där du skriver vilket djur som ska matas
        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        // if statemeants som kollar vilket djur man skrev, sen skriver ut rätt information
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Du avslutade programmet.");
            System.exit(1);
        }
        if (input.equalsIgnoreCase(Sixten.getNamn())) {
            JOptionPane.showMessageDialog(null, "Hunden " + Sixten.getNamn() + " ska äta "
                    + Sixten.djurÄter() + " gram " + Sixten.hundfoder);
            System.exit(1);
        }
        else if (input.equalsIgnoreCase(Dogge.getNamn())) {
            JOptionPane.showMessageDialog(null, "Hunden " + Dogge.getNamn() + " ska äta "
                    + Dogge.djurÄter() + " gram " + Dogge.hundfoder);
            System.exit(1);
        }
        else if (input.equalsIgnoreCase(Venus.getNamn())) {
            JOptionPane.showMessageDialog(null, "Katten " + Venus.getNamn() + " ska äta "
                    + Venus.djurÄter() + " gram " + Venus.kattfoder);
            System.exit(1);
        }
        else if (input.equalsIgnoreCase(Ove.getNamn())) {
            JOptionPane.showMessageDialog(null, "Katten " + Ove.getNamn() + " ska äta "
                    + Ove.djurÄter() + " gram " + Ove.kattfoder);
            System.exit(1);
        }
        else if (input.equalsIgnoreCase(Hypno.getNamn())) {
            JOptionPane.showMessageDialog(null, "Ormen " + Hypno.getNamn() + " ska äta "
                    + Hypno.djurÄter() + " gram " + Hypno.ormpelleter);
            System.exit(1);
        }
        else {
            JOptionPane.showMessageDialog(null, "Det djuret finns inte. Skriv endast namnet på djuret.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        HealthyPets healthyPets = new HealthyPets();
    }
}

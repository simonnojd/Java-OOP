/**
 * Created by Simon Nöjd
 * Date: 2020-10-12
 * Time: 10:12
 * Project: 9a
 * Copyright: MIT
 */

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Gym {

    public Gym() {

        System.out.println("Skriv personnummret eller namnet på personen");

        // Declaring a scanner then assigning the next input into a string
        Scanner console = new Scanner(System.in);
        String person = console.next();

        // Declaring Strings for the first and second line
        String firstLine;
        String secondLine;

        // Declaring a boolean which will be used to see if the person input a correct name or ID
        boolean personExists = false;

        File file = new File("src\\customers.txt");
        // Try-with-recourses on Scanner
        try (Scanner scanner = new Scanner(file)) {
            // Using a while-loop to read all the lines in the file until it finds the user input
            while (scanner.hasNextLine()) {
                String lineFromFile = scanner.nextLine();
                // If it finds the person, then it assigns the date into a string. And their name and ID into another String
                if (lineFromFile.contains(person)) {
                    personExists = true;
                    firstLine = lineFromFile;
                    secondLine = scanner.nextLine();

                    // Checks if the date in the file is 1 year or less compared to the date now
                    if (LocalDate.parse(secondLine).isAfter(LocalDate.now().minusYears(1))) {
                        System.out.println(firstLine + " har ett aktivt medlemsskap, det betalades senast: " +
                                secondLine);
                        // Writes to a new file that that person has gone to the gym, and the date that it did
                        PrintWriter writer = new PrintWriter("src\\membership.txt");
                        writer.println(firstLine + " gick och gymmade: " + LocalDate.now());
                        writer.close();
                    }
                    // Checks if the year in the file is more than 1 year compared to the date now
                    else if (LocalDate.parse(secondLine).isBefore(LocalDate.now().minusYears(1))) {
                        System.out.println(firstLine + " är före detta medlem, men inte längre, det betalades senast: "
                                + secondLine);
                    }
                }
            }
            // Using the previous boolean to print out an error message if that person doesn't exist
            if (!personExists) {
                System.out.println("Den personen finns inte med i databasen");
            }
        }
        // Error message if something is wrong
        catch (Exception e) {
            System.out.println("Något gick fel");
        }
    }

    // Creating an instance of Gym
    public static void main(String[] args) {
        Gym gym = new Gym();
    }
}
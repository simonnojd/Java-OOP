import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import static org.junit.Assert.*;

/**
 * Created by Simon Nöjd
 * Date: 2020-10-14
 * Time: 14:44
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 */
public class GymTest {

    // Tests if a given date is more or less than 1 year ago
    @Test
    public void compareDatesTest() {
        assertTrue(LocalDate.parse("2020-10-12").isAfter(LocalDate.now().minusYears(1)));
        assertFalse(LocalDate.parse("2010-12-12").isAfter(LocalDate.now().minusYears(1)));

        assertTrue(LocalDate.parse("2010-12-12").isBefore(LocalDate.now().minusYears(1)));
        assertFalse(LocalDate.parse("2020-10-12").isBefore(LocalDate.now().minusYears(1)));
    }

    // Tests if searching for a name or ID in the file works
    @Test
    public void searchUserTest() throws FileNotFoundException {
        File file = new File("src\\customers.txt");
        Scanner scanner = new Scanner(file);
        String lineFromFile = scanner.nextLine();

        assertFalse(lineFromFile.contains("9911113059, Simon Nöjd"));
        assertTrue(lineFromFile.contains("Alhambra"));
        assertEquals(lineFromFile,("7603021234, Alhambra Aromes"));
    }

    // Tests if creating the new file works and also if it contains the correct information
    @Test
    public void createFileTest() throws FileNotFoundException {
        File file =  new File("src\\membership.txt");
        Scanner scanner = new Scanner(file);
        String lineFromFile = scanner.nextLine();

        assertTrue(file.exists());
        assertTrue(lineFromFile.contains("gick och gymmade:"));
    }
}
package View;

import StatCalculator.View.ConsoleSupport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ConsoleSupportTest {
    ByteArrayOutputStream outputStream;

    @Before
    public void setup() {
        outputStream = new ByteArrayOutputStream();
    }



    @Test
    public void correct_menu_options_displayed() {
        Object[] menuOptions = new Object[] {1, "2", "3"};
        ConsoleSupport consoleSupport = setupConsole("1" + System.lineSeparator());
        consoleSupport.getUserSelectionFromMenu(menuOptions);
        String expected = "1. " + menuOptions[0].toString() + System.lineSeparator() + "2. "  +
                menuOptions[1].toString() + System.lineSeparator() + "3. " + menuOptions[2].toString() + System.lineSeparator();

        Assert.assertEquals(expected, outputStream.toString());
    }

    @Test
    public void menu_selection_returns_correct_choice() {
        String expected = "two";
        String[] menuChoices = new String[]{"one", "two", "three", "four"};
        ConsoleSupport consoleSupport = setupConsole("2" + System.lineSeparator());
        String result = (String) consoleSupport.getUserSelectionFromMenu(menuChoices);
        Assert.assertEquals(expected, result);
    }


    @Test
    public void menu_redisplays_if_too_high() {

        String [] menuChoices = new String[] {"one", "two", "three"};
        ConsoleSupport consoleSupport = setupConsole("4" + System.lineSeparator() + "1" + System.lineSeparator());

        consoleSupport.getUserSelectionFromMenu(menuChoices);
        String displayMenu = "1. " + menuChoices[0].toString() + System.lineSeparator() + "2. "  +
                menuChoices[1].toString() + System.lineSeparator() + "3. " + menuChoices[2].toString() + System.lineSeparator();

        String expected = displayMenu + System.lineSeparator() +   "*** 4 is not a valid option ***" + System.lineSeparator() +
                System.lineSeparator() + displayMenu;
        Assert.assertEquals(expected, outputStream.toString());
    }

    @Test
    public void menu_redisplays_if_too_low() {
        String [] menuChoices = new String[] {"one", "two", "three"};
        ConsoleSupport consoleSupport = setupConsole("0" + System.lineSeparator() + "1" + System.lineSeparator());
        consoleSupport.getUserSelectionFromMenu(menuChoices);
        String displayMenu = "1. " + menuChoices[0].toString() + System.lineSeparator() + "2. "  +
                menuChoices[1].toString() + System.lineSeparator() + "3. " + menuChoices[2].toString() + System.lineSeparator();
        String expected = displayMenu + System.lineSeparator() +   "*** 0 is not a valid option ***" + System.lineSeparator() +
                System.lineSeparator() + displayMenu;
        Assert.assertEquals(expected, outputStream.toString());
    }

    @Test
    public void menu_redisplays_if_junk_input() {
        String [] menuChoices = new String[] {"one", "two", "three"};
        ConsoleSupport consoleSupport = setupConsole("Billy Bob" + System.lineSeparator() + "1" + System.lineSeparator());
        consoleSupport.getUserSelectionFromMenu(menuChoices);
        String displayMenu = "1. " + menuChoices[0].toString() + System.lineSeparator() + "2. "  +
                menuChoices[1].toString() + System.lineSeparator() + "3. " + menuChoices[2].toString() + System.lineSeparator();
        String expected = displayMenu + System.lineSeparator() +   "*** Billy Bob is not a valid option ***" + System.lineSeparator() +
                System.lineSeparator() + displayMenu;
        Assert.assertEquals(expected, outputStream.toString());
    }

    @Test
    public void mat_input_rejected_if_not_enough_points_left() {
        String userAmount = "101";
        String prompt = "Enter a material amount";
        ConsoleSupport consoleSupport = setupConsole(userAmount + System.lineSeparator() + "1" + System.lineSeparator());
        consoleSupport.getMatSelectionAsInteger(prompt, 100);
        String expected = prompt + ": " + System.lineSeparator() +
                "*** " + userAmount + " is not a valid option" + System.lineSeparator() +
                "you don't have enough material points left!" +
                System.lineSeparator() + prompt + ": ";
        Assert.assertEquals(expected, outputStream.toString());
    }

    @Test
    public void mag_input_rejected_if_not_enough_lvls_left() {
        String userAmount = "101";
        String prompt = "Input amount";
        ConsoleSupport consoleSupport = setupConsole(userAmount + System.lineSeparator() + "1" + System.lineSeparator());
        consoleSupport.getMagInputAsInteger(prompt, 100);
        String expected = prompt + ": " + System.lineSeparator() +
                "*** " + userAmount + " is not a valid option" + System.lineSeparator() +
                "you don't have enough levels left!" +
                System.lineSeparator() + prompt + ": ";
        Assert.assertEquals(expected, outputStream.toString());

    }

    public ConsoleSupport setupConsole(String input) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        return new ConsoleSupport(inputStream, outputStream);
    }
}

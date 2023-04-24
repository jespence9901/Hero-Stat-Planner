package StatCalculator.View;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleSupport {
    private PrintWriter output;
    private Scanner input;

    public ConsoleSupport(InputStream inputStream, OutputStream output) {
        this.output = new PrintWriter(output, true);
        this.input = new Scanner(inputStream);
    }

    public Object getUserSelectionFromMenu(Object[] selections) {
        Object selection = null;
        while (selection == null) {
            displaySelections(selections);
            selection = getChoiceFromUserOptions(selections);
        }
        return selection;
    }

    private void displaySelections(Object[] selections) {
        //output.println();
        for(int i = 0; i < selections.length; i++) {
            int selectionNum = i + 1;
            output.println(selectionNum + ". " + selections[i]);
            output.flush();
        }
    }
    public String getUserInputPrompt(String prompt) {
        output.println(prompt + ": ");
        output.flush();
        return  input.nextLine();
    }

    private Object getChoiceFromUserOptions(Object [] options) {
        Object choice = null;
        String userInput = input.nextLine();
        try {
            int selection = Integer.valueOf(userInput);
            if(selection > 0 && selection <= options.length) {
                choice = options[selection - 1];
            }
        } catch (NumberFormatException e) {

        }
        if(choice == null) {
            output.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
        }
        return choice;
    }

    public Integer getInputAsInteger(String prompt) {
        Integer response = null;
        do {
            output.print(prompt + ": ");
            output.flush();
            String userResponse = input.nextLine();
            try {
                response = Integer.parseInt(userResponse);
            } catch (NumberFormatException e) { //does this mean if input is not number is invalid???
                output.println(response + " is invalid input");
            }

        } while (response == null);
        return response;
    }

    public Integer getMagInputAsInteger(String prompt, int lvlsLeft) {
        Integer response = null;
        Integer choice = null;
        do {
            output.print(prompt + ": ");
            output.flush();
            String userResponse = input.nextLine();
            try {
                response = Integer.parseInt(userResponse);
                if (response >= 0 && response <= 200 && response <= lvlsLeft) {
                    choice = response;
                }
            } catch (NumberFormatException e) {
                output.println(response + " is invalid input");
            }
            if(choice == null) {
                output.println(System.lineSeparator() + "*** " + userResponse + " is not a valid option");
                output.println("you don't have enough levels left!");

            }

        } while (choice == null);

        return choice;
    }

    public Integer getMatSelectionAsInteger(String prompt, int matLvlsLeft) {
        Integer response = null;
        Integer choice = null;

        do {
            output.print(prompt + ": ");
            output.flush();
            String userResponse = input.nextLine();
            try {
                response = Integer.parseInt(userResponse);
                if (response <= matLvlsLeft) {
                    choice = response;
                }
            } catch (NumberFormatException e) {
                output.println(response + " is invalid");
            }
            if (choice == null) {
                output.println(System.lineSeparator() + "*** " + userResponse + " is not a valid option");
                output.println("you don't have enough material points left!");
            }
        } while (choice == null);

        return choice;
    }


}

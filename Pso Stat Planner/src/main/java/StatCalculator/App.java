package StatCalculator;

import StatCalculator.Model.*;
import StatCalculator.View.ConsoleSupport;


public class App {

    private ConsoleSupport consoleSupport;
    Hero hero;

    //menus and options

    private static final String OPTION_SELECT_HUcast = "HUcast";
    private static final String OPTION_SELECT_HUmar = "HUmar";
    private static final String OPTION_SELECT_RAmar = "RAmar";
    private static final String OPTION_SELECT_RAcast = "RAcast";
    private static final String OPTION_SELECT_FOmar = "FOmar";
    private static final String OPTION_SELECT_FOmarl = "FOmarl";
    private static final String OPTION_SELECT_Exit = "Exit";
    private static final String [] MAIN_MENU_SELECTIONS = {OPTION_SELECT_HUcast, OPTION_SELECT_HUmar, OPTION_SELECT_RAmar,
            OPTION_SELECT_RAcast, OPTION_SELECT_FOmar, OPTION_SELECT_FOmarl, OPTION_SELECT_Exit};

    private static final String SELECT_MATS = "Mats";
    private static final String SELECT_MAG = "Mag";
    private static final String SELECT_ARMOR = "Armor";
    private static final String SELECT_BARRIER = "Barrier";
    private static final String SELECT_UNITS = "Units";
    private static final String GO_BACK = "Go back";
    private static final String [] ITEMS_SELECT_MENU = {SELECT_MATS, SELECT_MAG, SELECT_ARMOR, SELECT_BARRIER, SELECT_UNITS, GO_BACK};

    private static final String POWER_MATS = "Power Materials";
    private static final String MIND_MATS = "Mind Materials";
    private static final String EVADE_MATS = "Evade Materials";
    private static final String DEFENSE_MATS = "Defense Materials";
    private static final String LUCK_MATS = "Luck Materials";
    private static final String RESET_MATS = "Reset Matertials";
    private static final String [] MATS_MENU_OPTIONS = {POWER_MATS, MIND_MATS, EVADE_MATS, DEFENSE_MATS, LUCK_MATS, RESET_MATS, GO_BACK};
    private int matsLeft;

    private static final String MAG_DEF = "DEF";
    private static final String MAG_POW = "POW";
    private static final String MAG_DEX = "DEX";
    private static final String MAG_MIND = "MIND";
    private static final String RESET_MAG = "Reset mag";
    private static final String [] MAG_MENU_OPTIONS = {MAG_DEF, MAG_POW, MAG_DEX, MAG_MIND, RESET_MAG, GO_BACK};

    private static final String UNIT_OPTION_1 = "Adept: +20 ATA, +10 all";
    private static final String UNIT_OPTION_2 = "Centurion/Arms +35 ATA";
    private static final String UNIT_OPTION_3 = "Centurion/Legs +60 EVP";
    private static final String UNIT_OPTION_4 = "V801: +5 MST";
    private static final String [] UNIT_MENU_OPTIONS = {UNIT_OPTION_1, UNIT_OPTION_2, UNIT_OPTION_3, UNIT_OPTION_4, GO_BACK};

    private static final String UNIT_SLOT_1 = "Unit Slot 1";
    private static final String UNIT_SLOT_2 = "Unit Slot 2";
    private static final String UNIT_SLOT_3 = "Unit Slot 3";
    private static final String UNIT_SLOT_4 = "Unit Slot 4";
    private static final String[] UNIT_SLOT_SELECT = {UNIT_SLOT_1, UNIT_SLOT_2, UNIT_SLOT_3, UNIT_SLOT_4};

    private static final UnitSlot ADEPT = new UnitSlot("Adept", 20, 10, 10, 10, 10, 10);
    private static final UnitSlot CENTURION_ARMS = new UnitSlot("Centurion/Arms", 35, 0, 0, 0, 0, 0);
    private static final UnitSlot CENTURION_LEGS = new UnitSlot("Centurion/Legs", 0, 0, 0, 60, 0, 0);
    private static final UnitSlot V801 = new UnitSlot("V801", 0, 0, 0, 0, 5, 0);

    private static final Frame SAMURAI_ARMOR = new Frame("Samurai Armor", 0, 0, 296, 277, 0, 50);
    private static final Frame NEUTRON_SKIN = new Frame("Neutron Skin", 0, 0, 350, 70, 250, 0);
    private static final String FRAME_SELECT_SAMURAI_ARMOR = "Samurai Armor: +50 Luck";
    private static final String FRAME_SELECT_NEUTRON_SKIN = "Neutron Skin: +250 Mind Strength";
    private static final String[] FRAME_MENU_OPTIONS = {FRAME_SELECT_SAMURAI_ARMOR, FRAME_SELECT_NEUTRON_SKIN, GO_BACK};

    private static final Barrier RED_RING = new Barrier("Red Ring", 215, 227, 20, 20, 20, 20);
    private static final String BARRIER_SELECT_RED_RING = "Red Ring +20 All stats";
    private static final String[] BARRIER_SELECT_MENU = {BARRIER_SELECT_RED_RING, GO_BACK};






    public static void main(String[] args) {
        ConsoleSupport consoleSupport = new ConsoleSupport(System.in, System.out);
        App app = new App(consoleSupport);
        app.run();
    }

    public void run() {

//        System.out.println(OPTION_SELECT_HUcast);
//        System.out.println(OPTION_SELECT_HUcaseal);
//        System.out.println(OPTION_SELECT_RAmar);
//        System.out.println(OPTION_SELECT_RAcast);
//        System.out.println(OPTION_SELECT_FOmar);
//        System.out.println(OPTION_SELECT_FOmarl);
//        System.out.println(OPTION_SELECT_Exit);
        mainMenu();

    }

    public App(ConsoleSupport consoleSupport) {
        this.consoleSupport = consoleSupport;
    }

    private void mainMenu() {
        System.out.println("************************");
        System.out.println("* Welcome to Max Stat! *");
        System.out.println("************************");
        System.out.println("Please select a character to Build:");

        while (true) {
            String selection = (String) consoleSupport.getUserSelectionFromMenu(MAIN_MENU_SELECTIONS);
            if (selection.equals(OPTION_SELECT_Exit)) {
                System.out.println("Closing application...");
                System.exit(1);
            }
            if (selection.equals(OPTION_SELECT_HUcast)) {
                hero = new HUcast();
            } else if(selection.equals(OPTION_SELECT_HUmar)) {
                hero = new HUmar();
            } else if(selection.equals(OPTION_SELECT_RAmar)) {
                hero = new RAmar();
            } else if(selection.equals(OPTION_SELECT_RAcast)) {
                hero = new RAcast();
            } else if(selection.equals(OPTION_SELECT_FOmar)) {
                hero = new FOmar();
            } else if (selection.equals(OPTION_SELECT_FOmarl)) {
                hero = new FOmarl();
            }
            itemSelectMenu();
        }

//        while(true) {
//
//           if (input.nextLine().equals("1")){
//               HUcast();
//
//           } else if(input.nextLine().equals("2")) {
//               HUcaseal();
//
//           } else if (input.nextLine().equals("3")) {
//               hero = new RAmar();
//               RAmar();
//
//           } else if (input.nextLine().equals("4")) {
//               RAcast();
//
//           } else if (input.nextLine().equals("5")) {
//               FOmar();
//
//           } else if (input.nextLine().equals("6")) {
//               FOmarl();
//
//           } else if (input.nextLine().equals("7")) {
//               System.exit(0);
//           }
//           else {
//               System.out.println("Sorry, invalid input");
//           }
//        }
    }

    public void itemSelectMenu() {
        hero.printStats();

        while (true) {
            String choice = (String) consoleSupport.getUserSelectionFromMenu(ITEMS_SELECT_MENU);
            if (choice.equals(GO_BACK)) {
                break;
            }
            if(choice.equals(SELECT_MATS)) {
                matSelect();
            } else if (choice.equals(SELECT_MAG)) {
                magBuild();
            } else if (choice.equals(SELECT_ARMOR)) {
                armorSelect();
            } else if (choice.equals(SELECT_BARRIER)) {
                barrierSelect();
            } else if (choice.equals(SELECT_UNITS)) {
                unitSelect();
            }
        }
    }

    public void HUcast() {
        ;

//        System.out.println("Please select a customization option: \n" +
//                "1. Mats\n" +
//                "2. Mag\n" +
//                "3. Armor\n" +
//                "4. Barrier\n" +
//                "5. Units");

//        while(true) {
//
//            if (input.nextLine().equals("1")){
//                matSelect();
//                    }
//             else if(input.nextLine().equals("2")) {
//                magBuild();
//
//            } else if (input.nextLine().equals("3")) {
//                 armorSelect();
//
//            } else if (input.nextLine().equals("4")) {
//                 barrierSelect();
//
//            } else if (input.nextLine().equals("5")) {
//                 unitSelect();
//            } else {
//                System.out.println("Sorry, invalid input!");
//            }
//        }
    }
    private void HUcaseal() {

    }
    private void RAmar() {

    }
    private void RAcast() {

    }
    private void FOmar() {

    }
    private void FOmarl() {

    }

    private void matSelect() {
//        Scanner input = new Scanner(System.in);
//        boolean keepLoop = true;
//        System.out.println("Select Materials:\n" +
//                "1. Power Materials \n" +
//                "2. Mind Materials \n" +
//                "3. Evade Materials \n" +
//                "4. Defense Materials \n" +
//                "5. Luck Materials \n" +
//                "6. Go Back");
//        int selection = input.nextInt();

        while (true){
            System.out.println("Mats Left: " + matsLeft);
            hero.printStats();
            String selection = (String) consoleSupport.getUserSelectionFromMenu(MATS_MENU_OPTIONS);
            if(selection.equals(GO_BACK)) {
                hero.printStats();
                break;
            }
            int matAmount = consoleSupport.getMatSelectionAsInteger("Enter a material amount", matsLeft);
            if (selection.equals(POWER_MATS)) {
                matsLeft -= matAmount;
                hero.setPwrMats(matAmount);
            }

            else if (selection.equals(MIND_MATS)) {
                matsLeft -= matAmount;
                hero.setMndMats(matAmount);
            }
            else if (selection.equals(EVADE_MATS)) {
                matsLeft -= matAmount;
                hero.setEvdMats(matAmount);
            }
            else if (selection.equals(DEFENSE_MATS)) {
                matsLeft -= matAmount;
                hero.setDefMats(matAmount);
            }
            else if (selection.equals(LUCK_MATS)) {
                matsLeft -= matAmount;
                hero.setLckMats(matAmount);
            }
            else if (selection.equals(RESET_MATS)) {
                hero.resetMaterials();
            }

//            switch (selection) {
//                case POWER_MATS:
//                    if (matsLeft - matAmount >= 0) {
//                        matsLeft -= matAmount;
//                        pwrMats += matAmount;
//                        System.out.println(matsLeft);
//                        if (huCast.getCurrentATP() + pwrMats * 2 <= huCast.getMaxATP()) {
//                            huCast.setPwrMats(matAmount);
//                            huCast.printStats();
//                        }
//
//
//                    } else {
//                        System.out.println("you don't have enough room left!");
//                    }
//                    break;
//                case MIND_MATS:
//                    if (matsLeft - matAmount >= 0) {
//                        matsLeft -= matAmount;
//                        mstMats += matAmount;
//                    } else {
//                        System.out.println("you don't have enough room left!");
//                    }
//                    break;
//                case EVADE_MATS:
//                    if (matsLeft - matAmount >= 0) {
//                        matsLeft -= matAmount;
//                        evpMats += matAmount;
//                        System.out.println(matsLeft);
//                        if (huCast.getCurrentEVP() + evpMats * 2 <= huCast.getMaxEVP()) {
//                            huCast.setEvdMats(matAmount);
//                            System.out.println("current Evade power: " + huCast.getCurrentEVP());
//                        }
//                        huCast.printStats();
//                    } else {
//                        System.out.println("you don't have enough room left!");
//                    }
//                    break;
//                case DEFENSE_MATS:
//                    if (matsLeft - matAmount >= 0) {
//                        matsLeft -= matAmount;
//                        dfpMats += matAmount;
//                        if (huCast.getCurrentDFP() + dfpMats * 2 <= huCast.getMaxDFP()) {
//                            huCast.setDefMats(matAmount);
//                            System.out.println("current Defense power: " + huCast.getCurrentDFP());
//                        }
//                        huCast.printStats();
//                    } else {
//                        System.out.println("you don't have enough room left!");
//                    }
//                    break;
//                case LUCK_MATS:
//                    if (matsLeft - matAmount >= 0) {
//                        matsLeft -= matAmount;
//                        lckMats += matAmount;
//                        if (huCast.getCurrentLCK() + lckMats * 2 <= huCast.getMaxLCK()) {
//                            huCast.setLckMats(matAmount);
//                            System.out.println("current Luck: " + huCast.getCurrentLCK());
//                        }
//                        huCast.printStats();
//                    } else {
//                        System.out.println("you don't have enough room left!");
//                    }
//                    break;
//
//                case GO_BACK:
//                    huCast.printStats();
//                    break;

            }


//        while (keepLoop) {
//            if (selection.equals("1")) {
//
//                // int matAmount = Integer.parseInt(selection);
//
//            } else if (selection.equals("2")) {
//                System.out.println("Input amount");
//                int matAmount = Integer.parseInt(selection);
//                matsLeft -= matAmount;
//                mstMats += matAmount;
//            } else if (selection.equals("3")) {
//                System.out.println("Input amount");
//                int matAmount = Integer.parseInt(selection);
//                matsLeft -= matAmount;
//                evpMats += matAmount;
//            } else if (selection.equals("4")) {
//                System.out.println("Input amount");
//                int matAmount = Integer.parseInt(selection);
//                matsLeft -= matAmount;
//                dfpMats += matAmount;
//            } else if (selection.equals("5")) {
//                System.out.println("Input amount");
//                int matAmount = Integer.parseInt(selection);
//                matsLeft -= matAmount;
//                lckMats += matAmount;
//            } else if (selection.equals("6")) {
//                keepLoop = false;
//            }
//
//
//        }


    }
    private void magBuild() {


        int magAmount = 0;
//        boolean keepLoop = true;
//        System.out.println("Select Mag Stats:\n" +
//                "1. DEF \n" +
//                "2. POW \n" +
//                "3. DEX \n" +
//                "4. MIND \n" +
//                "5. Exit");
        while (true) {
            String selection = (String) consoleSupport.getUserSelectionFromMenu(MAG_MENU_OPTIONS);

            if (!selection.equals(GO_BACK) && !selection.equals(RESET_MAG)) {
                magAmount = consoleSupport.getMagInputAsInteger("Input amount", hero.getMagLvlsLeft());
            }

            if (selection.equals(MAG_DEF)) {
                hero.setMagDef(magAmount);
                hero.setMagLvlsLeft(hero.getMagLvlsLeft() - magAmount);

            }
            else if (selection.equals(MAG_POW)) {
                hero.setMagPow(magAmount);
                hero.setMagLvlsLeft(hero.getMagLvlsLeft() - magAmount);
            }
            else if (selection.equals(MAG_DEX)) {
                hero.setMagDex(magAmount);
                hero.setMagLvlsLeft(hero.getMagLvlsLeft() - magAmount);
            }
            else if (selection.equals(MAG_MIND)) {
                hero.setMagMind(magAmount);
                hero.setMagLvlsLeft(hero.getMagLvlsLeft() - magAmount);
            }

            else if (selection.equals(RESET_MAG)) {
                hero.resetMagStats();
                hero.printMagStats();
                magAmount = 0;
            }
            else if(selection.equals(GO_BACK)) {
                hero.printStats();
                break;
            }



            System.out.println("Mag Levels left: "  + hero.getMagLvlsLeft());
            hero.printMagStats();
        }









//        while (keepLoop) {
//            if (selection.equals("1")) {
//                System.out.println("Input amount");
//                int magSelect = Integer.parseInt(selection);
//                magLvlsLeft -= magSelect;
//                magDef += magSelect;
//                magDef += magSelect;
//            } else if (selection.equals("2")) {
//                System.out.println("Input amount");
//                int magSelect = Integer.parseInt(selection);
//                magLvlsLeft -= magSelect;
//                magPow += magSelect;
//            } else if (selection.equals("3")) {
//                System.out.println("Input amount");
//                int magSelect = Integer.parseInt(selection);
//                magLvlsLeft -= magSelect;
//                magDex += magSelect;
//            } else if (selection.equals("4")) {
//                System.out.println("Input amount");
//                int magSelect = Integer.parseInt(selection);
//                magLvlsLeft -= magSelect;
//                magMind += magSelect;
//            }
//            else if (selection.equals("5")) {
//                keepLoop = false;
//            }
//        }

    }
    private void armorSelect() {
        boolean keepLoop = true;
       hero.printFrameStats();

        String selection;
        while (keepLoop) {
            selection = (String)consoleSupport.getUserSelectionFromMenu(FRAME_MENU_OPTIONS);

            if (selection.equals(GO_BACK)){
                keepLoop = false;
            }
            if (selection.equals(FRAME_SELECT_SAMURAI_ARMOR)) {
                hero.setFrame(SAMURAI_ARMOR);
            } else if (selection.equals(FRAME_SELECT_NEUTRON_SKIN)) {
                hero.setFrame(NEUTRON_SKIN);

            }
            hero.printFrameStats();
        }

    }
    private void barrierSelect() {
        while (true) {
            String selection = (String) consoleSupport.getUserSelectionFromMenu(BARRIER_SELECT_MENU);
            if (selection.equals(GO_BACK)) {
                break;
            }
            if(selection.equals(BARRIER_SELECT_RED_RING)) {
                hero.setBarrier(RED_RING);
                hero.printBarrierStats();
            }

        }

//        System.out.println("Current Barrier: " + currentBarrier);
//        System.out.println("Select a Barrier:\n" +
//                "1. Red Ring: +20 ALL, +20 ATA\n" +
//                "2. Exit");
//        if (selection.equals("1")) {
//            currentBarrier = "Red Ring";
//        }

    }
    private void unitSelect () {
//        "Adept: +20 ATA, +10 all";
//        "Centurion/Arms +35 ATA";
//        "Centurion/Legs +60 EVP";
//        "V801: +5 MST";
       // boolean keepLoop = true;

        String unitSlot;
        UnitSlot selectedUnit = new UnitSlot();

        while (true) {
            String selection = (String) consoleSupport.getUserSelectionFromMenu(UNIT_MENU_OPTIONS);

            if (selection.equals(GO_BACK)) {
                hero.printStats();
                break;
            }

            unitSlot = (String) consoleSupport.getUserSelectionFromMenu(UNIT_SLOT_SELECT);



            if (selection.equals(UNIT_OPTION_1)) {
                selectedUnit = ADEPT;
            }
            else if (selection.equals(UNIT_OPTION_2)) {
                selectedUnit = CENTURION_ARMS;
            }
            else if(selection.equals(UNIT_OPTION_3)) {
                selectedUnit = CENTURION_LEGS;
            }
            else if(selection.equals(UNIT_OPTION_4)) {
                selectedUnit = V801;
            }


            if (unitSlot.equals(UNIT_SLOT_1)) {
                hero.setUnit1(selectedUnit);
            }
            else if(unitSlot.equals(UNIT_SLOT_2)) {
                hero.setUnit2(selectedUnit);
            }
            else if (unitSlot.equals(UNIT_SLOT_3)) {
                hero.setUnit3(selectedUnit);
            }
            else if (unitSlot.equals(UNIT_SLOT_4)) {
                hero.setUnit4(selectedUnit);
            }

            hero.printUnits();
            hero.printStats();

        }













//        boolean keepLoop = true;
//        System.out.println("Unit Slot 1: " + unit1 + "|| Unit Slot 2: " + unit2 +
//                "|| Unit Slot 3: " + "Unit Slot 4: " + unit4);
//        while(keepLoop){
//            if (selection.equals("1")){
//                System.out.println("Select Unit Slot: 1/2/3/4");
//                if(selection.equals("1")){
//                    unit1 = "Adept";
//                } else if(selection.equals("2")){
//                    unit2 = "Adept";
//                } else if(selection.equals("3")){
//                    unit3 = "Adept";
//                } else if (selection.equals("4")){
//                    unit4 = "Adept";
//                }
//                else{
//                    System.out.println("Sorry, wrong input!");
//                }
//            } else if(selection.equals("2")){
//                System.out.println("Select Unit Slot: 1/2/3/4");
//                if(selection.equals("1")){
//                    unit1 = "Centurion/Arms";
//                } else if(selection.equals("2")){
//                    unit2 = "Centurion/Arms";
//                } else if(selection.equals("3")){
//                    unit3 = "Centurion/Arms";
//                } else if (selection.equals("4")){
//                    unit4 = "Centurion/Arms";
//                }
//                else{
//                    System.out.println("Sorry, wrong input!");
//                }
//            } else if (selection.equals("3")){
//                if(selection.equals("1")){
//                    unit1 = "Centurion/Legs";
//                } else if(selection.equals("2")){
//                    unit2 = "Centurion/Legs";
//                } else if(selection.equals("3")){
//                    unit3 = "Centurion/Legs";
//                } else if (selection.equals("4")){
//                    unit4 = "Centurion/Legs";
//                }
//                else{
//                    System.out.println("Sorry, wrong input!");
//                }
//            } else if (selection.equals("4")){
//                if(selection.equals("1")){
//                    unit1 = "V801";
//                } else if(selection.equals("2")){
//                    unit2 = "V801";
//                } else if(selection.equals("3")){
//                    unit3 = "V801";
//                } else if (selection.equals("4")){
//                    unit4 = "V801";
//                }
//                else{
//                    System.out.println("Sorry, wrong input!");
//                }
//            } else if (selection.equals("5")){
//                keepLoop = false;
//            }
//        }




    }
}


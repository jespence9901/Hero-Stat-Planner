package Model;

import StatCalculator.Model.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HeroTest {

    Hero hero;
    private static final UnitSlot ADEPT = new UnitSlot("Adept", 20, 10, 10, 10, 10, 10);
    private static final UnitSlot CENTURION_ARMS = new UnitSlot("Centurion/Arms", 35, 0, 0, 0, 0, 0);
    private static final UnitSlot CENTURION_LEGS = new UnitSlot("Centurion/Legs", 0, 0, 0, 60, 0, 0);
    private static final UnitSlot V801 = new UnitSlot("V801", 0, 0, 0, 0, 5, 0);
    private static final Frame SAMURAI_ARMOR = new Frame("Samurai Armor", 0, 0, 296, 277, 0, 50);





    @Test
    public void getCurrentATP_returns_correct_value() {
        //setup
        hero = new HUcast();
        hero.setUnit1(ADEPT);
        hero.setPwrMats(115);
        hero.setMagPow(185);

        int expected = hero.getMAX_ATP();

        //doesn't go over max
        Assert.assertEquals(hero.getCurrentATP(), expected);

        hero.setMagPow(115);

        //under max
        int underMaxExpected = 1616;

        Assert.assertEquals(underMaxExpected, hero.getCurrentATP());
    }

    @Test
    public void getCurrentEVP_returns_correct_value() {
        //setup
        hero = new RAmar();
        hero.setUnit1(ADEPT);
        hero.setUnit2(CENTURION_LEGS);
        hero.setEvdMats(10);

        //under max
        int expected = 729;
        Assert.assertEquals(expected, hero.getCurrentEVP());

        //doesn't go over max
        hero.setEvdMats(100);
        int maxExpected = 745;
        Assert.assertEquals(maxExpected, hero.getMAX_EVP());
    }

    @Test
    public void getCurrentDFP_returns_correct_value() {
        hero = new FOmar();
        hero.setUnit1(ADEPT);
        hero.setDefMats(10);
        hero.setMagDef(10);

        //under max
        int expected = 361;
        Assert.assertEquals(expected, hero.getCurrentDFP());

        //doesn't go over max
        hero.setDefMats(100);
        hero.setMagDef(100);
        Assert.assertEquals(hero.getMAX_DFP(), hero.getCurrentDFP());

    }

    @Test
    public void getCurrentATA_returns_correct_value() {
        hero = new HUcast();


        hero.setUnit1(CENTURION_ARMS);
        //under max
        hero.setMagDex(12);
        int expected = 200;
        Assert.assertEquals(expected, hero.getCurrentATA());

        //doesn't go over max
        hero.setUnit2(ADEPT);
        hero.setMagDex(15);
        Assert.assertEquals(hero.getMAX_ATA(), hero.getCurrentATA());

    }

    @Test
    public void getCurrentMST_returns_correct_values() {
        //magic user test
        hero = new FOmarl();
        hero.setUnit1(ADEPT);
        hero.setMndMats(100);
        hero.setMagMind(100);
        int expected = 1344;
        Assert.assertEquals(expected, hero.getCurrentMST());

        //doesn't go over max

        hero.setUnit2(V801);
        hero.setMndMats(200);
        hero.setMagMind(200);
        Assert.assertEquals(hero.getMAX_MST(), hero.getCurrentMST());

        //returns 0 for HUcast

        hero = new HUcast();

        hero.setUnit1(ADEPT);
        hero.setMndMats(100);
        hero.setMagMind(100);
        Assert.assertEquals(hero.getMAX_MST(), hero.getCurrentMST());

        //returns 0 for RAcast

        hero = new RAcast();

        hero.setUnit1(ADEPT);
        hero.setUnit2(V801);
        hero.setMndMats(100);
        hero.setMagMind(100);
        Assert.assertEquals(hero.getMAX_MST(), hero.getCurrentMST());
    }

    @Test
    public void getCurrentLCK_returns_correct_values() {
        hero = new RAcast();

        hero.setUnit1(ADEPT);
        //under max
        int expected = 90;
        hero.setLckMats(35);
        Assert.assertEquals(90, hero.getCurrentLCK());
        hero.setFrame(SAMURAI_ARMOR);
        hero.setLckMats(45);
        //doesn't go over max

        Assert.assertEquals(hero.getMaxLCK(), hero.getCurrentLCK());
    }

    @Test
    public void printStats_prints_correct_stats() {
        hero = new HUcast();
        hero.setUnit1(ADEPT);
        hero.setPwrMats(5);
        hero.setDefMats(5);
        hero.setEvdMats(5);
        hero.setLckMats(5);
        hero.setMagDef(5);
        hero.setMagPow(5);
        hero.setMagMind(5);
        hero.setMagDex(10);

    }

    @Test
    public void resetMagStats_resets_to_0() {
        hero = new HUcast();
        hero.setMagDef(5);
        hero.setMagPow(5);
        hero.setMagDex(5);
        hero.setMagMind(5);
        hero.resetMagStats();;

        Assert.assertEquals(0, hero.getMagDef());
        Assert.assertEquals(0, hero.getMagPow());
        Assert.assertEquals(0, hero.getMagDex());
        Assert.assertEquals(0, hero.getMagMind());
    }

    @Test
    public void resetMaterials_resets_to_0() {
        hero = new RAcast();
        hero.setPwrMats(5);
        hero.setMndMats(5);
        hero.setEvdMats(5);
        hero.setDefMats(5);
        hero.setLckMats(5);
        hero.resetMaterials();

        Assert.assertEquals(0, hero.getPwrMats());
        Assert.assertEquals(0, hero.getMndMats());
        Assert.assertEquals(0, hero.getEvdMats());
        Assert.assertEquals(0, hero.getDefMats());
        Assert.assertEquals(0, hero.getLckMats());
    }







}

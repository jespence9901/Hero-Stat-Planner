package StatCalculator.Model;

public class Hero {

    protected int baseATP;
    protected int baseMST;
    protected int baseEVP;
    protected int baseDFP;

    protected int baseATA;

    protected int baseLCK;
    protected int maxATP;

    protected int maxMST;
    protected int maxEVP;
    protected int maxDFP;
    protected int maxATA;
    protected int maxLCK;

    //Mats
    protected int matsMax;

    protected int matsLeft;
    protected int pwrMats = 0;
    protected int defMats = 0;
    protected int evdMats = 0;
    protected int mndMats = 0;
    protected int lckMats = 0;
    protected static final int ANDROID_MAX_MATS = 150;

    protected static final int HUMAN_MAX_MATS = 250;

    //Mags
    protected int magDef = 0;

    protected int magPow = 0;
    protected int magDex = 0;
    protected int magMind = 0;
    protected int magLvlsLeft = 200;
    //Frame

    Frame frame = new Frame();
    Barrier barrier = new Barrier();
    //Units

    protected UnitSlot unit1 = new UnitSlot();
    protected UnitSlot unit2 = new UnitSlot();

    protected UnitSlot unit3  = new UnitSlot();
    protected UnitSlot unit4 = new UnitSlot();
    public int getMatsMax() {
        return matsMax;
    }

    public void setMatsMax(int matsMax) {
        this.matsMax = matsMax;
    }

    public int getPwrMats() {
        return pwrMats;
    }

    public void setPwrMats(int pwrMats) {
        this.pwrMats = pwrMats;
    }

    public int getDefMats() {
        return defMats;
    }

    public void setDefMats(int defMats) {
        this.defMats = defMats;
    }

    public int getEvdMats() {
        return evdMats;
    }

    public void setEvdMats(int evdMats) {
        this.evdMats = evdMats;
    }

    public int getMndMats() {
        return mndMats;
    }

    public void setMndMats(int mndMats) {
        this.mndMats = mndMats;
    }

    public int getLckMats() {
        return lckMats;
    }

    public void setLckMats(int lckMats) {
        this.lckMats = lckMats;
    }

    public int getMagDef() {
        return magDef;
    }

    public void setMagDef(int magDef) {
        this.magDef = magDef;
    }

    public int getMagPow() {
        return magPow;
    }

    public void setMagPow(int magPow) {
        this.magPow = magPow;
    }

    public int getMagDex() {
        return magDex;
    }

    public void setMagDex(int magDex) {
        this.magDex = magDex;
    }

    public int getMagMind() {
        return magMind;
    }

    public void setMagMind(int magMind) {
        this.magMind = magMind;
    }

    public int getMagLvlsLeft() {
        return magLvlsLeft;
    }

    public void setMagLvlsLeft(int magLvlsLeft) {
        this.magLvlsLeft = magLvlsLeft;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Barrier getBarrier() {
        return barrier;
    }

    public void setBarrier(Barrier barrier) {
        this.barrier = barrier;
    }

    public UnitSlot getUnit1() {
        return unit1;
    }

    public void setUnit1(UnitSlot unit1) {
        this.unit1 = unit1;
    }

    public UnitSlot getUnit2() {
        return unit2;
    }

    public void setUnit2(UnitSlot unit2) {
        this.unit2 = unit2;
    }

    public UnitSlot getUnit3() {
        return unit3;
    }

    public void setUnit3(UnitSlot unit3) {
        this.unit3 = unit3;
    }

    public UnitSlot getUnit4() {
        return unit4;
    }

    public void setUnit4(UnitSlot unit4) {
        this.unit4 = unit4;
    }

    public int getMatsLeft() {
        return matsLeft;
    }

    public void setMatsLeft(int matsLeft) {
        this.matsLeft = matsLeft;
    }

    public int getBASE_ATP() {
        return baseATP;
    }

    public void setBaseATP(int baseATP) {
        this.baseATP = baseATP;
    }

    public int getBASE_MST() {
        return baseMST;
    }

    public void setBaseMST(int baseMST) {
        this.baseMST = baseMST;
    }

    public int getBASE_EVP() {
        return baseEVP;
    }

    public void setBaseEVP(int baseEVP) {
        this.baseEVP = baseEVP;
    }

    public int getBASE_DFP() {
        return baseDFP;
    }

    public void setBaseDFP(int baseDFP) {
        this.baseDFP = baseDFP;
    }

    public int getBASE_ATA() {
        return baseATA;
    }

    public void setBaseATA(int baseATA) {
        this.baseATA = baseATA;
    }

    public int getBASE_LCK() {
        return baseLCK;
    }

    public void setBaseLCK(int baseLCK) {
        this.baseLCK = baseLCK;
    }

    public int getCurrentATP() {
        int calc = baseATP +
                //units
                unit1.getATP() + unit2.getATP() + unit3.getATP() + unit4.getATP() +
                //mats
                pwrMats * 2 +
                //mag stats
                magPow * 2;

        if (calc > maxATP) {
            return maxATP;
        }
        return calc;
    }

    public int getCurrentMST() {
        int calc = baseMST +
                //units
                unit1.getMST() + unit2.getMST() + unit3.getMST() + unit4.getMST() +
                //mats
                mndMats * 2 +
                //mag stats
                magMind * 2;

        if (calc > maxMST) {
            return maxMST;
        }
        return calc;
    }

    public int getCurrentEVP() {
        int calc = baseEVP +
                //units
                unit1.getEVP() + unit2.getEVP() + unit3.getEVP() + unit4.getEVP() +
                //mats
                evdMats * 2;
        if (calc > maxEVP) {
            return maxEVP;
        }
        return calc;
    }

    public int getCurrentDFP() {
        int calc = baseDFP +
                //units
                unit1.getDFP() + unit2.getDFP() + unit3.getDFP() + unit4.getDFP() +
                //mats
                defMats * 2 +
                //mag stats
                magDef;

        if (calc > maxDFP) {
            return maxDFP;
        }
        return calc;
    }

    public int getCurrentATA() {
        int calc = baseATA +
                //units
                unit1.getATA() + unit2.getATA() + unit3.getATA() + unit4.getATA() +
                //mag stats
                magDex / 2;

        if (calc > maxATA) {
            return maxATA;
        }
        return calc;
    }


    public int getCurrentLCK() {
        int calc = baseLCK+
                //units
                unit1.getLCK() + unit2.getLCK() + unit3.getLCK() + unit4.getLCK() +
                //mats
                lckMats * 2;
        if (calc > maxLCK) {
            return maxLCK;
        }
        return calc;
    }


    public int getMAX_ATP() {
        return maxATP;
    }

    public void setMaxATP(int maxATP) {
        this.maxATP = maxATP;
    }

    public int getMAX_MST() {
        return maxMST;
    }

    public void setMaxMST(int maxMST) {
        this.maxMST = maxMST;
    }

    public int getMAX_EVP() {
        return maxEVP;
    }

    public void setMaxEVP(int maxEVP) {
        this.maxEVP = maxEVP;
    }

    public int getMAX_DFP() {
        return maxDFP;
    }

    public void setMaxDFP(int maxDFP) {
        this.maxDFP = maxDFP;
    }

    public int getMAX_ATA() {
        return maxATA;
    }

    public void setMaxATA(int maxATA) {
        this.maxATA = maxATA;
    }

    public int getMaxLCK() {
        return maxLCK;
    }

    public void setMaxLCK(int maxLCK) {
        this.maxLCK = maxLCK;
    }

    public void printStats(){
        System.out.println("Current || Max");
        System.out.println("ATP: "  + getCurrentATP() + "||" + maxATP);
        System.out.println("MST: " + getCurrentMST() + "||" + maxMST);
        System.out.println("EVP: " + getCurrentEVP() + "||" + maxEVP);
        System.out.println("DFP: " + getCurrentDFP() + "||" + maxDFP);
        System.out.println("ATA: "  + getCurrentATA() + "||" + maxATA);
        System.out.println("LCK: " + getCurrentLCK() + "||" + maxLCK);

    }

    public void printMagStats() {
        System.out.println("DEF: " + magDef + " POW: " + magPow + " DEX: " + magDex + " MIND: " + magMind);
    }

    public void printFrameStats() {
        boolean bonusStats = frame.getATA() != 0 || frame.getMST() != 0 ||
                frame.getLCK() != 0 || frame.getATP() != 0;
        System.out.println("Frame: " +
                frame.getName() +
        "\nStats: " +
                "\nDefense: " + frame.getDFP() +
                "\nEvade: " + frame.getEVP());
        if (bonusStats) {
            System.out.println("Bonus Stats: ");
        }
        if (frame.getMST() != 0) {
            System.out.println("Mind Strength: +" + frame.getMST());
        }
        if (frame.getLCK() != 0 ) {
            System.out.println("Luck: +" + frame.getLCK());
        }
    }

    public void printBarrierStats() {
        boolean bonusStats = barrier.getATA() != 0 || barrier.getMST() != 0 ||
                barrier.getLCK() != 0 || barrier.getATP() != 0;
        System.out.println("Barrier: " +
                barrier.getName() +
                "\nStats: " +
                "\nDefense: " + barrier.getDFP() +
                "\nEvade: " + barrier.getEVP());
        if (bonusStats) {
            System.out.println("Bonus Stats: ");
        }
        if (barrier.getATP() != 0) {
            System.out.println("Attack Power: +" + barrier.getATP());
        }
        if (barrier.getMST() != 0) {
            System.out.println("Mind Strength: +" + barrier.getMST());
        }
        if (barrier.getLCK() != 0 ) {
            System.out.println("Luck: +" + barrier.getLCK());
        }

    }

    public void printUnits() {
        System.out.println(
                "Unit 1: " + unit1.getName() +
                        "\nUnit 2: " + unit2.getName() +
                        "\nUnit 3: " + unit3.getName() +
                        "\nUnit 4: " + unit4.getName()
        );
    }

    public void resetMagStats() {
        setMagDef(0);
        setMagPow(0);
        setMagDex(0);
        setMagMind(0);
        setMagLvlsLeft(200);
    }

    public void resetMaterials() {
        setPwrMats(0);
        setMndMats(0);
        setEvdMats(0);
        setDefMats(0);
        setLckMats(0);
        matsLeft = matsMax;
    }
}

package StatCalculator.Model;

public class HUcast extends Hero {
    private final int BASE_ATP = 1146;
    private final int BASE_MST = 0;
    private final int BASE_EVP = 585;
    private final int BASE_DFP = 501;
    private final int BASE_ATA = 159;
    private final int BASE_LCK = 10;

    private final int MAX_ATP = 1739;
    private final int MAX_MST = 0;
    private final int MAX_EVP = 701;
    private final int MAX_DFP = 701;
    private final int MAX_LCK = 100;
    private final int MAX_ATA = 201;



    public HUcast() {
        //set base stats
        this.baseATA = BASE_ATA;
        this.baseATP = BASE_ATP;
        this.baseEVP = BASE_EVP;
        this.baseMST = BASE_MST;
        this.baseDFP = BASE_DFP;
        this.baseLCK = BASE_LCK;
        //set max stats
        this.maxATA = MAX_ATA;
        this.maxATP = MAX_ATP;
        this.maxEVP = MAX_EVP;
        this.maxMST = MAX_MST;
        this.maxDFP = MAX_DFP;
        this.maxLCK = MAX_LCK;
        //set android mats
        this.matsMax = ANDROID_MAX_MATS;
        this.matsLeft = ANDROID_MAX_MATS;

    }


//    @Override
//    public int getCurrentATP() {
//        int calc = BASE_ATP +
//                //units
//                unit1.getATP() + unit2.getATP() + unit3.getATP() + unit4.getATP() +
//                //mats
//                pwrMats * 2 +
//                //mag stats
//                magPow * 2;
//
//        if (calc > MAX_ATP) {
//            return MAX_ATP;
//        }
//        return calc;
//    }

    @Override
    public int getCurrentMST() {
        return 0;
    }

//    @Override
//    public int getCurrentEVP() {
//        int calc = BASE_EVP +
//                //units
//                unit1.getEVP() + unit2.getEVP() + unit3.getEVP() + unit4.getEVP() +
//                //mats
//                evdMats * 2;
//        if (calc > MAX_EVP) {
//            return MAX_EVP;
//        }
//        return calc;
//    }

//    @Override
//    public int getCurrentDFP() {
//        int calc = BASE_DFP +
//                //units
//                unit1.getDFP() + unit2.getDFP() + unit3.getDFP() + unit4.getDFP() +
//                //mats
//                defMats * 2 +
//                //mag stats
//                magDef;
//
//        if (calc > MAX_DFP) {
//            return MAX_DFP;
//        }
//        return calc;
//    }



//    @Override
//    public int getCurrentATA() {
//        int calc = BASE_ATA +
//                //units
//                unit1.getATA() + unit2.getATA() + unit3.getATA() + unit4.getATA() +
//                //mag stats
//                magDex / 2;
//
//        if (calc > MAX_ATA) {
//            return MAX_ATA;
//        }
//        return calc;
//
//    }


//    @Override
//    public int getCurrentLCK() {
//        int calc = BASE_LCK +
//                //units
//                unit1.getLCK() + unit2.getLCK() + unit3.getLCK() + unit4.getLCK() +
//                //mats
//                lckMats * 2;
//        if (calc > maxLCK) {
//            return maxLCK;
//        }
//        return calc;
//    }


}


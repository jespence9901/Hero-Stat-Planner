package StatCalculator.Model;

public class RAcast extends Hero{

    private final int BASE_ATA = 200;
    private final int BASE_ATP = 859;
    private final int BASE_MST = 0;
    private final int BASE_EVP = 626;
    private final int BASE_DFP = 505;
    private final int BASE_LCK = 10;

    private final int MAX_ATA = 234;
    private final int MAX_ATP = 1450;
    private final int MAX_MST = 0;
    private final int MAX_EVP = 729;
    private final int MAX_DFP = 706;
    private final int MAX_LCK = 100;

    public RAcast() {
        //set base stats
        this.baseATA = BASE_ATA;
        this.baseATP = BASE_ATP;
        this.baseMST = BASE_MST;
        this.baseEVP = BASE_EVP;
        this.baseDFP = BASE_DFP;
        this.baseLCK = BASE_LCK;
        //set max stats
        this.maxATA = MAX_ATA;
        this.maxATP = MAX_ATP;
        this.maxMST = MAX_MST;
        this.maxEVP = MAX_EVP;
        this.maxDFP = MAX_DFP;
        this.maxLCK = MAX_LCK;
        //set mats
        this.matsMax = ANDROID_MAX_MATS;
        this.matsLeft = ANDROID_MAX_MATS;
    }

    @Override
    public int getCurrentMST() {
        return 0;
    }
}

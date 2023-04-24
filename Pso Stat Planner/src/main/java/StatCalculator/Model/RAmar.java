package StatCalculator.Model;

public class RAmar extends Hero{

    private static final int BASE_ATP = 806;
    private static final int BASE_MST = 505;
    private static final int BASE_EVP = 639;
    private static final int BASE_DFP = 359;
    private static final int BASE_ATA = 230;
    private static final int BASE_LCK = 10;

    private static final int MAX_ATP = 1360;
    private static final int MAX_MST = 765;
    private static final int MAX_EVP = 745;
    private static final int MAX_DFP = 615;
    private static final int MAX_ATA = 260;
    private static final int MAX_LCK = 100;


    public RAmar() {
        //set base stats
        this.baseATA = BASE_ATA;
        this.baseATP = BASE_ATP;
        this.baseMST = BASE_MST;
        this.baseDFP = BASE_DFP;
        this.baseEVP = BASE_EVP;
        this.baseLCK = BASE_LCK;
        //set max stats
        this.maxATA = MAX_ATA;
        this.maxATP = MAX_ATP;
        this.maxMST = MAX_MST;
        this.maxDFP = MAX_DFP;
        this.maxEVP = MAX_EVP;
        this.maxLCK = MAX_LCK;
        //set human mats
        this.matsMax = HUMAN_MAX_MATS;
        this.matsLeft = HUMAN_MAX_MATS;

    }
}

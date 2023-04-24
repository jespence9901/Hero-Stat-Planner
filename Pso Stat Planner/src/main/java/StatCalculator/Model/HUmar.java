package StatCalculator.Model;

public class HUmar extends Hero{
    private final int BASE_ATA = 148;
    private final int BASE_ATP = 835;
    private final int BASE_MST = 885;
    private final int BASE_EVP = 666;
    private final int BASE_DFP = 538;
    private final int BASE_LCK = 10;

    private final int MAX_ATP = 1337;
    private final int MAX_MST = 1277;
    private final int MAX_EVP = 841;
    private final int MAX_DFP = 689;
    private final int MAX_ATA = 210;
    private final int MAX_LCK = 100;


    public HUmar() {
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
        //set human mats
        this.matsMax = HUMAN_MAX_MATS;
    }
}

package StatCalculator.Model;

public class FOmar extends Hero{

    private final int BASE_ATA = 139;
    private final int BASE_ATP = 753;
    private final int BASE_MST = 990;
    private final int BASE_EVP = 551;
    private final int BASE_DFP = 321;
    private final int BASE_LCK = 10;

    private final int MAX_ATP = 1102;
    private final int MAX_MST = 1440;
    private final int MAX_EVP = 681;
    private final int MAX_DFP = 570;
    private final int MAX_ATA = 170;
    private final int MAX_LCK = 100;

    public FOmar() {
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
        this.matsMax = HUMAN_MAX_MATS;
        this.matsLeft = HUMAN_MAX_MATS;
    }
}

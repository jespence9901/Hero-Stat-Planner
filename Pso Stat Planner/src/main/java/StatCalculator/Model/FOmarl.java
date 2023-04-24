package StatCalculator.Model;

public class FOmarl extends Hero{

    private final int BASE_ATA = 139;
    private final int BASE_ATP = 721;
    private final int BASE_MST = 934;
    private final int BASE_EVP = 513;
    private final int BASE_DFP = 351;
    private final int BASE_LCK = 10;

    private final int MAX_ATA = 181;
    private final int MAX_ATP = 972;
    private final int MAX_MST = 1384;
    private final int MAX_EVP = 618;
    private final int MAX_DFP = 598;
    private final int MAX_LCK = 100;

    public FOmarl() {
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

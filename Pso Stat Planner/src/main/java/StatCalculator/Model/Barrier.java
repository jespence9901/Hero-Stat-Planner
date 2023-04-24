package StatCalculator.Model;

public class Barrier {
    private String name = "Empty";
    private int DFP = 0;
    private int EVP = 0;
    private int ATA = 0;
    private int ATP = 0;
    private int MST = 0;
    private int LCK = 0;

    public Barrier() {}

    public Barrier(String name, int DFP, int EVP, int ATA, int ATP, int MST, int LCK) {
        this.name = name;
        this.DFP = DFP;
        this.EVP = EVP;
        this.ATA = ATA;
        this.ATP = ATP;
        this.MST = MST;
        this.LCK = LCK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDFP() {
        return DFP;
    }

    public void setDFP(int DFP) {
        this.DFP = DFP;
    }

    public int getEVP() {
        return EVP;
    }

    public void setEVP(int EVP) {
        this.EVP = EVP;
    }

    public int getATA() {
        return ATA;
    }

    public void setATA(int ATA) {
        this.ATA = ATA;
    }

    public int getATP() {
        return ATP;
    }

    public void setATP(int ATP) {
        this.ATP = ATP;
    }

    public int getMST() {
        return MST;
    }

    public void setMST(int MST) {
        this.MST = MST;
    }

    public int getLCK() {
        return LCK;
    }

    public void setLCK(int LCK) {
        this.LCK = LCK;
    }
}

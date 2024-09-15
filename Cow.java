
public class Cow extends Animal {
    private int ageYears;
    private int ageMonths;
    private int numTeats;


    public Cow(String id,int ageYears, int ageMonths, int numTeats) {
        super(id);
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
        this.numTeats = numTeats;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public int getAgeMonths() {
        return ageMonths;
    }

    public int getNumTeats() {
        return numTeats;
    }


    public int milkOutput() {
        return ageYears + ageMonths;  
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public void setNumTeats(int teats) {
        numTeats = teats;
    }
}

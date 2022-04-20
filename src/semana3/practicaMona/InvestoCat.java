package semana3.practicaMona;

public class InvestoCat extends Mona {

    private boolean haveBriefcase, havePipe;

    public InvestoCat() {
        super.setHOBBY("Private Investigator");
    }

    public InvestoCat(String hobby, boolean haveBriefcase, boolean havePipe) {
        super.setHOBBY(hobby);
        this.haveBriefcase = haveBriefcase;
        this.havePipe = havePipe;
    }

    public boolean isHaveBriefcase() {
        return haveBriefcase;
    }

    public void setHaveBriefcase(boolean haveBriefcase) {
        this.haveBriefcase = haveBriefcase;
    }

    public boolean isHavePipe() {
        return havePipe;
    }

    public void setHavePipe(boolean havePipe) {
        this.havePipe = havePipe;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("and %s", activity());
    }

    @Override
    public String activity() {
        return "I'm looking for you.";
    }
}

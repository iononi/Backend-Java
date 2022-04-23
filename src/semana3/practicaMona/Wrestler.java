package semana3.practicaMona;

public class Wrestler extends Mona {

    private boolean haveMask;
    private String suitColor;

    public Wrestler() {
        this("Wrestler", true, "Black");
    }

    public Wrestler(String hobby, boolean haveMask, String suitColor) {
        super.setHobby(hobby);
        this.haveMask = haveMask;
        this.suitColor = suitColor;
    }

    public boolean haveMask() {
        return haveMask;
    }

    public void setHaveMask(boolean haveMask) {
        this.haveMask = haveMask;
    }

    public String getSuitColor() {
        return suitColor;
    }

    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("and %s", activity());
    }

    @Override
    public String activity() {
        return "I like wrestling!";
    }
}

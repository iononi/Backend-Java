package semana3.practicaMona;

public class Filmtocat extends Mona {

    public Filmtocat() {
        super.setHOBBY("Photographer");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("and %s", activity());
    }

    @Override
    public String activity() {
        return "say Whiskeeeey!";
    }
}

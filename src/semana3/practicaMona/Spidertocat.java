package semana3.practicaMona;

public class Spidertocat extends Mona {

    public Spidertocat() {
        super.setHOBBY("Spidertocat");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("and %s", activity());
    }

    @Override
    public String activity() {
        return "I'm your friendly neighbor, Spidertocat!";
    }
}

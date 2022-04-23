package semana3.practicaMona;

public class Scubatocat extends Mona {


    public Scubatocat() {
        this("Diving");
    }

    public Scubatocat(String hobby) {
        super.setHobby(hobby);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("and %s", activity());
    }

    @Override
    public String activity(){
        return "I like the sea!";
    }
}

package semana3.practicaMona;

public class Miner extends Mona {

    public Miner() {
        this("Miner");
    }

    public Miner(String hobby) {
        super.setHobby(hobby);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("and %s", activity());
    }

    @Override
    public String activity() {
        return "the best part of mining is when you find gold!";
    }
}

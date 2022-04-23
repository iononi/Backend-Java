package semana3.practicaMona;

public abstract class Mona {

    private String hobby;
    private final String NAME = "Mona";
    private final String EYES_COLOR = "Light brown";

    public Mona() {

    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNAME() {
        return NAME;
    }

    public String getEYES_COLOR() {
        return EYES_COLOR;
    }

    @Override
    public String toString() {
        return String.format("Hi! My name is %s, I have %s eyes. My hobby is %s ", NAME, EYES_COLOR,
                hobby);
    }

    public abstract String activity();
}

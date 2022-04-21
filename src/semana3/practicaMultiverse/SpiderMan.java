package semana3.practicaMultiverse;

public class SpiderMan {

    private int id;
    private String name, universe, height, weight, hairColor, abilities;

    public SpiderMan() {

    }

    public SpiderMan(int id, String name, String universe, String height, String weight, String hairColor, String abilities) {
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.abilities = abilities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return String.format("Hi! I'm %s, and I was bitten by a radioactive spider. I'm from %s.", name,
                universe);
    }
}

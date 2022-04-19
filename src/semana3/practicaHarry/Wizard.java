package semana3.practicaHarry;

/*
* Concrete class to represent a wizard from Harry Potter saga
* */
public class Wizard {

    private String name, surname, species, house, boggart, patronus;
    private Gender gender;

    public Wizard() {

    }

    public Wizard(String name, String surname, String species, String house, String boggart, String patronus, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.species = species;
        this.house = house;
        this.boggart = boggart;
        this.patronus = patronus;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecies() {
        return species;
    }

    public String getHouse() {
        return house;
    }

    public String getBoggart() {
        return boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSurname: %s\nSpecies: %s\nHouse: %s\nBoggart: %s\nPatronus: %s\n", name, surname,
                species, house, boggart, patronus);
    }
}

package semana3.practicaHarry;

public class Main {
    public static void main(String[] args) {

        Wizard harry, dumbledore, hermione, malfoy, snape;

        // Inicializamos los atributos de harry
        harry = new Wizard();
        harry.setName("Harry");
        harry.setSurname("James Potter");
        harry.setSpecies("Human");
        harry.setHouse("Gryffindor");
        harry.setGender(Gender.MALE);
        harry.setBoggart("Dementor");
        harry.setPatronus("Stag");

        // Mostramos a harry
        System.out.println(harry);

        // Instanciamos e imprimimos a dumbledore
        dumbledore = new Wizard("Albus", "Dumbledore", "Human", "Gryffindor", "His sister corpse", "Phoenix", Gender.MALE);
        System.out.println(dumbledore);

        // Instanciamos a hermione
        hermione = new Wizard("Hermione", "Jean Granger", "Human", "Gryffindor", "Failure", "Otter", Gender.FEMALE);

        // Imprimimos a hermione
        System.out.println("Name: " + hermione.getName());
        System.out.println("Surname: " + hermione.getSurname());
        System.out.println("Species: " + hermione.getSpecies());
        System.out.println("House: " + hermione.getHouse());
        System.out.println("Boggart: " + hermione.getBoggart());
        System.out.println("Patronus: " + hermione.getPatronus() + "\n");

        malfoy = new Wizard("Draco", "Lucius Malfoy", "Human, Ferret", "Slytherin", "Lord Voldemort", "None",Gender.MALE);
        System.out.println(malfoy);

        snape = new Wizard("Severus", "Snape", "Human", "Slytherin", "Lord Voldemort", "Doe", Gender.MALE);
        System.out.println(snape);
    }
}

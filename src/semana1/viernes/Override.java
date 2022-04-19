package semana1.viernes;

// La sobrescritura o redefinicion de un metodo
// se presenta con la herencia y el tipo de dato de retorno y la signatura
// deben ser iguales en la clase padre y en la clase hija.
// Se le considera un tipo de polimorfismo en tiempo de ejecución.


class Cat extends Animal {
    String name;

    // Ejemplo de overlaoding
    public Cat(String name, String gender, int age) {
        super(gender, age);
        this.name = name;
    }

    // Primer metodo constructor que sobrecarga
    public Cat() {

    }

    // Segundo metodo constructor que sobrecarga
    public Cat(String name) {
        super("Female", 2);
        this.name = name;
    }

    // Ejemplos de sobreescritura o redefinicion
    @java.lang.Override
    public void eat() {
        System.out.println(name + " is eating...");
    }

    @java.lang.Override
    public void print() {
        String output = String.format("Name: %s\n", name);
        System.out.println(output);
        super.print();
    }
}

public class Override {
    public static void main(String[] args) {
        Animal mimi = new Cat("Mimi");
        mimi.print();
    }
}
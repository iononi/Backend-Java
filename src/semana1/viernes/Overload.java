package semana1.viernes;

// El overload es una especie de polimorfismo en tiempo de compilacion
// Funciona dentro de la misma clase
// En el overloading, el tipo de retorno puede o no ser el mismo
// El overlaoding no sucede solo por cambiar el tipo de retorno
// El overloading necesita que la signatura del método sea diferente

class Animal {
    int age;
    String gender;

    // Metodo constructor vacio o por omision
    public Animal(){

    }

    // Primer método constructor sobrecargado
    public Animal(String gender) {
        age = 2;
        this.gender = gender;
    }

    // Segundo método constructor sobrecargado
    public Animal(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String output = String.format("Age: %d\nGender: %s\n", age, gender);
        System.out.println(output);
    }

    public void eat() {
        System.out.println("eating...");
    }
}


public class Overload {
    public static void main(String[] args) {
        Animal gato = new Animal("Female", 2);
        gato.print();
    }
}

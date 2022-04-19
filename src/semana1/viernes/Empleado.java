package semana1.viernes;

class Persona {
    int id;
    String nombre;

    public Persona (int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}


public class Empleado extends Persona {

    double salario;

    public Empleado(int id, String nombre, double salario) {
        super(id, nombre);
        this.salario = ( salario < 0 ) ? 0 : salario;
    }

    public String display() {
        return String.format("ID: %d\nNombre: %s\nSalario: %.2f", id, nombre, salario);
    }
}

class TestEmpleado {
    public static void main(String[] args) {
        Empleado lalo = new Empleado(1, "Eduardo", 40000);
        System.out.println(lalo.display());
    }
}

import java.util.Scanner;
public class empleado {
    private String nombre;
    private int edad;
    private double salario;

    //metodo constructor
    public empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //Setter para las variables
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //Getter para las variables
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //objeto de la clase empleado
        empleado emp1 = new empleado("Diego",22,1450.00);
        //Creacion del escaner
        Scanner input = new Scanner(System.in);
        //Se solicita los datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = input.nextDouble();

        System.out.print("Ingrese el edad del empleado: ");
        int edad = input.nextInt();



        System.out.println("Nombre del empleado 1: " + emp1.getNombre());
        System.out.println("Edad del empleado 1: " + emp1.getEdad());
        System.out.println("Salario del empleado 1: " + emp1.getSalario());
        System.out.println();

        empleado emp2 = new empleado(nombre,edad,salario);

        System.out.println("Nombre del empleado 2: " + emp2.getNombre());
        System.out.println("Edad del empleado 2: " + emp2.getEdad());
        System.out.println("Salario del empleado 2: " + emp2.getSalario());
        System.out.println();
    }
}
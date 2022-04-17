package tema03.ejercicios.ejercicio6;

/**
 *
 * 6. En una empresa todos los trabajadores tienen un sueldo base de 1000 €. Los
 * jefes tienen un suplemento de 500 € por cada año que hayan sido jefe de la
 * empresa, y los viajantes, además del sueldo base, cobran 300 € por viaje
 * realizado. Crear una clase empleado de la cual deriven las clases jefe y
 * viajante. Crear una plantilla de una empresa con dos jefes, cinco viajantes y
 * 15 empleados, e imprimir por consola sus respectivos salarios. Para generar
 * el número de viajes de los viajantes y la antigüedad de los jefes puedes
 * generar números aleatorios entre 0 y 10. Emplea el polimorfismo de herencia.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Empleado[] personal = new Empleado[23];
        int num = 0;
        for (int i = 0; i <= 1; i++) {
            num = (int) Math.floor(Math.random() * 10);
            Jefe paco = new Jefe(num, i);
            personal[i] = paco;
        }
        for (int i = 2; i <= 5 + 1; i++) {
            num = (int) Math.floor(Math.random() * 10);
            Viajantes juan = new Viajantes(num, i);
            personal[i] = juan;
        }
        for (int i = 7; i <= 7 + 15; i++) {
            Empleado currante = new Empleado(i);
            personal[i] = currante;
        }
        for (Empleado trabajador : personal) {
            System.out.println(trabajador);
        }
    }
}

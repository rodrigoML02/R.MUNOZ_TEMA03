/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 *
 */
public class Empleado {

    protected int sueldo;
    protected int ID;

    public Empleado(int ID) {
        this.sueldo = 1000;
        this.ID = ID;
    }

    public void setSueldo(int newsueldo) {
        this.sueldo = newsueldo;
    }

    @Override
    public String toString() {
        return "Empleado sueldo=" + sueldo + ", ID=" + ID;
    }

}

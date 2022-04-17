/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema03.ejercicios.ejercicio6;

/**
 *
 * @author rodri
 */
public class Viajantes extends Empleado {

    protected int viajes;

    public Viajantes(int viajes, int ID) {
        super(ID);
        this.viajes = viajes;
        this.sueldo = this.sueldo + viajes * 300;
    }

    @Override
    public String toString() {
        return "Viajante sueldo=" + sueldo + ", ID=" + ID;
    }

}

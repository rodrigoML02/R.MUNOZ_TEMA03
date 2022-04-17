/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema03.ejercicios.ejercicio6;

/**
 *
 * @author rodri
 */
public class Jefe extends Empleado {

    protected int años;

    public Jefe(int años, int ID) {
        super(ID);
        this.años = años;
        this.sueldo = this.sueldo + 500 * años;
    }

    @Override
    public String toString() {
        return "Jefe sueldo=" + sueldo + ", ID=" + ID;
    }

}

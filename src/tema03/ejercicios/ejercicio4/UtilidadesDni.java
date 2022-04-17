/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema03.ejercicios.ejercicio4;

/**
 *
 * @author rodri
 */
public class UtilidadesDni {

    public static boolean Letracorrecta(int dniNum, String letraDni) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicion = (dniNum % 23);
        String letraReal = letras[posicion];
        return (letraReal.equals(letraDni));
    }
}

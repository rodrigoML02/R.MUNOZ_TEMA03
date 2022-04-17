/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema03.ejercicios.ejercicio7;

/**
 *
 * @author rodri
 */
public class Utilidades07 {

    public static String creadorDeNumeroDeCuenta() {
        int digito;
        String Numero = "";
        for (int i = 0; i <= ((8 * 4) - 1); i++) {
            if (i % 4 == 0) {
                digito = (int) Math.floor(Math.random() * 10);
                Numero = Numero + String.valueOf(digito);
                Numero = Numero + " ";
            } else {
                digito = (int) Math.floor(Math.random() * 11);
                Numero = Numero + String.valueOf(digito);
            }
        }
        return Numero;
    }
}

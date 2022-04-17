/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema03.ejercicios.ejercicio5;

/**
 *
 * @author rodri
 */
public class Utilidades5 {

    public static String generadorDeContraseñas(int lenght) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] simbolos = {"!", "|", "@", "#", "$", "&", "$", "/", "?", "¿", "¡", "*"};
        String password = " ";
        for (int i = 0; i <= lenght - 1; i++) {
            int num = (int) Math.floor(Math.random() * 4);
            if (num == 0) {
                int num2 = (int) Math.floor(Math.random() * (letras.length - 1));
                password = password + letras[num2];
            } else if (num == 1) {
                int num2 = (int) Math.floor(Math.random() * (letras.length - 1));
                password = password + letras[num2].toLowerCase();
            } else if (num == 2) {
                int num2 = (int) Math.floor(Math.random() * (numeros.length - 1));
                password = password + numeros[num2];
            } else {
                int num2 = (int) Math.floor(Math.random() * (simbolos.length - 1));
                password = password + simbolos[num2];
            }
        }
        return password;
    }
}

package tema03.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import tema03.ejercicios.ejercicio4.Generos;

/**
 *
 * @author rodri
 */
public class Utilidades {

    public static String LeerFrase(String palabra) {
        System.out.println(palabra);
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            name = consola.readLine();
        } catch (IOException ex) {
            name = " ";
        }

        return name;
    }

    public static int leeEntero(String pregunta) {
        String CandeNumero = LeerFrase(pregunta);
        int elNumero;
        try {
            elNumero = Integer.parseInt(CandeNumero);
        } catch (NumberFormatException nfe) {
            elNumero = 0;
        }
        return elNumero;
    }

    public static float leefloat(String pregunta) {
        float elNumero = 0;
        boolean correcto = false;

        while (!correcto) {
            String CandeNumero = LeerFrase(pregunta);
            try {
                elNumero = Float.valueOf(CandeNumero);
                correcto = true;
            } catch (NumberFormatException nfe) {
                System.out.println("No válido. Debe introducir un numero correcto (HOMBRE/MUJER).");
            }

        }
        return elNumero;
    }

    public static Generos leeGenero(String pregunta) {
        Generos genero = null;
        boolean correcto = false;

        while (!correcto) {
            String CandeGenero = LeerFrase(pregunta);
            try {
                Generos.valueOf(CandeGenero);
                correcto = true;
            } catch (IllegalArgumentException nfe) {
                System.out.println("No válido. Debe introducir un género correcto (HOMBRE/MUJER).");
            }

        }
        return genero;
    }

}

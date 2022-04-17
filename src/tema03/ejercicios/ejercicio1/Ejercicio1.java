
package tema03.ejercicios.ejercicio1;
/**
 1. Escribe un programa que cree una clase para representar un objeto punto en tres
dimensiones. Proporcionar un constructor que inicialice los valores del punto al
origen de coordenadas y otro que permita especificar las coordenadas del punto.
Sobrescribe su método toString() para que muestre información sobre los puntos.
Usa la clase en un programa donde crees objetos que representen los puntos (12,
13, 18) y (8, 14, 0) y los muestres por consola.
 */
public class Ejercicio1 {
    public static void main(String[] args){
        Punto punto1= new Punto(12,13,18);
        Punto punto2= new Punto(8,14,0);
        Punto punto0= new Punto();
        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto0);
    } 
    
}

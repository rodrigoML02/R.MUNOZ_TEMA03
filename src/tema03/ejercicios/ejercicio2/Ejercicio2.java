
package tema03.ejercicios.ejercicio2;

/**
 * 2. Crea una clase fecha que almacene el día, el mes y el año de una fecha. Proporciona
funciones miembro para acceder a estos atributos (getDia(), getMes() y getAño()) y
para modificarlos (setDia(int dia), setMes(int mes) y setAño(int año)). Sobrescribe su
método toString(). Crea la fecha 20/10/2018. Muéstrala por pantalla. Después
cambia el año 2019. Muéstrala por pantalla.

 */
public class Ejercicio2 {
    public static void main(String [] args){
        Fecha date =new Fecha(20,10,2018);
        System.out.println(date);
        date.setYear(2019);
        System.out.println(date);  
    }
}

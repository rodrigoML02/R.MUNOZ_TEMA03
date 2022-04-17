
package tema03.ejercicios.ejercicio2;

/**
 * 2. Crea una clase fecha que almacene el día, el mes y el año de una fecha. Proporciona
funciones miembro para acceder a estos atributos (getDia(), getMes() y getAño()) y
para modificarlos (setDia(int dia), setMes(int mes) y setAño(int año)). Sobrescribe su
método toString(). Crea la fecha 20/10/2018. Muéstrala por pantalla. Después
cambia el año 2019. Muéstrala por pantalla.

 */
public class Fecha {
    private int dia;
    private int mes;
    private int year;
    
    public Fecha(){
        this(18,02,2002);
    }
    
    public Fecha(int dia, int mes, int year){
        this.dia=dia;
        this.mes=mes;
        this.year=year; 
    }
    
    //Getters
    public int getYear(){
        return this.year;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    
    
    //setters
    public  void setYear(int year){
        this.year=year;
    }
    public  void setDia(int dia){
        this.dia=dia;
    }
    public  void setMes(int mes){
        this.mes=mes;
    }

    @Override
    public String toString() {
        return "Hoy es" + " dia " + dia + ", del mes " + mes + ", de año " + year + '}';
    }
    
    
    
}

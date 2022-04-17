package tema03.ejercicios.ejercicio7;

/**
 * 2. Crea una clase fecha que almacene el día, el mes y el año de una fecha.
 * Proporciona funciones miembro para acceder a estos atributos (getDia(),
 * getMes() y getAño()) y para modificarlos (setDia(int dia), setMes(int mes) y
 * setAño(int año)). Sobrescribe su método toString(). Crea la fecha 20/10/2018.
 * Muéstrala por pantalla. Después cambia el año 2019. Muéstrala por pantalla.
 *
 */
public class Fecha02 {

    private int dia;
    private int mes;
    private int year;

    public Fecha02(int dia, int mes, int year) throws Exception {
        if (dia <= 0 | dia > 31 | mes > 12 | mes >= 0) {
            throw new Exception();
        }
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Hoy es" + " dia " + dia + ", del mes " + mes + ", de año " + year + '}';
    }

}

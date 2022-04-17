package tema03.ejercicios.ejercicio5;

//Ahora, crea una clase clase ejecutable que haga lo siguiente:
//• Cree un array de Passwords con el tamaño que tú le indiques por teclado.
//• Cree un bucle que cree un objeto para cada posición del array. Indica por
//teclado la longitud de cada password.
//• Cree otro array de booleanos donde se almacene si el password del array
//de Password es o no fuerte (usa el bucle anterior).
//• Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa
//este simple formato:
//contraseña1 : valor_booleano1
//contraseña2 : valor_bololeano2
public class Ejercicio5 {

    public static void main(String args[]) {
        int tamaño = 0;
        do {
            String pregunta = ("introduce el tamaño de la lista(mayor que 0)");
            tamaño = tema03.ejercicios.Utilidades.leeEntero(pregunta);
        } while (tamaño <= 0);
        Password[] contraseñas = new Password[tamaño];
        Password contraseña;
        boolean[] seguridad = new boolean[tamaño];

        for (int i = 0; i <= (tamaño - 1); i++) {
            //primer apartado
            String pregunta = ("introduce el tamaño de la contraseña");
            int lenghtcontraseñas = tema03.ejercicios.Utilidades.leeEntero(pregunta);
            contraseña = new Password(lenghtcontraseñas);
            contraseñas[i] = contraseña;
            //segundo apartado
            boolean segura = contraseña.esFuerte();
            seguridad[i] = segura;
        }
        //para mostrar por pantalla
        for (int j = 0; j <= tamaño - 1; j++) {
            System.out.println("Contraseña" + j + ":    " + seguridad[j]);
            System.out.println(contraseñas[j]);
        }
    }

}

package tema03.ejercicios.ejercicio5;

/**
 *
 * //Haz una clase llamada Password que tenga los atributos longitud y
 * contraseña. Por //defecto, la longitud de la contraseña será de 8 caracteres.
 * Los constructores serán //los siguiente: //• Un constructor por defecto que
 * tendrá como contraseña "password". //• Un constructor con la longitud que
 * nosotros le pasemos. Generará una //contraseña alfanumérica aleatoria con esa
 * longitud. //Los métodos de esta clase serán: //• esFuerte(): devuelve un
 * booleano si es fuerte o no. Para que sea fuerte debe //tener más de 2
 * mayúsculas, más de 1 minúscula y más de 5 números. //• generarPassword():
 * genera la contraseña del objeto con la longitud que //tenga. //• Método get
 * para contraseña y longitud. //• Método set para longitud.
 */
public class Password {

    private int lenght;
    private String password;

    //constructores
    public Password() {
        this.password = "password";
        this.lenght = 8;
    }

    public Password(int lenght) {
        boolean running = true;
        while (running) {
            if (lenght > 0) {
                this.lenght = lenght;
                this.password = Utilidades5.generadorDeContraseñas(lenght);
                break;
            } else {
                System.out.println("Error lenght demasiado corta");
                String pregunta = "introduce valor de lenght";
                lenght = tema03.ejercicios.Utilidades.leeEntero(pregunta);
            }
        }
    }

    public boolean esFuerte() {
        boolean esfuerte = false;
        //tener más de 1 mayúsculas
        //más de 1 minúscula  más de 3 números.
        //1 simbolo
        int cNum = 0;
        int cSimbolos = 0;
        int cMinus = 0;
        int cMayus = 0;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] simbolos = {"!", "|", "@", "#", "$", "&", "$", "/", "?", "¿", "¡", "*"};
        for (int i = 0; i <= this.lenght - 1; i++) {
            String caracter = this.password.substring(i, i + 1);
            for (String letra : letras) {
                if (caracter.equals(letra)) {
                    cMayus++;
                } else if (caracter.equals(letra.toLowerCase())) {
                    cMinus++;
                }
            }
            for (String numero : numeros) {
                if (caracter.equals(numero)) {
                    cNum++;
                }
            }
            for (String simbolo : simbolos) {
                if (caracter.equals(simbolo)) {
                    cSimbolos++;
                }
            }
        }
        esfuerte = (cMayus >= 1 & cMinus >= 1 & cNum >= 3 & cSimbolos >= 1);
        return esfuerte;
    }

    //getters
    public String getPassword() {
        return this.password;
    }

    public int getLenght() {
        return this.lenght;
    }

    //setters
    public void setPassword(int newlenght) {
        this.lenght = newlenght;
        this.password = Utilidades5.generadorDeContraseñas(newlenght);
    }

    @Override
    public String toString() {
        return "Password{" + "lenght=" + lenght + ", password=" + password + '}';
    }

}

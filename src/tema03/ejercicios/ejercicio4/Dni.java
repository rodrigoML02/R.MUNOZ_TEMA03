package tema03.ejercicios.ejercicio4;

//• Un constructor con un número.
//• Un constructor con el número y la letra.
//• Un constructor con un String que contenga el número y la letra sin
//separación.
//• Un constructor por defecto que genere un DNI correcto
public class Dni {

    int dniNum;
    String dniLetra;

    public Dni(int dniNum) {
        this.dniNum = dniNum;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicion = (dniNum % 23);
        this.dniLetra = letras[posicion];
    }

    public Dni(int dniNuml, String dniLetra) {
        this.dniLetra = dniLetra;
        this.dniNum = dniNuml;
    }

    public Dni(String dni) throws DniException {
        String dnifinal = dni.toUpperCase();
        this.dniLetra = String.valueOf(dnifinal.charAt(dnifinal.length() - 1));
        dnifinal = dnifinal.substring(0, dnifinal.length() - 1);
        this.dniNum = Integer.parseInt(dnifinal);
        if (UtilidadesDni.Letracorrecta(dniNum, dniLetra) == false) {
            throw new DniException();
        }

    }

    @Override
    public String toString() {
        return "Dni{" + "dniNum=" + dniNum + ", dniLetra=" + dniLetra + '}';
    }

}

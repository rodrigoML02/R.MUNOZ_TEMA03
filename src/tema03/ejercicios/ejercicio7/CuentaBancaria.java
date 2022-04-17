package tema03.ejercicios.ejercicio7;

/**
 *
 * Crea la clase cuenta bancaria, que deberá tener como atributos un nombre de
 * titular, una fecha de apertura, un número de cuenta y un saldo (puedes
 * emplear un número Programación II Página 39 de 39 real). La cuenta deberá
 * tener un método para retirar dinero, otro para ingresar dinero y otro para
 * transferir dinero a otra cuenta. De una cuenta no se podrá retirar nunca
 * dinero (ni transferir) si la cantidad de dinero a retirar o transferir es
 * mayor que el saldo. Crea una cuenta a plazo fijo, en la cual cuando se retira
 * dinero de algún modo antes de una fecha de vencimiento (que será otro
 * atributo de esta clase), además del dinero a retirar, se penaliza con un 5%
 * adicional. Crea además una cuenta Vip, que tendrá un atributo adicional que
 * es el saldo negativo máximo que puede tener. En las cuentas Vip uno podrá
 * tener saldo negativo siempre que no supere este valor
 */
public class CuentaBancaria {

    protected String titular;
    protected Fecha02 fecha;
    protected double saldo;
    protected String numeroCuenta;

    public CuentaBancaria(String titular, Fecha02 fecha) {
        this.fecha = fecha;
        this.titular = titular;
        this.numeroCuenta = Utilidades07.creadorDeNumeroDeCuenta();
        this.saldo = 0;
    }

    public void ingresarDinero(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception();
        }
        this.saldo = this.saldo + cantidad;
    }

    public void retirarDinero(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception();
        }
        boolean balidacion = false;
        while (!balidacion) {
            if (cantidad <= this.saldo) {
                this.saldo = this.saldo - cantidad;
            } else {
                String pregunta = "Introduce cantida correcta";
                cantidad = tema03.ejercicios.Utilidades.leefloat(pregunta);
            }
        }
    }

}

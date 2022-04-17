package tema03.ejercicios.ejercicio4;
//4. Haz una clase llamada Persona con atributos: nombre, edad, DNI, sexo (usa un
//enumerado), peso y altura. Crea métodos para acceder y modificar todos los
//atributos (excepto el DNI).//

public class Persona {

    private String nombre;
    private Dni dni;
    private int edad;
    private Generos genero;
    private float peso;
    private float altura;

    //Constructores
    public Persona() throws Exception {
        this("Pepe", 12, Generos.HOMBRE, 10, 1.3f);
    }

    public Persona(String nombre, int edad, Generos genero, float peso, float altura) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        if (edad <= 0) {
            throw new Exception();
        }
        if (altura <= 0) {
            throw new Exception();
        }
        if (peso <= 0) {
            throw new Exception();
        }

    }

    public Persona(String nombre, Dni dni, int edad, Generos genero, float peso, float altura) throws Exception {
        //cifras correctas
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        if (edad <= 0) {
            throw new Exception();
        }
        if (altura <= 0) {
            throw new Exception();
        }
        if (peso <= 0) {
            throw new Exception();
        }
        this.dni = dni;
    }

    //GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public Dni getDNI() {
        return dni;
    }

    public Generos getSexo() {
        return this.genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    //setters
    public void setPeso(float newpeso) throws Exception {
        if (peso <= 0) {
            throw new Exception();
        }
        this.peso = newpeso;
    }

    public void setAltura(float newaltura) throws Exception {
        if (altura <= 0) {
            throw new Exception();
        }
        this.altura = newaltura;

    }

    public void setSexo(Generos newgenero) throws Exception {

        this.genero = newgenero;
    }

    public void setNombre(String newnombre) {
        this.nombre = newnombre;
    }

    //TO String
    @Override
    public String toString() {
        String genero = "Masculino";
        return "Persona{" + "nombre=" + nombre + " dni=" + dni + ", edad=" + edad + ", sexo=" + genero + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public float calcularIMC() {
        //calcularIMC(): calcula el índice de masa corporal de la persona. La fórmula
        //es la siguiente: peso/(altura^2). La altura deberá estar especificada en
        //metros y el peso en kilogramos

        float imc;
        imc = this.peso / (this.altura * this.altura);
        return imc;

    }

    public PesoCorporal valorarPesoCorporal() {
        //valorarPesoCorporal() devolverá un enumerado que indique si el individuo
        //está por debajo de su peso ideal, en su peso ideal o tiene sobrepeso.
        // se define como IMC > 25 y se considera que se está por debajo
        //del peso ideal si IMC <18.
        float imc = calcularIMC();
        if (imc > 25) {
            return PesoCorporal.SOBREPESO;
        } else if (imc < 18) {
            return PesoCorporal.PESOIDEAL;
        } else {
            return PesoCorporal.PESOINFERIOR;
        }
    }

    public boolean esMayorDeEdad() {
        //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano
        return edad >= 18;
    }

}

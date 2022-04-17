package tema03.ejercicios.ejercicio4;
//• Pide por teclado el nombre, la edad, sexo, peso y altura.
//• Crea 3 objetos de la clase anterior. El primer objeto obtendrá las anteriores

import java.util.ArrayList;
import tema03.ejercicios.Utilidades;

//variables pedidas por teclado, el segundo objeto obtendrá todos los
//anteriores menos el peso y la altura y el último por defecto, para este último
//utiliza los métodos set para darle a los atributos un valor.
//• Para cada objeto, se deberá comprobar si está en su peso ideal, tiene
//sobrepeso o por debajo de su peso ideal con un mensaje.
//• Indicar para cada objeto si es mayor de edad.
//• Por último, mostrar la información de cada objeto.
public class Ejercicio4 {

    public static void main(String[] args) {
        try {

            String pregunta1 = "Introduce tu peso";
            float peso = Utilidades.leefloat(pregunta1);
            pregunta1 = "Introduce tu altura";
            float altura = Utilidades.leefloat(pregunta1);
            pregunta1 = "Introduce tu edad";
            int edad = Utilidades.leeEntero(pregunta1);
            pregunta1 = "Introduce tu sexo (HOMBRE o MUJER)";
            Generos genero = Utilidades.leeGenero(pregunta1);
            pregunta1 = "Introduce tu Nombre";
            String nombre = Utilidades.LeerFrase(pregunta1);
            Dni dni = new Dni("6024789P");

            Persona servivo1 = new Persona(nombre, dni, edad, genero, peso, altura);
            Persona servivo2 = new Persona(nombre, dni, edad, genero, peso, altura);
            Persona servivo3 = new Persona();
            servivo2.setAltura(1.10f);
            servivo2.setPeso(120f);

            ArrayList<Persona> listadepersonas = new ArrayList<>();
            listadepersonas.add(servivo1);
            listadepersonas.add(servivo2);
            listadepersonas.add(servivo3);
            for (Persona persona : listadepersonas) {
                System.out.println(persona.getNombre() + " tiene " + persona.valorarPesoCorporal());
                System.out.println(persona.getNombre() + " es mayor de edad?  " + persona.esMayorDeEdad());
                System.out.println(" ");
                System.out.println(persona);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}

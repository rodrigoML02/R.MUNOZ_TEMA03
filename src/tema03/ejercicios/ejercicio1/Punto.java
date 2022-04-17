
package tema03.ejercicios.ejercicio1;

//** 1. Escribe un programa que cree una clase para representar un objeto punto en tres
//dimensiones. Proporcionar un constructor que inicialice los valores del punto al
//origen de coordenadas y otro que permita especificar las coordenadas del punto.
//Sobrescribe su método toString() para que muestre información sobre los puntos.
//Usa la clase en un programa donde crees objetos que representen los puntos (12,
//13, 18) y (8, 14, 0) y los muestres por consola

public class Punto {
    private double x;
    private double y;
    private double z;

    public Punto(){
        this(0,0,0);
    }
    
    public Punto(double _x, double _y, double _z){
        this.x=_x;
        this.y=_y;
        this.z=_z; 
    }

    @Override
    public String toString() {
        return "Objetos3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
    
 
}

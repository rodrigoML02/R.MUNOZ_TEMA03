
package tema03.ejercicios.ejercicio3;

import java.io.IOException;

/**
 *. Crear una clase que represente un número racional que permita, al menos, sumar,
multiplicar y simplificar números racionales. Proporcionar un constructor por defecto,
un constructor de copia (esto es, un constructor al que se le pasa una instancia de
la clase número racional y crea otro número racional idéntico), y otro que permita
indicar los valores del numerador y del denominador. Usando esta clase, crea una
calculadora que permita operar con números racionales, seleccionando las
operaciones de un menú.
 */


public class Racional {
    private int divisor;
    private int dividendo;
    
    //constructores
    public Racional() throws Exception {
       this(1,1);
    }
    public Racional (int dividendo, int divisor) throws Exception {
        this.dividendo=dividendo;
        if (divisor==0) throw new Exception();
        this.divisor=divisor;
    }
    
   
    //operaciones
    public Racional sumaRacional(Racional num) throws Exception {
        int divisorNuevo=(this.divisor*num.divisor);
        int dividendoNuevo;
        Racional resultadosuma;
        dividendoNuevo=this.dividendo*(divisorNuevo/this.divisor)+ num.dividendo*(divisorNuevo/num.divisor);
        resultadosuma=new Racional(dividendoNuevo,divisorNuevo);
        resultadosuma.reducirRacional();
        return resultadosuma;

        
    }
     
    public Racional copiaRacional()throws Exception{
       Racional copia= new Racional(this.dividendo,this.divisor);
       return copia;
    }
    
    public Racional multiplicarRacional( Racional num)throws Exception{
        Racional resultado;
        resultado= new Racional(this.dividendo*num.dividendo,this.divisor*num.divisor);
        return resultado;
    }
    
    public void reducirRacional(){
        if (divisor>dividendo){
             for(int i=1; i<=divisor; i++){
                 if (divisor%i==0  & dividendo%i==0){
                     this.divisor=divisor/i;
                     this.dividendo=dividendo/i;
                 }
             }
        }
          
        else if (dividendo==divisor){
                this.divisor=1;
                this.dividendo=1;
        }
        else{
            for(int i=1; i<=dividendo; i++){
                 if (divisor%i==0  & dividendo%i==0){
                     this.divisor=divisor/i;
                     this.dividendo=dividendo/i;
                 }
             }
        }
    }

    
    //getters
    
    public int getRadical(){
        return this.divisor;
    }

    
    //setters
    
    public void setRacional(int a, int b) throws Exception{
        if (b==0) throw new Exception();
        this.dividendo=a;
        this.divisor=b;
    }

    
    
    @Override
    public String toString() {
        return dividendo + "/"+ divisor;
    }
    
    
    
    
}





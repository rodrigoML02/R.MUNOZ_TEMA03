
        
package tema03.ejercicios.ejercicio3;

import tema03.ejercicios.Utilidades;

/**
 *. Crear una clase que represente un número racional que permita, al menos, sumar,
multiplicar y simplificar números racionales. Proporcionar un constructor por defecto,
un constructor de copia (esto es, un constructor al que se le pasa una instancia de
la clase número racional y crea otro número racional idéntico), y otro que permita
indicar los valores del numerador y del denominador. Usando esta clase, crea una
calculadora que permita operar con números racionales, seleccionando las
operaciones de un menú.

 */
public class Claculadora {
    public static void main(String [] args){
    //calculadora
    try{
        String pregunta="";
        int opcion;
        System.out.println("introduce dividendo y divisor del radical 1:");
        int a= Utilidades.leeEntero(pregunta);
        int b= Utilidades.leeEntero(pregunta);
        Racional num1=new Racional (a,b);
        System.out.println("introduce dividendo y divisor del radical 2:");
        int c= Utilidades.leeEntero(pregunta);
        int d= Utilidades.leeEntero(pregunta);
        Racional num2=new Racional (c,d);
        boolean running=true;
        while(running==true){
            interfaz();
            opcion=Utilidades.leeEntero(pregunta);
            switch(opcion){

                    case 1: Racional sumR= num1.sumaRacional(num2);
                        System.out.println(num1+" "+num2+"="+sumR);
                        break;


                    case 2: Racional multR= num1.multiplicarRacional(num2);
                        System.out.println(num1+"*"+num2+"= "+multR);
                        break;

                    case 3:
                        num1.reducirRacional();
                        num2.reducirRacional();
                        break;

                    case 4:
                        System.out.println("¿CUAL QUIERES CAMBIAR?");
                         System.out.println("1: num1");
                         System.out.println("2: num1");
                         int cambio=Utilidades.leeEntero(pregunta);
                         if(cambio==1){
                             int e=Utilidades.leeEntero(pregunta);
                             int f= Utilidades.leeEntero(pregunta);
              
                             num1.setRacional(e, f);
                         }
                         else if(cambio==2){
                             int e=Utilidades.leeEntero(pregunta);
                             int f= Utilidades.leeEntero(pregunta);
                             num2.setRacional(e, f);
                         }

                          break;

                    case 5: System.out.println("Racional 1: "+num1);
                            System.out.println("Racional 2: "+num2);
                            break;


                    case 6: running= false;
                    break;

                    default: System.out.println("numero invalido pruebe otra vez");


                }
        }
     }catch(Exception e){
         System.out.println("NO funciona el programa F");
     }
      
    }
    
    
    public static void interfaz (){
        System.out.println("    CALCULADORA DE RACIONALES");
        System.out.println("    |1: SUMA DE RACIONALES");
        System.out.println("    |2: MULTIPLICACION DE RACIONALES");
        System.out.println("    |3: REDUCCION DE RACIONAL");
        System.out.println("    |4: CAMBIAR RACIONAL");
        System.out.println("    |5: VISUALIZAR RACIONAL");
        System.out.println("    |6: SALIR");
    }
}

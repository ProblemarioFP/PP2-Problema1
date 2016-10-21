/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema1;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dato;  // Declaracion de variable
      boolean EsB;
      
    dato= pedirDato();      //Declaracion de metodo
    EsB=calcularSiB(dato);
    mostrarResultado(EsB,dato);
    }
    
    public static int pedirDato() {     //Metodo para pedir año
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca año para calcular si es bisiesto");
        return entrada.nextInt();
    }
    
    public static boolean calcularSiB(int x) {//Metodo para calcular si un año es bisiesto
        if (x%100!=0&&x%4==0){return true;
        }else{return x%100==0&&x%400==0;
    }
    }
   
    public static void mostrarResultado(boolean x, int y) { //Metodo para mostrar en pantalla si es un año es o no bisiesto
        if(x==true){
            System.out.println("El año "+y+ " es bisiesto.");
        }else{
            System.out.println("El año "+y+" no es bisiesto");
        }
    }
    
}

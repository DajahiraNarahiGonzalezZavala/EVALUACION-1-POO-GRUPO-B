/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_copia_objeto;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_10_COPIA_OBJETO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1 = new  Prueba ();
        System.out.println("Direccion:" + obj1);
        obj1.x = 100;
        System.out.println("Valor de x = " + obj1.x);
        Prueba respaldo = obj1;
        System.out.println("Valor de X en respaldo =" + respaldo.x);
        //Modifico memoria
        respaldo.x = 0;
        System.out.println("Valor de x en obj1 =" + obj1.x);
        System.out.println("Valor de x en respaldo =" + respaldo.x);
        //Imprimir direcciones de memoria
        System.out.println("Obj1 = " + obj1);
        System.out.println(" respaldo = " + respaldo);
        if (obj1 == respaldo)
            System.out.println("Son el mismo objeto");
           else
        System.out.println("Son objetos diferentes");
    }
    
}
class Prueba {
  public int x;
}
        
        

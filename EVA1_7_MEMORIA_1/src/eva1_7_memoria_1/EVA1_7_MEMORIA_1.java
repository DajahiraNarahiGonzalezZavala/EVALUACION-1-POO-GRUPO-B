/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_memoria_1;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        String cade = "Hola";
        Prueba obj1 = new Prueba ();
        
        System.out.println("Valor =" + valor);
        System.out.println("Cadena =" + cade);
        System.out.println("Objeto = " + obj1);
    }
    
}
class Prueba {
    public void saludar () {
        System.out.println("Hola mundo");
    }
}

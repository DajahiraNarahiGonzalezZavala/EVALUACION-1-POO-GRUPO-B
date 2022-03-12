/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_18_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        Prueba obj = new Prueba ();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Area de un rectangulo de 30 x 90  = " + calcularArea (30, 90));
        System.out.println("Area de un circulo de radio 67 = " + calcularArea (67.00));
        System.out.println("Area de un circulo de radio 67 = " + calcularArea (67));
        System.out.println("Area de un triangulo de 69 de altura y 89 base = " + calcularArea (69.00,89.00));
    }
    //Area de un rectangulo
    public static double calcularArea (double base, double altura){
        return base * altura ;
        
    }
    ///Area de un circulo
   
    public static double calcularArea (double radio){
        System.out.println("Doble");
        return Math.PI*Math.pow(radio, 2);
    }
  public static  double calcularArea (int radio ) {
      System.out.println("Entero");
      return Math.PI*Math.pow(radio, 2);
  } 
  public static double calcularArea (double base , double altura, int esTriangulo) {
      return (base*altura)/2;
  }
}
class Prueba {
    
}

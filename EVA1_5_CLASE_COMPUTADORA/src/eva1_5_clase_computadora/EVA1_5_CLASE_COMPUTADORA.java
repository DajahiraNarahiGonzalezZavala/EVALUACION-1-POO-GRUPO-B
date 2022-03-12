/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_clase_computadora;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora objComp = new Computadora ();

                 objComp.setPrecio(13000);
                 objComp.setModelo("Pavillion x360");
                 objComp.setMemoria(12);
                 objComp.setMarca("Hp");
                 objComp.calcularPrecio();
                 objComp.imprimirDatos();
        
        
        
    }
   
    
}
class Computadora {
     private double precio;
   private String modelo;
   private int memoria;
  private String marca;
  
  
  public void setPrecio (double valor){
      precio = valor;
  }
  public double getPrecio (){
      return precio;
  }
  public void setModelo (String valor){
      modelo = valor;
  }
  public String getModelo (){
      return modelo;
  }
    public void setMemoria( int valor){
        memoria= valor;
       
    }
    public int  getMemoria (){
        return memoria;
    }
    public void setMarca (String valor) {
        marca = valor;
    }
    public String getMarca (){
        return marca;
    }
    
    public double calcularPrecio () {
        return precio *1.16;
    }
    public void imprimirDatos () {
        System.out.println("Precio " + precio);
         System.out.println("Modelo:" + modelo);
          System.out.println("Memoria:" + memoria);
          System.out.println("Marca;" + marca  );
          System.out.println("Precio total:" + calcularPrecio ());
    }
}
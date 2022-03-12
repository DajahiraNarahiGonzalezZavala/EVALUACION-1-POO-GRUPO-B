/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_mod_acceso;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona ();
       per1.setId("01010101");
       per1.setNombre("Juancho Lopez");
       per1.setEdad(45);
       System.out.println("Nombre:" + per1.getNombre());
       
       Persona per2 = new Persona ();
       per2.setId("020020202");
       per2.setNombre("Juanita Sanchez");
       per2.setEdad(20);
       System.out.println(per2.getNombre() + ", " + per2.getId());
    }
    
}
class Persona  {
     private String Id;
     private String Nombre;
     private int Edad;
     
     public String getId(){
         return Id;
     }
 public String getNombre(){
         return Nombre;
     }
  public int getEdad (){
         return Edad;
     }

     public void setId(String valor ){
         Id = valor;
     }
      public void setNombre(String valor ){
         Nombre = valor;
     }
      public void setEdad (int valor ){
         Edad= valor;
     }
     
            
}

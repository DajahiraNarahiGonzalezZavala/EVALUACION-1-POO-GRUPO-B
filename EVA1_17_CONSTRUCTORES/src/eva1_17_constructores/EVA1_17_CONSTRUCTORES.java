/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_constructores;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        Persona persona2 = new Persona ();
        System.out.println("Nombre 2: " + persona2.getNombre());
        System.out.println("Edad 2:" + persona2.getEdad());
        Persona persona3 = new Persona ("Lupita Montes", 35);
        System.out.println("Nombre 3 : " + persona.getNombre());
        System.out.println("Edad 3 : " + persona.getEdad());
    }
    
}
class Persona {
    private String nombre;
    private  int edad;
     
   
    
    public Persona() {
        System.out.println("Creando el objeto");
        nombre = "Panchito Hernandez";
        edad =  34;
    }
public Persona (String nombre, int edad){
    System.out.println("Creando el objeto con constructores que acepta valores");
    this.nombre = nombre;
    this.edad = edad;
}

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

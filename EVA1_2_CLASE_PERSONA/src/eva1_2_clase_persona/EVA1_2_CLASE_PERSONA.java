/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clase_persona;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_2_CLASE_PERSONA {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona estudiante = new Persona ();
        estudiante.id = "21550340";
        estudiante.nombre = "Dajahira Narahi Gonzalez Zavala";
        estudiante.edad = 18;
        estudiante.ImprimirDatos();
        System.out.println("Año de nacimiento:" + estudiante.calcularAñoNacimiento());
         
        Persona estudiante2 = new Persona();
         estudiante2.nombre = "Pancho Perez Loza";
         estudiante2.id =" 01020304";
         estudiante2.edad = 19;
         estudiante2.ImprimirDatos();
         System.out.println("Año de nacimiento:" + estudiante2.calcularAñoNacimiento());
         
         
         Persona estudiante3 = new Persona();
         estudiante3.nombre = "Ramiro Alvidrez";
         estudiante3.id =" 09090808";
         estudiante3.edad = 122;
         estudiante3.ImprimirDatos();
System.out.println("Año de nacimiento:" + estudiante3.calcularAñoNacimiento());
         

         
         System.out.println(estudiante.nombre);
     System.out.println(estudiante2.nombre);
     System.out.println(estudiante3.nombre);
         
                 
    }
 
}
class Persona {
    //ATRIBUTOS
    String nombre;
    String id;
    int edad;
    //COMPORTAMIENTOS
     void ImprimirDatos() {
         System.out.println("El nombre es :" + nombre);
         System.out.println("Su id es :" + id);
          System.out.println("Su edad es :" + edad);
     }
    //calcular año de nacimiento
     int calcularAñoNacimiento (){
         int añoNac = 2022 - edad;
         return añoNac;
     }
             
}

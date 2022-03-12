/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author Narahi Zavala
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Coloca los grados centigrados");
        double celcius = input.nextDouble();
        double farenheit = Conversiones.convertirCaF(celcius);
        System.out.println(celcius + "°c = "  + farenheit  + "°F" );
        
    }
    
    
} 
class Conversiones {
    
    public static double convertirCaF (double celcius){
        return celcius * 1.8 + 32;
        
    }
}
class Conversiones1 {
    public static double convertirCaK (double celcius ){
        return celcius + 273.15;
    }
}

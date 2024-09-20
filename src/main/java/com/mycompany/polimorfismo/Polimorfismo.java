
package com.mycompany.polimorfismo;

import java.util.Scanner;


public class Polimorfismo {
public static void main(String[] args) {
    
        DHC d1 = new DHC(3500 , 5 , "luis", "ingenieria", "calculo");
        System.out.println("el sueldo del docente uno es:");
        System.out.println(d1.calcularsalario());
        
        System.out.println("--------------");
        System.out.println("digite el valor de la hora");
        Scanner leer=new Scanner(System.in);
        double hora=leer.nextDouble();
        
        d1.setValorhora(hora);
        
        
        System.out.println("digite la cantidad de horas trabajadas:");
        double cant = leer.nextDouble();
        d1.setHorastrabajadas(cant);
        
        
        System.out.println("El nuevo valor por hora es: " + d1.getValorhora());
        System.out.println("la cantidad de horas trabajadas fueron" + d1.getHorastrabajadas());
        System.out.println("El nuevo sueldo del docente uno es:");
        System.out.println(d1.calcularsalario());
        
               
               
        
        TCO d2 = new TCO(2, 2000000 , "juan" , "sistemas", "ingles");
        System.out.println("el sueldo del docente dos es:");
        System.out.println(d2.calcularsalario());
        
        System.out.println("---------");
        System.out.println("digite cuantos trabajos de grado ayudo el docente:");
        double tra=leer.nextDouble();
        d2.setCanTrabGrado(tra);
        
        System.out.println("digite el sueldo basico del docente:");
        double sueldo = leer.nextDouble();
        d2.setSueldobasico(sueldo);
        
        System.out.println("el docente ayudo con "+d2.getCanTrabGrado()+" trabajos de grado" );
        System.out.println("el nuevo sueldo basico del docente es "+d2.getSueldobasico());
        System.out.println("el sueldo mensual del docente es: "+d2.calcularsalario());
       
    
    
        
    }
}

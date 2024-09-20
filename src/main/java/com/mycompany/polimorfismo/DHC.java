
package com.mycompany.polimorfismo;

public class DHC extends docente{
    
    private  double valorhora;
    private  double horastrabajadas;

    public DHC(double valorhora, double horastrabajadas, String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
    }

    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        
        this.valorhora = valorhora; // Asignar nuevo valor
         
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    
    

    @Override
    double calcularsalario() {
        double resultado = valorhora * horastrabajadas;
        return resultado;
    }
            
    
    
}

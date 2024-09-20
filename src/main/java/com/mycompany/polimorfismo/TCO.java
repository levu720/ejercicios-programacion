
package com.mycompany.polimorfismo;

public class TCO extends docente{
    
      private double sueldoMensual;
    private double canTrabGrado;
    private double valorHoraAsesor;
    private double asesoriaDoc;
    private double sueldobasico;

    public TCO(double canTrabGrado, double sueldobasico, String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.canTrabGrado = canTrabGrado;
        this.sueldobasico = sueldobasico;
    }


    public void setValorHoraAsesor() {
        this.valorHoraAsesor = (sueldobasico/30)/8;
    }

    public void setAsesoriaDoc() {
        this.asesoriaDoc = canTrabGrado * (2 * valorHoraAsesor);        
        
    }

    public void setCanTrabGrado(double canTrabGrado) {
        this.canTrabGrado = canTrabGrado;
    }

    public double getCanTrabGrado() {
        return canTrabGrado;
    }

    public void setSueldobasico(double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public double getSueldobasico() {
        return sueldobasico;
    }
    
    
    
    
    
    
    @Override
    double calcularsalario(){
    
        setValorHoraAsesor(); 
        setAsesoriaDoc();
        sueldoMensual = sueldobasico + asesoriaDoc;
        return sueldoMensual;
    }
    
    
}

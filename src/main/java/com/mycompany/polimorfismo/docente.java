
package com.mycompany.polimorfismo;


public abstract class docente {
    
    protected String nombreDoc;
    protected String facultadDoc;
    protected String cadiDoc;

    public docente(String nombreDoc, String facultadDoc, String cadiDoc) {
        this.nombreDoc = nombreDoc;
        this.facultadDoc = facultadDoc;
        this.cadiDoc = cadiDoc;
    }
 
    abstract double calcularsalario();
}
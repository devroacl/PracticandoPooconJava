
package com.java.farmaciacomunitaria;

/**
 *
 * @author vina
 */
public class Cliente {
    
   //Atributos
    String numeroCliente;
    String nombre; 
    
    String medicamentoAdquirido;
    
        //Contructor -Atributos

    public Cliente(String numeroCliente, String nombre, String medicamentoAdquirido) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.medicamentoAdquirido = medicamentoAdquirido;
    }
    
    
    ////Metodo
    
    public void realizarCompra(){
        
    }
    
    public void devolverCompra(){
        
    }

    
    //Getters setters 
    
    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }
    
    
    
    
    
}

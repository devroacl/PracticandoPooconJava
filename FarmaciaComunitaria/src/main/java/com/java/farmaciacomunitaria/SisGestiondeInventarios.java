package com.java.farmaciacomunitaria;

/**
 *
 * @author roaal
 */
public class SisGestiondeInventarios {
    //Atributos 
    
    String GestióndeInventarios;
    String clienteActual;
    
    String proveedorActual;
    
    
    //Constructor

    public SisGestiondeInventarios(String GestióndeInventarios, String clienteActual, String proveedorActual) {
        this.GestióndeInventarios = GestióndeInventarios;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }
    
    
    //-------------------------------
    
    
    //Metodo
    
    public void  registrarMedicamento(){
        
    }
    
    public void registrarCliente(){
        
    }
    
    public void generarInformeVentas(){
        
    }
    
    
    //-- Getters setters

    public String getGestióndeInventarios() {
        return GestióndeInventarios;
    }

    public void setGestióndeInventarios(String GestióndeInventarios) {
        this.GestióndeInventarios = GestióndeInventarios;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }
    
    
    
    
}

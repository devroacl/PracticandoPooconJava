/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.farmaciacomunitaria;

/**
 *
 * @author vina
 */
public class ProveedorFarmaceutico {
    //Declarar atributos 
    String codigoProveedor;
    String nombreProveedor;
    String medicamentoSuministrado;
    
    //Contructor -Atributos

    public ProveedorFarmaceutico(String codigoProveedor, String nombreProveedor, String medicamentoSuministrado) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.medicamentoSuministrado = medicamentoSuministrado;
    }
    
    
    
    
 //Metodo - Mostar proveedor 
     public void mostrar(){}
   
    
    //Getters&&Setters 

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }
    
    
    
    
    
    
    
    
    
    
}

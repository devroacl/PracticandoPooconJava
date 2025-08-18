/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.farmaciacomunitaria;

import java.util.Date;

/**
 *
 * @author vina
 */
public class Medicamento {
    //Atributos
    private String code;
    private String name;
    private String tipoMedicamento;
    private int stock;
   
   
    private Date fechaCaducidad;
    
    
 
    //Atributos - Constructor
    public Medicamento(){}

    public Medicamento(String code, String name, String tipoMedicamento, int stock, String fechaCaducidad) {
        this.code = code;
        this.name = name;
        this.tipoMedicamento = tipoMedicamento;
        this.stock = stock;
        this.fechaCaducidad = fechaCaducidad;
    }
 
    
    //Metodo 
    
    public void vender(){
        
       System.out.println("Vendido" +name);
    }
    
    
   
 
    
    //Getters  setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    
    //To String para convertir todos los datos en "palabras " que se puedan leer luego en consola al ejecutar 
    
    @Override
    public String toString() {
        return "Medicamento{" + "code=" + code + ", name=" + name + ", tipoMedicamento=" + tipoMedicamento + ", stock=" + stock + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

 
    
    
    
}
  

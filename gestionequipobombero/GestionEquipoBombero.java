/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionequipobombero;

/**
 *
 * @author vina
 */
public class GestionEquipoBombero {

    
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        // Crear objetos y agregarlos manualmente
        Manguera m1 = new Manguera("Angus", 30, "reforzada","EQ001", "Manguera Principal", 200000, 2023);
        Manguera m2 = new Manguera("Delta", 25, "plana","EQ002", "Manguera Secundaria", 180000, 2022);
        Uniforme u1 = new Uniforme("L", "estructural", "Nomex", "EQ003", "Uniforme Estructural", 250000, 2024);
        Uniforme u2 = new Uniforme("M", "forestal", "Algodón ignífugo","EQ004", "Uniforme Forestal", 180000, 2023);
        
        inventario.agregarEquipo(m1);
        inventario.agregarEquipo(m2);
        inventario.agregarEquipo(u1);
        inventario.agregarEquipo(u2);
        
        inventario.contarMangueras();
        
        inventario.listarEquipos();
    }
    
}

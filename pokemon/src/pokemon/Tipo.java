
package pokemon;
// Clase que representa un Pokemon con nombre, tipo y vida

import java.util.ArrayList;



 
public class Tipo {
     private String nombre;
     
     //Siguiente modulo 
     //Crear listas del tipo Array que almacenen objetos Tipo. 
     private ArrayList<Tipo> ventajas;
     private ArrayList<Tipo>desventajas; 
     
     

     //Constructor para atributo arrayslist
    public Tipo() {
        this.ventajas = new ArrayList<>();
        this.desventajas= new ArrayList<>(); 
        
    }

    //Constructor para atributo nombre
    public Tipo(String nombre) {
        this.nombre = nombre;
    }
     
    
     //Getters &&Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tipo> getVentajas() {
        return ventajas;
    }

    public void setVentajas(ArrayList<Tipo> ventajas) {
        this.ventajas = ventajas;
    }

    public ArrayList<Tipo> getDesventajas() {
        return desventajas;
    }

    public void setDesventajas(ArrayList<Tipo> desventajas) {
        this.desventajas = desventajas;
    }

    
     
    
    // Metodos para listar ventajas y desventajas
    
    //Como es solo mostrar una lista,es decir imprimir sera un metodo void 
    
    public void listarVentajas(){
        System.out.println("Listas Ventajas: ");
        if(ventajas.isEmpty() )
            System.out.println("Ninguna ");
        else{
            for(Tipo tipo : ventajas){
                System.out.println(tipo.getNombre()+ " ");
            }
            System.out.println();
        } 
        
    }
     
    
    public void listarDesventajas(){
           System.out.println("Listas Desventajas: ");
        if(desventajas.isEmpty() )
            System.out.println("Ninguna ");
        else{
            for(Tipo tipo : desventajas){
                System.out.println(tipo.getNombre()+ " ");
            }
            System.out.println();
        } 
        
    }
    
    
    
    
    
     
}

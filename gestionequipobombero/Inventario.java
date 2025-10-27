
package gestionequipobombero;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipo> listaEquipo = new ArrayList<>();
    
    public void agregarEquipo(Equipo e){
        for(Equipo eq : listaEquipo){
            if(eq.getCodigo().equalsIgnoreCase(e.getCodigo())){
                System.out.println("Ya esxiste un equipo con ese código.");
                return;
            }
        }
        listaEquipo.add(e);
        System.out.println("Equipo agregado correctamente.");
    }
    
    public void listarEquipos(){
        if(listaEquipo.isEmpty()){
            System.out.println("No hay equipos registrados.");
        }else{
            for(Equipo e : listaEquipo){
                e.mostrarDatos();
                System.out.println("Precio final: $"+e.calcularPrecioFinal());
                System.out.println("-----------------------------------");
            }
        }
    }
    
    public void contarMangueras(){
        int contador = 0;
        for(Equipo e : listaEquipo){
            if(e instanceof Manguera m){
                if(m.getTipo().equalsIgnoreCase("reforzada")){
                    contador++;
                }
            }
        }
        System.out.println("Cantidad de mangueras reforzadas: "+contador);
    }
    
}

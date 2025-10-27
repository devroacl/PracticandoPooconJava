package minningtech;

import java.util.ArrayList;

/**El sistema debe incluir una clase adicional para gestionar el parque de maquinaria,
 * que deberá implementar las siguientes funcionalidades: 
 **/
public class ClaseGestora {
    
   private ArrayList<Maquinaria> listaMaquinaria; 

    public ClaseGestora() {
        listaMaquinaria = new ArrayList<>();
    }
   
    
     /**
     * Validar que no se agregue una máquina con un código ya existente.
     * @param codigo
     * @return 
     */
    
    
    public boolean buscarMaquina(String codigo){
        for(Maquinaria aux : listaMaquinaria){
            //Ahora un condicional para ver si encuentra o hay coincidencia con el codigo 
            
            if(aux.codigo.equals(codigo)){
                return true;
            }
        }
        return false;   
    }
    
    
    public boolean agregarMaquina(Maquinaria newMachine){
        //Buscarmaquinaria(newmachine.getCodigo == false 
        if(buscarMaquina(newMachine.getCodigo())==false){
            //Agregar la maquina 
            this.listaMaquinaria.add(newMachine);
            System.out.println("Felicidades,haz agregado una nueva maquina");
            return true;
        }
        System.out.println("La maquina con ese codigo ya existe. ");
        return false;
        
    }
    
        /**
     * Calcular costo total de todas las maquinarias de mi colección
     */
    public double calcularTotalOperacion(){
        double total=0;
        for(Maquinaria aux : listaMaquinaria){
            total+=aux.calcularCostoOperacion();
        }
        return total;
    }
    
      /**
     * Un método para listar todas las máquinas registradas incluyendo 
     * el costo total de operación.
     */
    
    public void listarMaquinarias(){
        for(Maquinaria aux : listaMaquinaria){
            aux.mostrar();
        }
        System.out.println("Total por Operacion de Maquinarias: USD" +
                calcularTotalOperacion());
    }
    
     /**
     * Un método que muestre las máquinas filtrándolas por tipo.
     */
    
    public void listarMaquinasporTipo(String tipo){
        for(Maquinaria aux : listaMaquinaria){
            if (tipo.equalsIgnoreCase("excavadora")&&(aux instanceof Excavadora e)){
            System.out.println("Es una excavadora"+aux.getNombre() +"Tipo de cuchara" +e.getTipoCuchara() );
            }else if(tipo.equalsIgnoreCase("camion")&&(aux instanceof Camion c)){
                System.out.println("Es un camion "+aux.getNombre() +"Tipo de cuchara" +c.getCapacidadCarga() );
            }else if(tipo.equalsIgnoreCase("Perforadora")&&(aux instanceof Perforadoras p)){
                aux.mostrar();
            }
        }
     
}
 
    /**
     * Un método que permita dar de baja una maquinaria, eliminándola de la colección.
     */
    
    public boolean eliminarMaquina(String codigo){
        for(Maquinaria aux: listaMaquinaria){ if(aux.getCodigo().equals(codigo)){
            this.listaMaquinaria.remove(aux); System.out.println("Maquinaria eliminada con exito!!");
            return true; 
        } 
      } 
        System.out.println("No se encontro maquinaria con el codigo ingresado"); 
            return false; 
    }
    
  
    
    public void cantidadMaquinas(){
         System.out.println("Cantidad de Maquinas disponibles: " + this.listaMaquinaria.size());
    }
    
    
    
    
}
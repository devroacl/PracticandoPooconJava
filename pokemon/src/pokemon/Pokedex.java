package pokemon;

import java.util.ArrayList;
import java.util.Scanner;
//Clase principal que contiene el método main y todos los menús y funciones CRUD
//Se cambia el nombre a pokedex para evitar confucion con pokemon y pokemonn en el ejercicio original

public class Pokedex {
    
    //Funciones CRUD afuera 
    
    //CREATE
    
    public static Pokemon crearPokemon(String nombre, Tipo tipo, int vida, ArrayList<Pokemon> pokemones){
        Pokemon pokemon= new Pokemon(nombre,tipo,vida);
        pokemones.add(pokemon);
        System.out.println("Pokemon creado");
        return pokemon;
        
    }

//DELETE - Elimina Datos

        public static void borrarPokemon(String nombre,ArrayList<Pokemon> pokemones ){
            for (Pokemon pokemon: pokemones){
                if(pokemon.getNombre().equals(nombre)){
                    pokemones.remove(pokemon);
                }//else
                System.out.println("No se encontro el pokemon por lo tanto no se ha eliminado nada");
                }
                }
        
   
 

    //READ --- Busca 
            public static Pokemon buscarPokemon(String nombre, ArrayList<Pokemon> pokemones){
                for (Pokemon pokemon : pokemones){
                    if(pokemon.getNombre().equals(nombre)){
                         return pokemon;
                    }
                }
                return null;
            }
            
            
            
            
    //UPDATE - Actualizar Datos 
           // public static int ModificarVida(int Vida){
                
            //}
            
  
 //-------------------------------------------------------
            
public static int menuPrincipal(){
    //Inicializamos la variable que guarda el resultado 
    int op; 
    
    Scanner input = new Scanner(System.in);
    System.out.println("====MENU====");
    System.out.print("1-Gestion tipos de pokemon ");
    System.out.print("2-Gestion pokemones");
    System.out.print("3-Duelos");
    System.out.print("4-Salir");
    op = input.nextInt();

    return op;
}
    
    
    //Menu Con While 
    
   
    //MENU SWITCH 
    
    //while (op ){
        
        
    //}
    
    
    /**switch (op) {
        case 1: 
            System.out.println("Escogiste el 1 -");
            break;
        case 2:
            System.out.println("Escogiste el 2 -");
            break;
         case 3:
            System.out.println("Escogiste el 3 -");
            break; 
         default:
             System.out.println("Escogiste el 3 -");
    }  ***/
    
               


    //METODO PRINCIPAL     
 public static void main (String args[]){
       System.out.println("MENU ---- ");
       
        }
    
}     


      

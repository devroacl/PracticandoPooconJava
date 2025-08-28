
package vet_sistema;

import java.util.Scanner;

public class Vet_sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear mascotas predefinidas
        Mascota mascota1 = new Mascota(1, "Firulais", "Perro", 3, true, true);
        Mascota mascota2 = new Mascota(2, "Michi", "Gato", 2, false, true);
        Mascota mascota3 = new Mascota(3, "Rex", "Perro", 5, true, false);
        
        // Crear dueños ya asociados desde el constructor
        Dueno dueno1 = new Dueno("12345678-9", "Juan", mascota1);
        Dueno dueno2 = new Dueno("87654321-0", "María", mascota2);
        Dueno dueno3 = new Dueno("11111111-1", "Pedro", mascota3);
        
        // Array de dueños para facilitar la selección
        Dueno[] duenos = {dueno1, dueno2, dueno3};
        
        System.out.println("=== BIENVENIDO AL SISTEMA DE VETERINARIA ===\n");
        
        int opcionPrincipal;
        do {
            System.out.println("--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver información de todos los dueños y mascotas");
            System.out.println("2. Registrar mascotas");
            System.out.println("3. Atender mascota");
            System.out.println("4. Realizar servicio veterinario");
            System.out.println("5. Verificar cuidados de mascotas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcionPrincipal = scanner.nextInt();
            System.out.println();
            
            switch (opcionPrincipal) {
                case 1:
                    System.out.println("--- INFORMACIÓN DE DUEÑOS Y MASCOTAS ---");
                    for (int i = 0; i < duenos.length; i++) {
                        System.out.println("Dueño " + (i + 1) + ":");
                        duenos[i].mostrarInformacion();
                        System.out.println();
                    }
                    break;
                    
                case 2:
                    System.out.println("--- REGISTRO DE MASCOTAS ---");
                    for (Dueno dueno : duenos) {
                        dueno.registrarMascota();
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("--- ATENCIÓN DE MASCOTAS ---");
                    System.out.println("Seleccione el dueño:");
                    for (int i = 0; i < duenos.length; i++) {
                        System.out.println((i + 1) + ". " + duenos[i].getNombre());
                    }
                    System.out.print("Opción: ");
                    int duenoSeleccionado = scanner.nextInt() - 1;
                    
                    if (duenoSeleccionado >= 0 && duenoSeleccionado < duenos.length) {
                        duenos[duenoSeleccionado].atenderMascota();
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("--- SERVICIO VETERINARIO ---");
                    System.out.println("Seleccione el dueño:");
                    for (int i = 0; i < duenos.length; i++) {
                        System.out.println((i + 1) + ". " + duenos[i].getNombre() + 
                                         " (Mascota: " + duenos[i].getMiMascota().getNombre() + ")");
                    }
                    System.out.print("Opción: ");
                    int duenoServicio = scanner.nextInt() - 1;
                    
                    if (duenoServicio >= 0 && duenoServicio < duenos.length) {
                        System.out.println("\nSeleccione el servicio:");
                        System.out.println("1. Vacunación");
                        System.out.println("2. Desparasitación");
                        System.out.println("3. Control general");
                        System.out.print("Opción: ");
                        int servicio = scanner.nextInt();
                        
                        duenos[duenoServicio].getMiMascota().realizarServicio(servicio);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("--- VERIFICACIÓN DE CUIDADOS ---");
                    for (Dueno dueno : duenos) {
                        dueno.getMiMascota().mostrarInformacion();
                        dueno.getMiMascota().verificarCuidados();
                        System.out.println();
                    }
                    break;
                    
                case 0:
                    System.out.println("¡Gracias por usar el Sistema de Veterinaria!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
                    break;
            }
            
        } while (opcionPrincipal != 0);
        
        scanner.close();
    }
}
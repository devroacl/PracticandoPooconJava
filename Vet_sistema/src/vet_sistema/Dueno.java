
package vet_sistema;

public class Dueno {
    private String rut;
    private String nombre; 
    private Mascota miMascota; // Colaboración directa
    
    // Constructor
    public Dueno(String rut, String nombre, Mascota miMascota) {
        this.rut = rut;
        this.nombre = nombre;
        this.miMascota = miMascota;
    }
    
    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mascota getMiMascota() {
        return miMascota;
    }

    public void setMiMascota(Mascota miMascota) {
        this.miMascota = miMascota;
    }
    
    // Métodos void sin parámetros
    public void mostrarInformacion() {
        System.out.println("Dueño: " + nombre + " (RUT: " + rut + ")");
        if (miMascota != null) {
            System.out.println("Mascota asociada:");
            miMascota.mostrarInformacion();
        }
    }
    
    public void registrarMascota() {
        // Usar && para verificar si existe mascota y tiene edad válida
        if (miMascota != null && miMascota.getEdad() > 0) {
            System.out.println("El dueño " + nombre + " ha registrado a " + miMascota.getNombre() + ".");
        } else {
            System.out.println("No se puede registrar la mascota. Verifique que exista y tenga edad válida.");
        }
    }
    
    public void atenderMascota() {
        // Usar && y || para verificar condiciones
        if (miMascota != null && (miMascota.isRequiereVacuna() || miMascota.isRequiereDesparasitacion())) {
            System.out.println("El dueño " + nombre + " está llevando a " + miMascota.getNombre() + " a atención veterinaria.");
            miMascota.verificarCuidados();
        } else if (miMascota != null) {
            System.out.println("La mascota " + miMascota.getNombre() + " no necesita atención especial en este momento.");
        } else {
            System.out.println("No hay mascota para atender.");
        }
    }
}
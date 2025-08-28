
package vet_sistema;

public class Mascota {
    private int codigo;
    private String nombre;
    private String especie; 
    private int edad; 
    private boolean requiereVacuna; 
    private boolean requiereDesparasitacion;
    
    // Constructor
    public Mascota(int codigo, String nombre, String especie, int edad, boolean requiereVacuna, boolean requiereDesparasitacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.requiereVacuna = requiereVacuna;
        this.requiereDesparasitacion = requiereDesparasitacion;
    }
    
    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isRequiereVacuna() {
        return requiereVacuna;
    }

    public void setRequiereVacuna(boolean requiereVacuna) {
        this.requiereVacuna = requiereVacuna;
    }

    public boolean isRequiereDesparasitacion() {
        return requiereDesparasitacion;
    }

    public void setRequiereDesparasitacion(boolean requiereDesparasitacion) {
        this.requiereDesparasitacion = requiereDesparasitacion;
    }
    
    // Métodos void sin parámetros
    public void mostrarInformacion() {
        System.out.println("Mascota: " + nombre + " (" + especie + "), Edad: " + edad + " años.");
    }
    
    public void verificarCuidados() {
        if (requiereVacuna && requiereDesparasitacion) {
            System.out.println("La mascota " + nombre + " necesita vacuna y desparasitación.");
        } else if (requiereVacuna || requiereDesparasitacion) {
            if (requiereVacuna) {
                System.out.println("La mascota " + nombre + " necesita vacuna.");
            } else {
                System.out.println("La mascota " + nombre + " necesita desparasitación.");
            }
        } else {
            System.out.println("La mascota " + nombre + " no necesita cuidados especiales.");
        }
    }
    
    public void realizarServicio(int opcion) {
        switch (opcion) {
            case 1:
                if (requiereVacuna) {
                    System.out.println("Servicio: Vacunación realizada a " + nombre + ".");
                    requiereVacuna = false;
                } else {
                    System.out.println(nombre + " no necesita vacuna.");
                }
                break;
            case 2:
                if (requiereDesparasitacion) {
                    System.out.println("Servicio: Desparasitación realizada a " + nombre + ".");
                    requiereDesparasitacion = false;
                } else {
                    System.out.println(nombre + " no necesita desparasitación.");
                }
                break;
            case 3:
                System.out.println("Servicio: Control general realizado a " + nombre + ".");
                break;
            default:
                System.out.println("Opción no válida. Elija entre 1, 2 o 3.");
                break;
        }
    }
}
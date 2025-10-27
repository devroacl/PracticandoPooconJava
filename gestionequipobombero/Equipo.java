
package gestionequipobombero;

public abstract class Equipo {
    protected String codigo;
    protected String nombre;
    protected double precioBase;
    protected int anioFabricacion;
    
    //constructor

    public Equipo(String codigo, String nombre, double precioBase, int anioFabricacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
    }
    
    //getters&setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
    //métodos
    public double descuentoAntiguedad(){
        if(anioFabricacion <= 2023){
            return precioBase * 0.10; //descuento si su fabricación fue antes del 2023
        }
        return 0;
    }
    
    public abstract double calcularPrecioFinal();
    
    public void mostrarDatos(){
        System.out.println("Código: "+codigo+
                " | Nombre: "+nombre+
                " | Precio base: $"+precioBase+
                " | Año de fabricación: "+anioFabricacion);
    }
    
}

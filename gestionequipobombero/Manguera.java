
package gestionequipobombero;

public class Manguera extends Equipo implements DescuentoInstitucional{
    private String marca;
    private double longitud;
    private String tipo;

    public Manguera(String marca, double longitud, String tipo, String codigo, String nombre, double precioBase, int anioFabricacion) {
        super(codigo, nombre, precioBase, anioFabricacion);
        this.marca = marca;
        this.longitud = longitud;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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
    
    
    
    //método de la interfaz
    @Override
    public double aplicarDescuentoEspecial(){
        if(marca.equalsIgnoreCase("Angus") && tipo.equalsIgnoreCase("reforzada")){
            return precioBase * DESCUENTO_ESPECIAL;
        }
        return 0;
    }
    
    //métodos heredados
 
    @Override
    public double calcularPrecioFinal(){
        return precioBase - descuentoAntiguedad() - aplicarDescuentoEspecial();
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Marca: "+marca+
                " | Longitud: "+longitud+
                "mts | Tipo: "+tipo);
    }
    
    
}

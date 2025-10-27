
package gestionequipobombero;

public class Uniforme extends Equipo {
    private String talla;
    private String tipo;
    private String material;

    public Uniforme(String talla, String tipo, String material, String codigo, String nombre, double precioBase, int anioFabricacion) {
        super(codigo, nombre, precioBase, anioFabricacion);
        this.talla = talla;
        this.tipo = tipo;
        this.material = material;
    }
    
    @Override
    public double calcularPrecioFinal(){
        double incremento = 0; //inicializamos la variable
        //comprobamos el tipo de uniforme
        if(tipo.equalsIgnoreCase("estructural")){
            incremento = 50000;
        }
        return precioBase - descuentoAntiguedad() + incremento;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Talla: "+talla+
                " | Tipo: "+tipo+
                " | Material: "+material);
    }
}

package minningtech;
public class Perforadoras extends Maquinaria{

    private String tipoPerforacion; //(perforación de barrenos pequeños, perforación de barrenos grandes o perforación de alta precisión)

    public Perforadoras() {
    }

    public Perforadoras(String tipoPerforacion, String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        super(codigo, nombre, tipoCombustible, potencia, diasOperacion);
        this.tipoPerforacion = tipoPerforacion;
    }

    public String getTipoPerforacion() {
        return tipoPerforacion;
    }

    public void setTipoPerforacion(String tipoPerforacion) {
        this.tipoPerforacion = tipoPerforacion;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nPerforadora : Tipo de Perforadoracion "+ tipoPerforacion +"\nCosto por Operacion" + calcularCostoOperacion();
    }

    
    /**
     * Para las perforadoras, si su tipo de perforación es de 
     * alta precisión, se aplica un incremento del 8%.
     * @return 
     */
    
    @Override
    public double calcularCostoOperacion(){
        double costo = super.calcularCostoOperacion();
        
        if(this.tipoPerforacion.equalsIgnoreCase("AltaPrecision")){
            costo= costo +(costo*0.08);
        }
        
        return costo;
    }
    
    
    //Luego corregir y sobrescribir el metodo mostrar 
    @Override
    public void mostrar() {
       System.out.println(toString());
    }
    
    
}

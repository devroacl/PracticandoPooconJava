
package minningtech;
public class Excavadora extends Maquinaria{
    
    private String tipoCuchara; //cuchara de corte- cucharón para material pesado -cucharón para material liviano

    public Excavadora() {
    }


    public Excavadora(String tipoCuchara, String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        super(codigo, nombre, tipoCombustible, potencia, diasOperacion);
        this.tipoCuchara = tipoCuchara;
    }
    
    //Getters&&Setters --- solo los atributos esclusivos de la excavadora 

    public String getTipoCuchara() {
        return tipoCuchara;
    }

    public void setTipoCuchara(String tipoCuchara) {
        this.tipoCuchara = tipoCuchara;
    }

    @Override
    public String toString() {
        return super.toString()+  "\nExcavadora:  " + "tipoCuchara= " + tipoCuchara;
    }

    
    //Metodos 
     //--Calcular costo 
    /**
     * Para las excavadoras, el costo diario aumenta 
     * en un 12% si la cuchara es de corte.
     * @return 
     */
   
    
    @Override
    public double calcularCostoOperacion(){
        double costo = super.calcularCostoOperacion();
        if(this.tipoCuchara.equalsIgnoreCase("cucharacorte")){
            costo= costo + (costo*0.12);
        }return costo;
    }
    
    
    @Override
    public void mostrar(){
        System.out.println(toString()+"\n Costo en USD :"+ calcularCostoOperacion());
    }
    
}

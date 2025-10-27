
package minningtech;

// Clase base abstracta: La clase principal que represente a las máquinas debe ser una clase abstracta. 
//Es la SuperClase para los tipos de maquina

public  abstract class Maquinaria implements Icobradora{
    
    protected String codigo, nombre, tipoCombustible;
    protected int potencia, diasOperacion;

    public Maquinaria() {
    }

    public Maquinaria(String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
        this.diasOperacion = diasOperacion;
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

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getDiasOperacion() {
        return diasOperacion;
    }

    public void setDiasOperacion(int diasOperacion) {
        this.diasOperacion = diasOperacion;
    }

    @Override
    public String toString() {
        return "Maquinaria{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipoCombustible=" + tipoCombustible + ", potencia=" + potencia + ", diasOperacion=" + diasOperacion + '}';
    }

    
    public double calcularCostoOperacion() {
        return this.diasOperacion*COSTO_DIA_OPERACION;
    }
    
    //Metodo abstracto 
    public abstract void mostrar();
    
}

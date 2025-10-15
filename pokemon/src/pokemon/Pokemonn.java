package pokemon;

public class Pokemonn {
   
    private String nombre;
    private Tipo tipo; 
    
    private int vida; 

    public Pokemonn() {
    }

    public Pokemonn(String nombre, Tipo tipo, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
    public void Imprmir(){
        System.out.println("nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Vida: "+vida);
    }
    
    
    
}

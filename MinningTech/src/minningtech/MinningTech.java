
package minningtech;

public class MinningTech {

    
    public static void main(String[] args) {
                
        //--Registrar 3 excavadoras, 3 camiones mineros y 2 perforadoras en el sistema. 

         // creo objetos del tipo de las clases derivadas
          Excavadora m01 = new Excavadora("cucharaCorte", "M01", "Gran Caterpila", "Diesel", 500, 3);
          Excavadora m02 = new Excavadora("cucharonMatLiviano", "M02", "Jonh Dere", "Bencina 95", 700, 1);
          Excavadora m03 = new Excavadora("cucharonMatPesado", "M03", "SuperExcavadora", "Diesel", 1000, 4);
          Camion m04 = new Camion(30, "M04", "OptimusPrime", "Diesel", 500, 5);
          Camion m05 = new Camion(50, "M05", "Tolva", "Bencina 93", 600, 10);
          Perforadoras m06 = new Perforadoras("barrenosXS", "M06", "Perforin", "Bencina 97", 250, 1);
          Perforadoras m07 = new Perforadoras("altaPrecision", "M07", "Perforota", "Diesel", 850, 3);


          ClaseGestora r = new ClaseGestora();

          r.agregarMaquina(m01);
           r.agregarMaquina(m02);
            r.agregarMaquina(m03);
             r.agregarMaquina(m04);
              r.agregarMaquina(m05);
               r.agregarMaquina(m06);
           r.agregarMaquina(m07);


           r.listarMaquinarias();

                   System.out.println("Listar por tipo\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                   r.listarMaquinasporTipo("camion");
                   r.listarMaquinasporTipo("Perforadora");
                   
                   r.listarMaquinarias();


                   r.cantidadMaquinas();

                   r.eliminarMaquina("M06");
                   r.cantidadMaquinas();


      }
    
}

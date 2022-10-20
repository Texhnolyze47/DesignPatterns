package builder;

public class CocheBuilder {

    Vehiculo vehiculo;

    public CocheBuilder(String marca){
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }
    /**
     * Estos metodos devuelven su propia instancia
     */
    public CocheBuilder setPuertas(int puertas){
         vehiculo.puertas = puertas;
         // que quiere decir this
        // Esta instancia de mi clase
        // esta funcion se devuelve a si misma
         return this;
    }


    public CocheBuilder setMotor(String motor){
        vehiculo.motor = motor;
        // que quiere decir this
        // Esta instancia de mi clase
        // esta funcion se devuelve a si misma
        return this;
    }


    public  Vehiculo build(){
        return this.vehiculo;
    }
}

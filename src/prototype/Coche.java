package prototype;

public class Coche implements Cloneable {

    public String marca;
    public String modelo;
    public int puertas;

    public  Coche(){

    }

    /**
     * Forma manual
     * @return
     */

//    public Coche colar(){
//        Coche clon = new Coche();
//
//        clon.marca = marca;
//        clon.modelo = modelo;
//        clon.puertas =puertas;
//
//        return clon;
//    }

    public Coche colar() throws CloneNotSupportedException{
    return (Coche)this.clone();
    }
}

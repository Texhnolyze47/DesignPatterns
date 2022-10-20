package prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.puertas = 5;
        coche.modelo = "Filostros";
        coche.marca = "Coupe";

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);
    try{
        Coche clonado = coche.colar();
        clonado.puertas = 3;
        System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);


    }catch (CloneNotSupportedException ex){
        System.out.println("No se puede clonar: " + ex.getMessage());
    }

    }
}

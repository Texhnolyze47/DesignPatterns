package builder;

public class Main {

    public static void main(String[] args) {
        //Vehiculo vehiculo = new Vehiculo();
       // vehiculo.setMarca("Filostro");
       // vehiculo.setMotor("Diesel");
        // vehiculo.setTipo("Combustion");
        // vehiculo.setPuertas(5);

        //programacion fluida

        Vehiculo coche = new CocheBuilder("Filostro")
                .setPuertas(5)
                .setMotor("Electrico")
                .build();

        System.out.println("Marcas " + coche.getMarca());
        System.out.println("puertas " + coche.getPuertas());
        System.out.println("tipo " + coche.getMotor());

        // Ejemplo de un patron builder que se puede usar en java
        StringBuilder cadena = new StringBuilder("Hola");
        cadena.append(" amigos").append(" del").append(" curso");

        System.out.println(cadena);

    }
}

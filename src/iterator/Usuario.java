package iterator;

public class Usuario {
    private String nombre;
    private int edad;
    // esto es para evitar el uso de un construtor vacio
    private Usuario(){}

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){ return  edad; }
}

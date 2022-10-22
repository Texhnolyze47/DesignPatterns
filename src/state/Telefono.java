package state;

public class Telefono {
    public Estado estado;

    public Telefono(){
        estado = new EstadoBloqueado(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void cambioEstado (Estado estado) {
        System.out.println("Estado incial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: "  + this.estado.getClass().getName());
    }
}

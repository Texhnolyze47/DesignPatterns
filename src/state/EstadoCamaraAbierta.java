package state;

public class EstadoCamaraAbierta extends Estado {

    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono);
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La camara ya la habia abierto";
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Ya esta desbloqueada el movil";
    }

    @Override
    public String tomarFoto() {
        telefono.cambioEstado(new EstadoHacerFoto(telefono));
        return "La foto se va a dispara ya";
    }
}

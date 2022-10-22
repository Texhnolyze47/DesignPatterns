package state;

public class EstadoHacerFoto extends Estado {

    public EstadoHacerFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String abrirCamara() {
        return "El movil ya esta desbloqueado";
    }

    @Override
    public String desbloquear() {
        return "La camara ya la habias abierto";
    }

    @Override
    public String tomarFoto() {
        telefono.cambioEstado(new EstadoBloqueado(telefono));
        return "La foto ya ha sido tomada";
    }
}

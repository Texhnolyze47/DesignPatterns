package state;

public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La camara esta bloqueda. Desbloquea el movil antes";
    }

    @Override
    public String desbloquear() {
        telefono.cambioEstado( new EstadoDesbloqueado(telefono));
        return "desbloquear(): movil desbloquedo, procede ";
    }

    @Override
    public String tomarFoto() {
        return "tomarFoto() La camara esta bloqueda. Desbloquea el movil antes";
    }
}

package state;

public class EstadoDesbloqueado extends Estado {

    public EstadoDesbloqueado(Telefono telefono){
        super(telefono);
    }

    @Override
    public String abrirCamara() {
        telefono.cambioEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): camara abierta, puedes hacer la foto";
    }

    @Override
    public String desbloquear() {
        return "El movil ya estaba desbloquedo. ";

    }

    @Override
    public String tomarFoto() {
        return "tomarFoto(): no se puede hacer una foto sin abrir la camara";
    }
}

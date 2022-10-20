package Decorator;

public class TelefonoDecorator implements Telefono {
    private Telefono telefono;

    public TelefonoDecorator(Telefono telefono){
        this.telefono = telefono;
    }
    @Override
    public void crea() {
        this.telefono.crea();
    }
}

package Decorator;

public class TelefonoNextGen extends TelefonoDecorator{
    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crea() {
        super.crea();
        System.out.println("  -> nextgen: Tengo tambien 5G ");
        System.out.println("  -> nextgen: Tengo tambien Volte ");

    }
}

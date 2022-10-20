package Decorator;

public class TelefonoInteligente extends TelefonoDecorator  {
    public TelefonoInteligente(Telefono telefono){
        super(telefono);
    }

    @Override
    public void crea() {
        // usa el metodo del telefonoDecorator
        super.crea();
        System.out.println("  -> Inteligente: Tengo tambien 4G");
    }
}

package Decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crea() {
        System.out.println("Soy un telefono basico. Tengo estas Características");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println(" -> Basico: Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println(" -> Basico: Tengo SMS");
    }
}

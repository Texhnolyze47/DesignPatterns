package Decorator;

public class Main {
    public static void main(String[] args) {
//        TelefonoBasico telefonoBasico = new TelefonoBasico();
//        telefonoBasico.crea();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crea();
        TelefonoNextGen tng =  new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        tng.crea();

    }
}

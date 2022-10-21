package mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorConcreto();

        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();

        mediator.registro(colega1);
        mediator.registro(colega2);
        mediator.registro(colega3);
         // A diferencia del patron observer
        // en este patron mas de uno puede hablar
        colega1.envia();
        colega2.envia();
        colega3.envia();
    }
}

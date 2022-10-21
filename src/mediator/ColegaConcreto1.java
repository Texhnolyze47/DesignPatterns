package mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recido un mensaje, soy ColegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto1, envia un mensaje");
        mediator.reenvia(this);
    }
}

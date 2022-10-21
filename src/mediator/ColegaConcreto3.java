package mediator;

public class ColegaConcreto3 extends  Colega {

    void recibe() {
        System.out.println("He recido un mensaje, soy ColegaConcreto3");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto3, envia un mensaje");
        mediator.reenvia(this);
    }
}

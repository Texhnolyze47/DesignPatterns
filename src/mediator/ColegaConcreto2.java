package mediator;

public class ColegaConcreto2 extends  Colega {

    void recibe() {
        System.out.println("He recido un mensaje, soy ColegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto2, envia un mensaje");
        mediator.reenvia(this);
    }
}

package mediator;

import java.util.ArrayList;

public class MediatorConcreto extends Mediator {

    ArrayList <Colega> colegas = new ArrayList();
    @Override
    void registro(Colega colega) {

        if (!colegas.contains(colega)) {
            colegas.add(colega);
            // hace referencia a la instancia
            // de la clase actual
            colega.setMediator(this);
        }
        colegas.add(colega);
    }

    @Override
    void reenvia(Colega colega) {
        for (Colega actual : colegas) {
            // verifica de no mandar el mensaje
            // al emisor
            if (!actual.equals(colega)){
            actual.recibe();
            }

        }
    }
}

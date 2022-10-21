package observer;

public class Main {
    public static void main(String[] args) {
                Emisora emisora = new Emisora();

                ReceptorTv receptorTv = new ReceptorTv();
                ReceptorRadio radio = new ReceptorRadio();
                ReceptorSatelite satelite =  new ReceptorSatelite();

                emisora.meteReceptor(receptorTv);
                emisora.meteReceptor(radio);
                emisora.meteReceptor(satelite);

                emisora.emite();
    }
}

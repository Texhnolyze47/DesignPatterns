package singleton;

public class Main {
    public static void main(String[] args) {
        Aplicacion app = Aplicacion.getInstance(); // new Aplicaction
        Aplicacion app2 = Aplicacion.getInstance(); // app2 = app

        app.Run();
        app2.Run();

        System.out.println(app + " " + app2);
    }
}

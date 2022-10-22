package state;

public class Main {
    public static void main(String[] args) {
        Telefono telefono1 = new Telefono();


        //System.out.println(telefono1.estado.tomarForo());
        //System.out.println(telefono1.estado.abrirCamara());
        //System.out.println(telefono1.estado.desbloquear());
        //System.out.println(telefono1.estado.abrirCamara());
        //System.out.println(telefono1.estado.tomarForo());
        System.out.println(telefono1.estado.desbloquear());
        System.out.println(telefono1.estado.abrirCamara());
        System.out.println(telefono1.estado.tomarFoto());


    }
}

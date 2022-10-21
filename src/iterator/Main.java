package iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 50));
        usuarios.crear(new Usuario("dos", 20));
        usuarios.crear(new Usuario("tres", 20));
        usuarios.crear(new Usuario("cuatro", 10));
        usuarios.crear(new Usuario("cinco", 20));
        usuarios.crear(new Usuario("seis", 8));

        while (usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println("Usuario es: " + usuario.getNombre());
        }
        usuarios.crear(new Usuario("siete",12));
        Usuario usuario = usuarios.next();
        System.out.println("Usuario es: " + usuario.getNombre());

    }
}

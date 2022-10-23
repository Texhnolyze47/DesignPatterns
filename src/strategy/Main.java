package strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        UsuariosMemoria usuariosMemoria = new UsuariosMemoria();
//
//        usuariosMemoria.crear("fulano");
//        usuariosMemoria.crear("pepe");
//
//        for (String usuario: usuariosMemoria.listar()) {
//            System.out.println(usuario);
//        }
//        UsuariosFichero usuariosFichero = new UsuariosFichero();
//
//        usuariosFichero.crear("fulano");
//        usuariosFichero.crear("pepe");
//
//        for (String usuario : usuariosFichero.listar()) {
//            System.out.println(usuario);
//        }

        UsuariosMemoria usuarios = new UsuariosMemoria();

        crear(usuarios, "etech");
        crear(usuarios, "pepe");
        crear(usuarios, "tilin");

        for (String usuario: usuarios.listar()) {
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuario, String nombre){
        usuario.crear(nombre);
    }

    public static ArrayList <String> listar(Usuarios usuarios){
        return usuarios.listar();
    }

}

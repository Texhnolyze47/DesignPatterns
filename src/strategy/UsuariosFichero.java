package strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios {
    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero(){
        try {
            fichero = new PrintStream(ficheroUsuarios);
        }catch (Exception e){
            System.out.println("No puedo abrirlo " + e.getMessage());
        }
    }
    @Override
    public  void crear(String nombres){
        //guarda en fichero de texto
        fichero.println(nombres);
    }
    @Override
    public ArrayList <String> listar(){
        ArrayList<String> usuarios = new ArrayList();
        try {
            Scanner sc = new Scanner(new File(ficheroUsuarios));
            while (sc.hasNext()){
                usuarios.add(sc.next());
            }
            sc.close();
        }catch (Exception e){
            System.out.println("Error leyendo: " + e.getMessage());
        }
        return usuarios;

    }
}

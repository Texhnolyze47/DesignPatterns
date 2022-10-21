package iterator;

public interface UsuarioIterator {
    // Obtiene el siguiente
    Usuario next();
    // Reinicia el contador
    void reset();
    // hay mas usuario en el iterador
    boolean hasMore();

}

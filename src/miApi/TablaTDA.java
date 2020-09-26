package miApi;

public interface TablaTDA {
	/**
	 * Esta operaci�n agrega un elemento nuevo a la tabla, donde el c�digo corresponde a 
	 * la cantidad de elementos de la tabla antes de ingresar un nuevo nombre. Los c�digos ser�n �nicos y consecutivos.
	 * @precond El nombre no debe existir previamente en la tabla. 
	 * @precond La tabla debe estar inicializada.
	 * @param nombre
	 */
    void agregar(String nombre);
    
    /**
     *  Esta operaci�n permite saber si un nombre ya fue ingresado a la tabla. 
     *  @precond La tabla debe estar inicializada.
     * @param codigo
     * @return si el elemento existe en la tabla o no.
     */
    boolean pertenece(int codigo);
    
    int codigo(String nombre);
    
    ColaTDA tabla();
    
    void ordenarNombres();
    
    void ordenarCodigos();
    
    boolean estaVacia();
}

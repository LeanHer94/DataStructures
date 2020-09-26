package miApi;

public interface PilaTDA {
	
	
	
	/**
	 * Agrega un elemento. 
	 * @precond La estructura debe estar inicializada
	 * @param x
	 */
	
	
    void apilar(int x);

    
    
    
    /**
     * Elimina el �ltimo elemento agregado. 
     * @precond La estructura no debe estar vac�a
     */
    
    void desapilar();

    
    
    /**
     * Obtiene el primer elemento a eliminar (no se elimina). 
     * @precond La estructura no debe estar vac�a
     * @return elemento a eliminar
     */
    
    int tope();
    
    
    
    /**
     *  Indica si la pila no contiene elementos.
     *  @precond La estructura debe estar inicializada.
     *  @return Boolean
     */

    boolean pilaVacia();
 
       
    
    
    /**
     * Inicializa la estructura pila.
     */
    void inicializarPila();
}

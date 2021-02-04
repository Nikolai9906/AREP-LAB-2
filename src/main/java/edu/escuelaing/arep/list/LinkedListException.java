package edu.escuelaing.arep.list;

/**
 * Clase encargada de manejar las excepciones de la lista
 * @author Nikolai Bermudez V
 */
public class LinkedListException extends Exception{
    private static final long serialVersionUID = 1L;
    public static final String index= "index out of range";

    public LinkedListException( String message) {
        super(message);
    }
}

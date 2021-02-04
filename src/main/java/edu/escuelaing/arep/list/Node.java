package edu.escuelaing.arep.list;

/**
 * Clase encargada en crear un nodo y enlazarlo a otro
 * @author Nikolai Bermudez V
 */
public class Node {

    Object value;
    Node next;

    /**
     * Constructor para el nodo
     * @param value Valor que tendra nuestro nodo
     */
    public Node(Object value){

        this.value = value;
        this.next = null;
    }

    /**
     * Método encargado en retornar el valor del nodo
     * @return Valor guardado en el nodo
     */
    public Object getValue(){ return value;}

    /**
     * Método encargado en enlazar un nodo a otro
     * @param nextNode Valor del siguiente nodo
     */
    public void linkNext(Node nextNode){
        next = nextNode;
    }

    /**
     * Método encargado en retornar el valor del siguiente nodo
     * @return Valor guardado en el siguiente nodo
     */
    public Node getNext(){
        return next;
    }
}

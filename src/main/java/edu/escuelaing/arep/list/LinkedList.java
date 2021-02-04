package edu.escuelaing.arep.list;

/**
 * Esta clase es la encargada de enlazar a los nodos
 * @author Nikolai Bermudez V
 *
 */
public class LinkedList {

    Node head;
    int size;

    /**
     * Constructor para la lista
     */
    public LinkedList(){
        head = null;
        size = 0;
    }

    /**
     * Metodo encargado de crear y unir los nodos en forma de pila
     * @param obj Valor a guardar en el Nodo
     */
    public void addFirst(Object obj){
        if(head == null){
            head = new Node(obj);
        }else{
            Node tem = head;
            Node newNode = new Node(obj);
            newNode.linkNext(tem);
            head = newNode;
        }
        size = size + 1;
    }

    /**
     * Método encargado en eliminar el primer nodo y unir los demás
     */
    public void deleteFirst(){
        head = head.getNext();
        size = size - 1;
    }

    /**
     * Método encargado en eliminar cualquier nodo de la lista y unir los demás
     * @param index Posición del nodo que se eliminara
     */
    public void deleteNode(int index){
        int count = 0;
        Node temp = head;
        if( index == 0){
            head = head.getNext();
        }else{
            while (count < index-1){
                temp = temp.getNext();
                count = count + 1;
            }
            temp.linkNext(temp.getNext().getNext());
        }
        size = size - 1;
    }

    /**
     * Método encargado de cortar la lista desde cierto punto
     * @param index Posición donde se cortara la lista
     */
    public void cut(int index){
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        int count = 0;
        Node temp = head;
        while (count < index - 1){
            temp = temp.getNext();
            count = count +1;
        }
        temp.linkNext(null);
        size = index;
    }

    /**
     * Método encargado de indicarnos si la lista esta vaciá o no
     * @return Valor booleano
     */
    public boolean isEmpty(){
        return (head == null)?true:false;
    }

    public Double getNodeValue(int index){
        int count = 0;
        Node temp = head;
        Double value = null;
        while (count < index){
            temp = temp.getNext();
            count = count + 1;
        }
        value = (Double) temp.getValue();
        return value;

    }

    /**
     * Método encargado de decirnos de que tamaño es la lista
     * @return Valor sobre el tamaño de la lista
     */
    public int getSize(){
        return size;
    }


}

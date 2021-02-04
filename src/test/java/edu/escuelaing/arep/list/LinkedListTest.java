package edu.escuelaing.arep.list;

import junit.framework.TestCase;

import java.util.ArrayList;
import org.junit.Test;

/**
 * Pruebas unitarias sobre listas enlazadas
 */
public class LinkedListTest extends TestCase{

    /**
     * Prueba encargada de verificar que la lista conozca todos sus vecinos
     */
    @Test
    public void testNeighbors() {
        LinkedList linkedList = new LinkedList();
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add((double) 10);
        testList.add((double) 20);
        testList.add((double) 30);
        testList.add((double) 40);
        linkedList.addFirst((double) 40);
        linkedList.addFirst((double) 30);
        linkedList.addFirst((double) 20);
        linkedList.addFirst((double) 10);
        for (int i = 0; i < 4; i++) {
            assertEquals(linkedList.getNodeValue(i), testList.get(i));
        }
    }

    /**
     * Prueba encargada de verificar que la lista enlazada conoce su nodo (cabeza)
     */
    @Test
    public void testHead(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst((double) 10);
        assertEquals(linkedList.getNodeValue(0), (double) 10);
    }

    /**
     * Prueba encargada de verificar que la lista enlazada conoce su ultimo nodo (cola)
     */
    @Test
    public void testBottom(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst((double) 10);
        linkedList.addFirst((double) 20);
        linkedList.addFirst((double) 30);
        linkedList.addFirst((double) 40);
        assertEquals(linkedList.getNodeValue(linkedList.getSize()-1), (double) 10);
    }

}
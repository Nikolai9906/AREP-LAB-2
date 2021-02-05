package edu.escuelaing.arep.stat;
import edu.escuelaing.arep.list.LinkedListException;
import junit.framework.TestCase;
import org.junit.Test;

public class StatTest extends TestCase {

    /**
     * Constructor de la clase de pruebas StatTest
     * @param testName nombre de la prueba a ejecutar
     */
    public StatTest(String testName){
        super (testName);
    }

    /**
     * Prueba encargada de evaluar la media con unos valores manualmente insertados
     */
    @Test
    public void testMean() {
        Stat data = new Stat();
        data.addNumber(15.0);
        data.addNumber(69.9);
        data.addNumber(6.5);
        data.addNumber(22.4);
        data.addNumber(28.4);
        data.addNumber(65.9);
        data.addNumber(19.4);
        data.addNumber(198.7);
        data.addNumber(38.8);
        data.addNumber(138.2);
        try {
            assertEquals(data.mean(), 60.32);
        } catch (LinkedListException e) {
            assertTrue(false);
        }
    }

    /**
     * Prueba encargada de evaluar la media con unos valores provenientes de un documento
     */
    @Test
    public void testMeanFile() {
        Stat data = new Stat("numbersFile.txt");
        try {
            assertEquals(data.mean(), 550.6);
        } catch (LinkedListException e) {
            assertTrue(false);
        }

    }

    /**
     * Prueba encargada de evaluar la desviación estándar con unos valores manualmente insertados
     */
    @Test
    public void testStddev() {
        Stat data = new Stat();
        data.addNumber(15.0);
        data.addNumber(69.9);
        data.addNumber(6.5);
        data.addNumber(22.4);
        data.addNumber(28.4);
        data.addNumber(65.9);
        data.addNumber(19.4);
        data.addNumber(198.7);
        data.addNumber(38.8);
        data.addNumber(138.2);
        try {
            assertEquals(data.stddev(), 62.26);
        } catch (LinkedListException e) {
            assertTrue(false);
        }
    }
    /**
     * Prueba encargada de evaluar la desviación estándar con unos valores provenientes de un documento
     */
    @Test
    public void testStddevFile() {
        Stat data = new Stat("numbersFile.txt");
        try {
            assertEquals(data.stddev(), 572.03);
        } catch (LinkedListException e) {
            assertTrue(false);
        }
    }



}
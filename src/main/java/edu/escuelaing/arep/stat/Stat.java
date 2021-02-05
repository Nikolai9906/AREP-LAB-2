package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.list.LinkedList;
import edu.escuelaing.arep.list.LinkedListException;

import java.io.File;
import java.util.Scanner;

/**
 * Clase que se encarga de hacer los cálculos y crear la lista
 * @author Nikolai Bermudez V
 */
public class Stat {

    private LinkedList data;

    /**
     * Constructor de la clase App encargada de crear una lista enlazada
     */
    public Stat(){
        data = new LinkedList();
    }

    /**
     * Constructor de la clase App encargada de crear la lista a partir del nombre de un archivo
     * @param nameFile nombre del documento para leer datos
     */
    public Stat(String nameFile){
        data = new LinkedList();
        Scanner file = null;
        try {
            file = new Scanner(new File(nameFile));
        }catch (Exception e){
            System.out.println("Archivo no encontrado");
        }
        int integerNumber = 0;
        double doubleNumber;
        while(file.hasNext()){
            integerNumber = file.nextInt();
            doubleNumber = (double) integerNumber;
            data.addFirst(doubleNumber);
        }
    }

    /**
     * Método encargado de agregar un dato a la lista
     * @param number valor del dato que se agregara
     */
    public void addNumber(double number){
        data.addFirst(number);
    }

    /**
     * Método encargado de calcular el promedio de los elementos de la lista
     * @return promedio calculado
     * @throws LinkedListException
     */
    public Double mean() throws LinkedListException {
        double additionData =  0;
        for (int i = 0; i < data.getSize(); i++){
            additionData = additionData + data.getNodeValue(i);
        }
        double result = approach(additionData / data.getSize(),2);
        return result;
    }

    /**
     * Método encargado de calcular la desviación estándar de los elementos de la lista
     * @return La desviación estándar
     * @throws LinkedListException
     */
    public Double stddev() throws LinkedListException{
        double additionData = 0;
        double mean = mean();
        for(int i = 0; i < data.getSize(); i++){
            additionData = additionData + Math.pow((data.getNodeValue(i)-mean),2);
        }
        double result = approach(Math.sqrt(additionData/(data.getSize()-1)),2);
        return result;
    }

    /**
     * Método encargado de aproximar a dos cifras un valor
     * @param number Valor a aproximar
     * @param digits Numero decimales para aproximar
     * @return Valor aproximado
     */
    private static double approach(double number, int digits){
        double result;
        result = number * Math.pow(10,digits);
        result = Math.round(result);
        result = result / Math.pow(10,digits);
        return (Double) result;
    }

    public LinkedList readJson(String jsonDoc){
        data = new LinkedList();
        String[] jList = jsonDoc.replace("\"", "").replace("]", "").replace("[", "").split(",");
        for (int i = 0; i < jList.length; i++){
            double value = Double.parseDouble(jList[i]);
            data.addFirst(value);
        }
        return data;
    }
}

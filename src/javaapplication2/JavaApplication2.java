package javaapplication2;

import java.util.HashMap;

public class JavaApplication2 {

    public static void main(String[] args) {
       
        int[] vector = {1, 4, 7, 1, 1, 8, 4, 1, 4, 9};
        
        Histogram histo = new Histogram(vector);
        HashMap <Integer, Integer> histogram = histo.getHisto();
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
            
        }
    
    }
}

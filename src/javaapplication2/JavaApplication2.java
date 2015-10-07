package javaapplication2;

import java.util.HashMap;

public class JavaApplication2 {

    public static void main(String[] args) {
       
        Integer[] vector = {1, 4, 7, 1, 1, 8, 4, 1, 4, 9};
        
        String[] vector1 = {"Ana", "Juan", "Pedro", "Lucia", "Pedro", "Lucia"};
        
        Histogram histo = new Histogram(vector1);
        HashMap <Object, Integer> histogram = histo.getHisto();
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
            
        }
    
    }
}

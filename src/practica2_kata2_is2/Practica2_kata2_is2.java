package practica2_kata2_is2;

import java.util.Iterator;
import java.util.Map;


public class Practica2_kata2_is2 {

    
    public static void main(String[] args) {
        String [] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histogr = new Histogram(data);
        
        Map<String,Integer> histogram = histogr.getHistogram();
       
        Iterator<Map.Entry<String, Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}

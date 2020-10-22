package practica2_kata2_is2;

import java.util.HashMap;
import java.util.Map;

class Histogram<T> {
    
    private final T [] data;

    public Histogram(T [] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    Map<T, Integer> getHistogram(){
        Map<T,Integer> histogram = new HashMap<>();
        
        for (T data1 : data) {
            histogram.put(data1, histogram.containsKey(data1) ? histogram.get(data1) + 1 : 1);
        }
        return histogram;
    }
    
}

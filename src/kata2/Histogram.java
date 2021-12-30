package kata2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    public Map getHistogram(){
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        for (T i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }
}
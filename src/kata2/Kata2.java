
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author Entrar
 */
public class Kata2 {


    public static void showMe(Map map){
        Iterator<Map.Entry<Integer, Integer>> entries1 = map.entrySet().iterator();

        while (entries1.hasNext()) {

            Map.Entry<Integer, Integer> entry
                    = entries1.next();

            System.out.println("M3a: Key =" + entry.getKey()
                    + ", Value = " + entry.getValue());

        }
    }
    
    public static void main(String[] args) {
        
        Integer[] data = {2,3,7,2,4,5,1,22,44,67,5,5,3,22,8};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        Kata2.showMe(histogr);
    }

}
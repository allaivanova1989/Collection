import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServiForArray {
    public  String mostFrequent(ArrayList<Integer> ArrayList) {

        if (ArrayList == null || ArrayList.isEmpty())
            return null;

        Map<Integer, Integer> counterMap = new HashMap<>();
        Integer maxValue = 0;
        Integer mostFrequentValue = null;

        for(Integer valueAsKey : ArrayList) {
            Integer counter = counterMap.get(valueAsKey);
            counterMap.put(valueAsKey, counter == null ? 1 : counter + 1);
            counter = counterMap.get(valueAsKey);
            if (counter > maxValue) {
                maxValue = counter;
                mostFrequentValue = valueAsKey;
            }
        }
        return "The number " + mostFrequentValue + " is repeated " + maxValue + " times";

    }
}

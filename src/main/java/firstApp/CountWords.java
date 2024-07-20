package firstApp;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public void countWords(String str) {
        HashMap<String, Integer> wordsCounter = new HashMap<>();
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (wordsCounter.containsKey(word)) {
                wordsCounter.put(word, wordsCounter.get(word) + 1);
            } else {
                wordsCounter.put(word, 1);
            }
        }
        for (Map.Entry<String,Integer> entry : wordsCounter.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }


}

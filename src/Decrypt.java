import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Decrypt {
    private File file;
    private HashMap<Character, Integer> map;

    public Decrypt(File file, HashMap<Character, Integer> map) {
        this.file = file;
        this.map = map;
    }

    public HashMap<Character, Character> decrypt1() throws IOException {
        HashMap<Character, Character> sorted = new HashMap<>();
        int i = 0;
        //Sort the hashmap in an array
        List<Map.Entry<Character, Integer>> arr = new LinkedList<>(map.entrySet());
        Collections.sort(arr, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //replace the most frequently use letters with known freq used letters
        sorted.put(arr.get(i++).getKey(), 'E');
        sorted.put(arr.get(i++).getKey(), 'T');
        sorted.put(arr.get(i++).getKey(), 'A');
        sorted.put(arr.get(i++).getKey(), 'O');
        sorted.put(arr.get(i++).getKey(), 'N');
        sorted.put(arr.get(i++).getKey(), 'S');
        sorted.put(arr.get(i++).getKey(), 'I');
        sorted.put(arr.get(i++).getKey(), 'R');
        sorted.put(arr.get(i++).getKey(), 'H');
        sorted.put(arr.get(i++).getKey(), 'L');
        sorted.put(arr.get(i++).getKey(), 'D');
        sorted.put(arr.get(i++).getKey(), 'C');
        sorted.put(arr.get(i++).getKey(), 'M');
        sorted.put(arr.get(i++).getKey(), 'U');
        sorted.put(arr.get(i++).getKey(), 'W');
        sorted.put(arr.get(i++).getKey(), 'F');
        sorted.put(arr.get(i++).getKey(), 'B');
        sorted.put(arr.get(i++).getKey(), 'G');
        sorted.put(arr.get(i++).getKey(), 'P');
        sorted.put(arr.get(i++).getKey(), 'Y');
        sorted.put(arr.get(i++).getKey(), 'V');
        sorted.put(arr.get(i++).getKey(), 'K');
        sorted.put(arr.get(i++).getKey(), 'Q');
        sorted.put(arr.get(i++).getKey(), 'X');
        sorted.put(arr.get(i++).getKey(), 'J');
        sorted.put(arr.get(i++).getKey(), 'Z');

        sorted.forEach((key, value) -> System.out.println(key + ":" + value));
        return sorted;
    }

    public HashMap<Character, Character> decrypt2() throws IOException {
        HashMap<Character, Character> sorted = new HashMap<>();
        int i = 0;
        //Sort the hashmap in an array
        List<Map.Entry<Character, Integer>> arr = new LinkedList<>(map.entrySet());
        Collections.sort(arr, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //replace the most frequently use letters with known freq used letters
        sorted.put(arr.get(i++).getKey(), 'E');
        sorted.put(arr.get(i++).getKey(), 'T');
        sorted.put(arr.get(i++).getKey(), 'A');
        sorted.put(arr.get(i++).getKey(), 'R');
        sorted.put(arr.get(i++).getKey(), 'O');
        sorted.put(arr.get(i++).getKey(), 'I');
        sorted.put(arr.get(i++).getKey(), 'N');
        sorted.put(arr.get(i++).getKey(), 'S');
        sorted.put(arr.get(i++).getKey(), 'H');
        sorted.put(arr.get(i++).getKey(), 'D');
        sorted.put(arr.get(i++).getKey(), 'L');
        sorted.put(arr.get(i++).getKey(), 'G');
        sorted.put(arr.get(i++).getKey(), 'M');
        sorted.put(arr.get(i++).getKey(), 'F');
        sorted.put(arr.get(i++).getKey(), 'U');
        sorted.put(arr.get(i++).getKey(), 'C');
        sorted.put(arr.get(i++).getKey(), 'W');
        sorted.put(arr.get(i++).getKey(), 'B');
        sorted.put(arr.get(i++).getKey(), 'P');
        sorted.put(arr.get(i++).getKey(), 'Y');
        sorted.put(arr.get(i++).getKey(), 'V');
        sorted.put(arr.get(i++).getKey(), 'K');
        sorted.put(arr.get(i++).getKey(), 'J');
        sorted.put(arr.get(i++).getKey(), 'Z');
        sorted.put(arr.get(i++).getKey(), 'Q');
        sorted.put(arr.get(i++).getKey(), 'X');

        sorted.forEach((key, value) -> System.out.println(key + ":" + value));
        return sorted;
    }
}

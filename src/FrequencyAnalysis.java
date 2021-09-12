import java.io.*;
import java.util.*;

public class FrequencyAnalysis {
    private static File file1 = new File("resources/ciphertext.txt");
    private static File file2 = new File("resources/ciphertext-o2.txt");
    private static File output1 = new File("resources/output1.txt");
    private static File output2 = new File("resources/output2.txt");
    private static HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
    private static HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
    private static HashMap<Character, Character> sorted1 = new HashMap<>();
    private static HashMap<Character, Character> sorted2 = new HashMap<>();
    private static double sum1 = 0;
    private static double sum2 = 0;

    public static void main(String[] args) throws IOException {
        // file 1
        Analyze analyze1 = new Analyze(file1, map1); //create Analyze object to analyze ciphertext.txt
        analyze1.analysis(file1); //analyze ciphertext.txt
        sum1 = analyze1.getSum(); //get the sum
        map1.forEach((key, value) -> System.out.println(key + " : " + analyze1.getFreq(key, sum1))); //calc frequency
        Decrypt decrypt1 = new Decrypt(file1, map1); //create Decrypt object
        sorted1 = decrypt1.decrypt1(); //decrypt using key made by freq analysis
        printMap(sorted1, file1, output1); //rewrite file
        //file 2
        Analyze analyze2 = new Analyze(file2, map2); //create Analyze object to analyze ciphertext.txt
        analyze2.analysis(file2);
        sum2 = analyze2.getSum();
        map2.forEach((key, value) -> System.out.println(key + " : " + analyze2.getFreq(key, sum2)));
        map1.forEach((key, value) -> System.out.println(key + ":" + value));
        map2.forEach((key, value) -> System.out.println(key + ":" + value));
        Decrypt decrypt2 = new Decrypt(file2, map2);
        sorted2 = decrypt2.decrypt2();
        printMap(sorted2, file2, output2);
    }

    /**
     * Rewrite the cipher into plaintext
     */
    public static void printMap(HashMap<Character, Character> sorted, File input, File output) throws IOException {
        FileWriter fw = new FileWriter(output);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())  {
            String line = scanner.nextLine();
            for ( HashMap.Entry<Character, Character> entry : sorted.entrySet()) {
                String key = entry.getKey().toString();
                String rep = entry.getValue().toString();
                line = line.replaceAll(key, rep);
            }
            fw.write(line + "\n");
        }
        fw.close();
    }
}

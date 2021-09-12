import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Analyze {
    private File file;
    private HashMap<Character, Integer> map;
    private double sum = 0;

    public Analyze(File file, HashMap<Character, Integer> map) {
        this.file = file;
        this.map = map;
        this.sum = 0;
    }

    public void analysis(File file) throws IOException {
        Scanner scanner = new Scanner(file); //create scanner
        while (scanner.hasNext())  { //while scanner has a next line
            String line = scanner.nextLine(); //convert line to String
            line = line.replaceAll(" ", ""); //remove all the spaces
            for (int i = 0; i < line.length(); i++){ //iterate through the string
                char c = line.charAt(i); //get each character
                Integer val = map.get(c); //get the previously calculated total of current character
                if (val != null) {  //check if the current character already has a total
                    map.put(c, new Integer(val + 1)); //add 1 to the values for current character
                } else { //if current character is new add it to the map
                    map.put(c, 1);
                }
            }
        }
        scanner.close();
    }

    public double getSum(){
        sum = 0;
        map.forEach((key, value) -> sum += value); //calculate the total # of characters
        return sum;
    }

    public double getFreq(Character key, double sum) {
        double calc = 0.0;
        Integer val = map.get(key); //get the value from the current key
        calc = (val/sum)*100; //divide #of current characters and divide by sum
        return calc;
    }
}

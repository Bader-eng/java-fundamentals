/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n){
        int[] rolls = new int[n];
        for(int i = 0; i < n; i++){
            rolls[i] =  (int)(Math.random() * (6 + 1));
        }
        return rolls;
    }

    public static boolean containsDuplicates(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j) return true;
            }
        }
        return false;
    }

    public static float Average (int[] array) {
        float total = 0;

        for (int i=0; i<array.length; i++){
            total = total + array[i];

        }

        return total/array.length;

    }
    
    public static float TwoArrays (int[][] array) {

        float[] averageArray = new float[array.length];
        for (int i=0; i<array.length; i++){
            averageArray[i] = Average(array[i]);
        }

        float low =averageArray[0];
        for (int i=0; i<averageArray.length; i++ ){
            if(averageArray[i]<low){
                low=averageArray[i];
            }
        }
        return low;


    }
    public static String analyzeWeather(int[][] array) {
        int lowTemp = array[0][0];
        int highTemp = array[0][0];
        int arrayLength = 0;
        Set<Integer> set = new HashSet<>();
        String output = "";


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i][j] < lowTemp ) {
                    lowTemp = array[i][j];
                }

                if (array[i][j] > highTemp ) {
                    highTemp = array[i][j];
                }

                set.add(array[i][j]);
            }
        }

        output += String.format("High: %s\n", highTemp);
        output += String.format("Low: %s\n", lowTemp);

        for (int i = lowTemp; i <= highTemp; i++) {
            if(!set.contains(i)) {
                arrayLength++;
            }
        }

        for (int i = lowTemp; i <= highTemp; i++) {
            if(set.contains(i)) {
                output += String.format("Never saw temperature: %s\n", i);
            }
        }

        return output;
    }

    public static String tally(List<String> votes) {
        Map<String, Integer> count = new HashMap<>();
        int counter = 0;
        String highestVote = "";

        for (String name: votes) {
            if(count.containsKey(name)) {
                count.put(name, count.get(name) + 1);
            } else {
                count.put(name, 1);
                
            }
        }

        for (String name: count.keySet()) {
            if (count.get(name) > counter) {
                counter = count.get(name);
                highestVote = name;
            }
        }

        return highestVote;
    }
}

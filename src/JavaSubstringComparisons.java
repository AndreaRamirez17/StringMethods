import java.util.Arrays;
import java.util.Scanner;
public class JavaSubstringComparisons {


        public static String getSmallestAndLargest(String s, int k) {
            int numSubstrings = s.length() - k + 1;
            String[] substrings = new String[numSubstrings];

            for (int i = 0; i < numSubstrings; i++) {
                substrings[i] = s.substring(i, i + k);
            }
//            Arrays.sort(substrings);

            bubbleSort(substrings);

            // 'smallest' es el primer elemento del array ordenado
            String smallest = substrings[0];
            // 'largest' es el ultimo elemento del array ordenado
            String largest = substrings[substrings.length - 1];

            return smallest + "\n" + largest;
        }

        public static void bubbleSort(String[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        // Intercambiar array[j] y array[j + 1]
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }

            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}

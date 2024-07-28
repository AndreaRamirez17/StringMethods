import java.util.Arrays;
import java.util.Scanner;
public class JavaAnagrams {
        static boolean isAnagram(String a, String b) {
            a.toLowerCase();
            b.toLowerCase();

            String[] arrayA = a.split("");
            String[] arrayB = b.split("");
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            int comparacion=Arrays.compare(arrayA,arrayB);
            if(comparacion==0){
                return true;
            }else{
            return false;}
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }


}

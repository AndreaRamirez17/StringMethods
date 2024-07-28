import java.util.Scanner;
public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String substr=S.substring(start,end);
        System.out.println(substr);
        //Otro metodo sin substring
        // for (int i=start;i<end;i++){
        //     System.out.print(S.charAt(i));
        // }
    }
}

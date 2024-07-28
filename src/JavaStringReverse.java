import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args ){
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    String emptyStr="";
        for (int i=0;i<A.length();i++){
        emptyStr=A.charAt(i)+emptyStr;
    }
        if (A.equals(emptyStr)){
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
}
    }

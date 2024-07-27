import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringMethods1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int tamanioA=A.length();
        int tamanioB=B.length();
        int tamanioTOTAL=tamanioA+tamanioB;
        System.out.println(tamanioTOTAL);
        int alfabeto=A.compareToIgnoreCase(B);
        if (alfabeto<0){
            System.out.println("No");
        }else if (alfabeto>0){
            System.out.println("Yes");
        }
        String palabraA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String palabraB= B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.print(palabraA+" "+palabraB);
    }
}
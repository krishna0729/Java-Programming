import java.util.Scanner;
public class MultiplicationTable {
public static void main(String[]args)
{
    Scanner Krishna=new Scanner(System.in);
    System.out.println("Enter the number-->");
    int N=Krishna.nextInt();
    for (int i=1 ; i<=10 ; i++){
        System.out.println(N + "*" + i + "=" + N*+i);
    }
}
}

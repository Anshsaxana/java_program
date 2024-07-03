import java.util.Scanner;

public class Reversed_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int i= scanner .nextInt();
        int r=0,s=0;
        while (i!=0) {
            r=i%10;
            s=s*10+r;
            i=i/10;
        }
        System.out.println(s);
    }
}

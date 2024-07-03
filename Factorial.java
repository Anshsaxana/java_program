import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your number");
        int num=scanner .nextInt();
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}

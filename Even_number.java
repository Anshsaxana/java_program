import java.util.Scanner;

public class Even_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          System.out.println ("Enter your number ") ;
        int num= sc.nextInt();
        for(int i=0;i<=num;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    
}

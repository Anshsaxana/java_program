import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=scanner .nextInt();
        for(int i=1;i<=10;i++){
            int m=(num*i);
            System.out.println(num+"*"+i+"="+m);
        }
    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("choose any option");
        System.out.println("1 = multiply");
        System.out.println("2 = subtract");
        System.out.println("3 = divide");
        System.out.println("4 = add");
        int choice = sc.nextInt();
        System.out.println("Enter your number");
        int num1=sc.nextInt();
        System.out.println("Enter your number");
        int num2 =sc.nextInt();
        switch (choice) {
            case 1:
                int num=num1*num2;
                System.out.println(num);
                break;
        
            case 2:
            int num3=num1-num2;
            System.out.println(num3);
                break;
            case 3:
            int num4=num1/num2;
            System.out.println(num4);
            break;
            case 4:
            int num5=num1+num2;
            System.out.println(num5);
            break;
        }
    }
}

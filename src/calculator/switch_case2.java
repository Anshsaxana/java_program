package src.calculator;
import java.util.Scanner;

public class switch_case2 {
    public static void clac(Scanner sc, int arr[]) {
        System.out.println("choose any option");
        System.out.println("1 = multiply");
        System.out.println("2 = subtract");
        //System.out.println("3 = divide");
        System.out.println("3 = add");
        int choice = sc.nextInt();
        System.out.println("Enter your number");
        switch (choice) {
            case 1:
            int num=1;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                num *=arr[i];
            }
                System.out.println(num);
                break;
        
            case 2:
            int num3=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                 num3 -=arr[i];
            }
            System.out.println(num3);
                break;
            // case 3:
            // int
            // int num4=num1/num2;
            // System.out.println(num4);
            // break;
            case 3:
            int num5=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                num5 +=arr[i];
            }
            System.out.println(num5);
            break;
        }
    }
}

        //System.out.println("Enter your number");
        //int num1=sc.nextInt();
        //System.out.println("Enter your number");
        //int num2 =sc.nextInt();
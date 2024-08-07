package src.calculator;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //System.out.println("Enter your number");
      //  for(int i=0;i<arr.length;i++){
        //    arr[i]=sc.nextInt();
        //}
        switch_case2 sw2 = new switch_case2();
        sw2.clac(sc,arr);
        // int sum=0;
        // int num=1;
        // for(int i=0;i<arr.length;i++){
        //     sum +=arr[i];
        //     num *=arr[i];
        // }
        // int av=(int)sum/arr.length;
        // System.out.println("Your Sum is " +sum);
        // System.out.println("Your multiply is" +num);
        // System.out.println("Your array average is" +av);
}
}

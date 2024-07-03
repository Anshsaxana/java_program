import java.util.Scanner;

public class Temp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two number");
    int a= sc.nextInt();
    int b= sc.nextInt();
    System.out.println(a+" "+b);
    int temp = a;
    a=b;
    b=temp;
    System.out.println(a+" "+b);
  }
}

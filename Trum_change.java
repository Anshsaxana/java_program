import java.util.Scanner;

public class Trum_change {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two number");
    int a= sc.nextInt();
    int b= sc.nextInt();
    System.out.println(a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a+" "+b);
  }
}
// a=10;
// b=20;
// a=a+b; a=30;
// b=a-b; b=10;
// a=a-b ; a=20;

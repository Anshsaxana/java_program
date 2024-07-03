import java.util.Scanner;
import java.util.Arrays;

public class Polindrom_string{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your world");
    String st = sc.nextLine();
    String result = "";
    for(int i=st.length()-1;i>=0;i--) {
      result = result +st.charAt(i);
    }
    if(result.equals(st)) {
      System.out.println("your Word is palindrom");
    } else {
      System.out.println("your Word is not palindrom");
    }
  }

}

import java.util.Scanner;
import java.util.Arrays;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
public class String_polindrom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your world");
    String st = sc.nextLine();
    int i=0,j= st.length()-1;
     String result = "String is palinrom";
    while(i<j) {
      if(st.charAt(i) != st.charAt(j)) {
         result ="Not polondrom";
      }
      i++;
      j--;
    }
     System.out.println(result);
    
  }
}
//whithout for loop

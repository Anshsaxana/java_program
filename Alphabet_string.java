import java.util.Scanner;
import java.util.Arrays;

public class Alphabet_string {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String st = sc.nextLine();
    String result = "";
    for(int i=0;i<st.length();i++){
      char ch = st.charAt(i);
      if(Character.isUpperCase(ch)) {
        result = result+ Character.toLowerCase(ch);
      } else if(Character.isLowerCase(ch)) {
        result = result + Character.toUpperCase(ch);
      } 
      // this line
      else {
        result = result + ch;
      }
    }
    System.out.println(result);
}
}
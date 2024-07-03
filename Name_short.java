import java.util.Scanner;
import java.util.Arrays;

public class Name_short {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String st = sc.nextLine();
    String result = Character.toUpperCase(st.charAt(0))+".";
    for(int i=0;i<=st.length();i++) {
      char c = st.charAt(i);
      if(c == ' ') {
        result = result+Character.toUpperCase(st.charAt(i+1));
          break;
      }
    }
    String str = "";
    for(int i=st.length()-1;i>=0;i--) {
      char c = st.charAt(i);
      if(c == ' '){
        result = result + c + Character.toUpperCase(st.charAt(i+1))+st.substring(i+2);
        break;
      }
      else {
        str = c+ str;
      }
    }
    System.out.println(result);
}
}
// A.K Saxena

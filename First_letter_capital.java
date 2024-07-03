import java.util.Scanner;
import java.util.Arrays;

public class First_letter_capital {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String st = sc.nextLine();
    st=" "+st;
    String result="";
    for(int i=0;i<st.length();i++){
      char c = st.charAt(i);
      if(c==' ') {
        result = result +" "+ Character.toUpperCase(st.charAt(i+1));
        i++;
      } else {
        result = result+c;
      }
    }
    System.out.println(result.substring(1));
    //System.out.println(result.substring(1,result.length()-1));
}
}
// ansh kumar 
// Ansh Kumar 
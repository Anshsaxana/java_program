import java.util.Scanner;

public class Change_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your alphabet");
        String st = sc.nextLine();
        String result = "";
        for(int i=0;i<st.length();i++){
          char ch = st.charAt(i);
          if(Character.isUpperCase(ch)) {
            result = result+ Character.toLowerCase(ch);
          }
        }
        System.out.println(result);
    }
}

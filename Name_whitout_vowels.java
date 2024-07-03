import java.util.Scanner;

public class Name_whitout_vowels {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String st = sc.nextLine();  
            String result = "";
            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    result += ch;
                }
            }
            System.out.println("Resulting string: " + result);
        }
}

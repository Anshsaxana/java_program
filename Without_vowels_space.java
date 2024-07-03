import java.util.Scanner;

public class Without_vowels_space {
            public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name");
            String st = sc.nextLine();  
            String result = "";
            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                if (ch!=' ' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    result += ch;
                }
            }
            System.out.println(result);
        }
}

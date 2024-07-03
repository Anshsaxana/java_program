import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your word");
        String st =sc.nextLine();
        int count=0;
        String re ="";
        // for (int i = 0; i < st.length(); i++) {
        //     char ch = st.charAt(i);
        //     re += Character.toLowerCase(ch);
        // }
        // System.out.println(re);
        boolean res = false;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
               count++;
            }
        }
        System.out.println(count);
        // if (res) {
        //     System.out.println("Word has included the vowels");
        // }else{
        //     System.out.println("word has not included the vowels");
        // }

    }
}

import java.util.Scanner;

public class Name_digit_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int count=0,
        num=0,ar,n=0,m=0,s=0;
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }else if(Character.isLowerCase(ch)){
                num++;
            }else if(Character.isDigit(ch)){
                n++;
            }else if(Character.isSpaceChar(ch)){
                m++;
            }
              else {
                s++;
                
            }
        }
        System.out.println("your capital letter=" +count);
        System.out.println("your small letter=" +num);
        System.out.println("your Digit=" +n);
        System.out.println("your special character=" +m);
        System.out.println("Your special characters = " +s);
    }
}

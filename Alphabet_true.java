import java.util.Scanner;

public class Alphabet_true {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a one Alphabet");
    char ch = sc.next().charAt(0);
    if(Character.isUpperCase(ch)){
    System.out.println("Your alphabet is big");
}else if(Character.isLowerCase(ch)){
    System.out.println("your alphabet is small");
}
    //System.out.println(Character.isDigit(ch));
}
}

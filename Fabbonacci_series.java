import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fabbonacci_series {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader brReader = new BufferedReader(inputReader);
        // Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int num= Integer.parseInt(brReader.readLine());
        int num1=0,num2=1;
        System.out.println(num1+" "+num2);
        for(int i=1;i<=num-2;i++){
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
}

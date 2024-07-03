import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[] = {1, 5, 3, 2, 4};
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

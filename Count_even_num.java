public class Count_even_num {
    public static void main(String[] args) {
        Count_even_num m=new Count_even_num();
         m.count(1);
         //System.out.println(b);
    }
    public void count(int i){
        for( i=0;i<=100;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}

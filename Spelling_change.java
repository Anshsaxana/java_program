public class Spelling_change {
    public static void main(String[] args) {
        Spelling_change m= new Spelling_change();
        String st="ansh";
        char r='n';
        char ch='r';
        m.replce(st,r,ch);
        
    } 
    public String replce(String st ,char r,char ch){
        String res="";
        for(int i=0;i<st.length();i++){
            char chr=st.charAt(i);
            if (chr==r) {
                res=res+ch;
            }else{
                res=res+chr;
            }
        }
        System.out.println(res);
        return res;
    }
}

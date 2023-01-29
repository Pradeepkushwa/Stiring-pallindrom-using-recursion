public class Stringpallindrom {
    static String pallindrom(String s,int idx){
        if(idx==s.length()) return "";
        String smallAns=pallindrom(s, idx+1);
        return smallAns+s.charAt(idx);
     }
    public static void main(String[] args) {
        String s="madamaa";
        String rev=pallindrom(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is a pallindrom", s);
        }
        else
        System.out.printf("%s is not a pallindrom", s);
    }
    
}

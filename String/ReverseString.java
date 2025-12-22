package String;

public class ReverseString {
    public static void main(String[] args) {
        String a="I am a SQA Engineer";
        String reversered=reverse(a);
        System.out.println(reversered);

    }
    public static String reverse(String c){

        String g=" ";
        char ch[]=c.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            g=g+ch[i];
        }
return g;

    }

}

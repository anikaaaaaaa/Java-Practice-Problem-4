package String;

public class Palindrome {
    public static void main(String[] args) {
        String a="abcba";
        StringBuilder sb=new StringBuilder(a);
        String reversed_word=String.valueOf(sb.reverse());
        if(reversed_word.equals(a)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }

    }
}

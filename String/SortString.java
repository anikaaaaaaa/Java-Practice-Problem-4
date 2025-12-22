package String;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String w = "hello";
        char ch[]=w.toCharArray();
        Arrays.sort(ch);
        Arrays.toString(ch);
        System.out.println(ch);
    }
}

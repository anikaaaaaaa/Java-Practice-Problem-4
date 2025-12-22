package String;

import java.util.Arrays;

public class Anargam {
    public static void main(String[] args) {
        String s1="care";
        String s2="race";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        String fs1=sb1.append(ch1).toString();
        String fs2=sb2.append(ch2).toString();
        if(fs1.equals(fs2)){
            System.out.println("Anargram");
        }
        else{
            System.out.println("Not Anargram");
        }
        //Option:2
        String g1=Arrays.toString(ch1);
        String g2=Arrays.toString(ch2);
        if(g1.equals(g2)){
            System.out.println("Anargram");
        }
        else{
            System.out.println("Not anargram");
        }
    }
}


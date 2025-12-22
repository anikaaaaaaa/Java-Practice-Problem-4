package String;

import java.util.Arrays;

public class MyBasicString {
    public static void main(String[] args) {
        String str="I am a SQA Engineer";
        char charArray[]=str.toCharArray();
        System.out.println(charArray);
        System.out.println(charArray[2]);
        System.out.println(charArray.length);
        System.out.println(str.length());
        String s1="abnk";
        char character=s1.charAt(0);
        System.out.println("The character at index 0 is:"+ character);
        int index=str.indexOf('a');
        System.out.println("The index of character a is:"+ index);
        int str_index=str.indexOf("a");
        System.out.println("The index of string a is: "+str_index);
        int anotherstr_index=str.indexOf("a S");
        System.out.println("The index of other a except the first one is:"+ anotherstr_index);
        System.out.println("Check if the string contains SQA or not : "+ str.contains("SQA"));
        System.out.println("Check if the string is equal to the given string or not: "+ str.equals("I am a SQA Engineer"));
        str=str.replace("SQA","Jr.SQA");
        System.out.println(str);
        String array[]=str.split(" ");
        System.out.println(Arrays.toString(array));
        for(String s:array){
            System.out.println(s.toString());

        }
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String money="Tk.10.50";
        String m1[]=money.split("\\.");
            System.out.println(m1[0]);
            System.out.println(m1[1]);
            System.out.println(m1[2]);
        int begin=str.indexOf("S");
        int end=begin+3;
        System.out.println(str.substring(begin,end));
        String new_str="I am Sr.SQA Engineer";
        int new_begin=new_str.indexOf("SQ");
        int new_end=new_begin+3;
        System.out.println(new_str.substring(new_begin,new_end));
        String a=" sqa ";
        System.out.println(a.trim());
        StringBuilder sb= new StringBuilder();
        String formed=String.valueOf(sb.append(charArray));
        System.out.println(formed);


        }
    }


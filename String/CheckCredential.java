package String;

import java.util.Scanner;

public class CheckCredential {
    public static void main(String[] args) {
        String user_name="Anika";
        String pass_word="1234";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a username:");
        String username=sc.next();
        System.out.println("Enter a password: ");
        String password=sc.next();
        if(username.equals(user_name)&&(password.equals(pass_word))){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Try again");
        }
        sc.close();
    }
}

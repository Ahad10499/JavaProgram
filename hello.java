import java.util.*;
class Hello
{
     public static void main(String[] args) {
         Scanner str = new Scanner(System.in);
        System.out.println("enter user name");
        String username = str.nextLine();
        if (username.length() < 3 ){
            System.out.println("please enter minimum 3 character");
        }
        else{
            System.out.println("user name is" + " " + username);
        }
    }
   
     
}
import java.util.Scanner;

public class projectfoodapp {
    public static void main(String[] args) {
        System.out.println("hello welcome to the food app");
        System.out.println("please create your password");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("your password is now" + pass1);
        System.out.println("please enter your password");
        String pass = scan.next();
        while (!pass.equals(pass1)) {
            System.out.println("this is not the right password please try again");
            pass = scan.next();
        }
        System.out.println("access granted");
        System.out.println("are you hungry ? yes or no");
        String ans1 = scan.next();

        if (ans1.equals("yes")) {
            System.out.println("please choose what you want to eat fish,burger,pizza or ice cream");
            String ans2 = scan.next();
            while (!ans2.equals("fish") && !ans2.equals("burger") && !ans2.equals("pizza") && !ans2.equals("ice cream")) {
                System.out.println("sorry we don't have what you want please choose between pizza fish burger or icecream");
                ans2 = scan.next();
            }
            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish") || ans2.equals("ice cream")) {
                System.out.println("do you want something to drink? yes or no");
                String ans3 = scan.next();
                while (!ans3.equals("yes") && !ans3.equals("no")) {
                    System.out.println("wrong command please try again");
                    ans3 = scan.next();
                }
                if (ans3.equals("yes")) {
                    System.out.println("great what would you like to drink coke or juice");
                    String ans4 = scan.next();
                    while (!ans4.equals("coke") && !ans4.equals("juice")) {
                        System.out.println("sorry we don't have what you want please choose between coke and juice");
                        ans4 = scan.next();
                    }
                    if (ans4.equals("coke") || ans4.equals("juice")) {
                        System.out.println("great you ordered" + ans2 +  "and"  + ans4);
                    }
                    System.out.println("please confirm your password");
                    pass = scan.next();
                    while (!pass.equals(pass1)) {
                        System.out.println("this is not the right password please try again");
                        pass = scan.next();
                    }
                }
            } else System.out.println("alright have a good day");

        }
    }
}

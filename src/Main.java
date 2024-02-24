

import java.util.Scanner;
import java.util.Scanner;

import Enums.UserLevel;
import UserData.*;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        UserData userData = new UserData();
        System.out.println("Create new Profile?");
        if (in.nextLine().equals("yes")) {
            System.out.println("Username: ");
            String username = in.nextLine();
            System.out.println("Password: ");
            String pass = in.nextLine();
            System.out.println("What is your starting fitness level? (beginner, intermediate, pro) : ");
            String lev = in.nextLine();
            if (lev.equals("beginner")) {
                User user = new User(username, pass, UserLevel.Beginner);
                userData.addUser(user);
                System.out.println(userData.getUserData(user));
            } else if (lev.equals("intermediate")) {
                User user = new User(username, pass, UserLevel.Intermediate);
                userData.addUser(user);
                System.out.println(userData.getUserData(user));
            } else if (lev.equals("pro")) {
                User user = new User(username, pass, UserLevel.Pro);
                userData.addUser(user);
                System.out.println(userData.getUserData(user));
            }
        }

    }
}
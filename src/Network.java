import java.util.Scanner;

public class Network {

    static Scanner myScanner = new Scanner(System.in);

    // create a object users so that we can add a set of exiting users to the hashed dictionary
    // this will be used to simulate activity on the social media platform

    private static final NetworkUsers users = new NetworkUsers();
    public static void main(String[] args) {

        // created simulated user accounts
        users.joinNetwork(new Profile("Kendal", 23));
        



        
    }
}



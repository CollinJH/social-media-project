import java.util.Scanner;

public class Network {

    static Scanner myScanner = new Scanner(System.in);

    // create a object users so that we can add a set of exiting users to the hashed dictionary
    // this will be used to simulate activity on the social media platform

    private static final SocialNetwork network = new SocialNetwork();
    public static void main(String[] args) {

        // create simulated user accounts
        try {
        network.createProfile("Sammy", 23);
        network.createProfile("Steven", 34);
        network.createProfile("Jasmine", 22);
        network.createProfile("Billy", 29);
        network.createProfile("Adam", 31);
        network.createProfile("Jackie", 24);
        
        Profile user1 = network.searchProfile("Steven");
        Profile user2 = network.searchProfile("Jasmine");
        Profile user3 = network.searchProfile("Sammy");

        user1.addFriend(user2);
        user2.addFriend(user3);
        user3.addFriend(user2);

        user1.setOnline();
        user2.setBusy();
        user3.setOffline();


        } catch (SocialNetwork.NoSuchUserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // pass network as a parameter
        Menu menu = new Menu(network);
        menu.DisplayMenu();





        
    }
}



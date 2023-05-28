import java.util.Scanner;

public class Menu {

    static Scanner myScanner = new Scanner(System.in);

    private SocialNetwork existingUsers;
    private Profile currentUser;

    // network of profiles pass into constructor
    // instansiating existing users with profiles

    public Menu(SocialNetwork existingUsers) {
        this.existingUsers = existingUsers;

    }

    // this will be the menu the user will land on to pick a profile
    // to create a new profile
    // or to delete any existing profiles
    public void DisplayMenu() {
        System.out.println("Welcome to the Social Network!");
        System.out.println("1. Create Profile");
        System.out.println("2. Search Profile");
        System.out.println("3. Remove Profile");
        System.out.println("4. Pick Profile");
        System.out.println("5. Exit");

        int choice = myScanner.nextInt();
        myScanner.nextLine();

        switch (choice) {
            case 1:
                createNewProfile();
                break;
            case 2:
                searchProfile();
                break;
            case 3:
                removeProfile();
                break;
            case 4:
                pickProfile();
                break;
            case 5:
                System.out.println("Exiting... Goodbye");
                return;
            default:
                System.out.println("Invalid choice, try again");
        }
        
        // recursion to call the menu until a correct option is chosen.
        DisplayMenu();
    }

    
    public void searchProfile() {
        System.out.println("Displaying all profiles, ");
        System.out.println(existingUsers.getAllProfiles());

        DisplayMenu();
    }

    public void removeProfile() {

        String removeName;
        System.out.println(existingUsers.getAllProfiles());

        System.out.println("Please enter a profile name to remove");
        removeName = myScanner.nextLine();

        try {
            existingUsers.leaveNetwork(removeName);
        } catch (SocialNetwork.NoSuchUserException e) {
            e.printStackTrace();
        }

        DisplayMenu();

    }


    // pick profile will turn you from system menu to user menu
    // user menu will be used to make actions at a user level
    // such as add friends, remove friends, setting status etc
    public void pickProfile() {

    }


    // reads input for user to create their profile
    public void createNewProfile() {

        String firstName;
        int age;

        System.out.printf("Please enter your first name: ");
        firstName = myScanner.nextLine();
        System.out.printf("Please enter your age: ");
        age = myScanner.nextInt();
        myScanner.nextLine();

        existingUsers.createProfile(firstName, age);

        DisplayMenu();
    }

    /* public void manageFriendsList() {


        // view friends information
        for (int i = 1; i < friends.getLength() + 1; i++) {
            System.out.println(friends.getEntry(i).getName());
        }
    }

    */
    
}

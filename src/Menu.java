import java.util.Scanner;

public class Menu {

    static Scanner myScanner = new Scanner(System.in);

    private NetworkUsers existingUsers;
    private Profile currentUser;

    public Menu(NetworkUsers existingUsers) {
        this.existingUsers = existingUsers;
    }



    // reads input for user to create their profile
    public Profile createNewProfile() {

        String firstName;
        int age;

        System.out.printf("Please enter your first name: ");
        firstName = myScanner.nextLine();
        System.out.printf("Please enter your age:");
        age = myScanner.nextInt();
        myScanner.nextLine();



        return new Profile(firstName, age);
    }

    public void manageFriendsList() {


        // view friends information
        for (int i = 1; i < friends.getLength() + 1; i++) {
            System.out.println(friends.getEntry(i).getName());
        }
    }
    
}

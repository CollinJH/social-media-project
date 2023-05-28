

public class NetworkUsers {
    
    
    private HashedDictionary<String, Profile> profiles;

    public NetworkUsers() {
        profiles = new HashedDictionary<>();
    }

    public void joinNetwork(Profile profile) throws UserAlreadyExistsException {
        if (profiles.contains(profile.getName().toLowerCase())) {
            throw new UserAlreadyExistsException();
        }

        profiles.add(profile.getName().toLowerCase(), profile);
    }

    public void leaveNetwork(Profile profile) throws NoSuchUserException {
        if (profiles.getValue(profile.getName().toLowerCase()) == null) {
            throw new NoSuchUserException();
        } else {
            profiles.remove(profile.getName().toLowerCase());
        }
    }

    // this will essentially change the name of the profile and the key
    // this allows for an edit in the username to make sure the key is also changed
    // so it still corresponds to the expected profile

    public void modifyProfile(Profile profile, String newName) throws UserAlreadyExistsException {
        if (profile.getName().toLowerCase() != null) {
            newName = newName.toLowerCase();
            profile.setName(newName);
        }


    }

    public Profile searchProfile(String userName) throws NoSuchUserException {
        userName = userName.toLowerCase();
        if (profiles.getValue(userName) == null) {
            throw new NoSuchUserException();
        }
        return profiles.getValue(userName);
    }

    // creating a subclass of class exception
    // two constructors
    // first one is default, gives error message
    // second one can be a given String message
    public class UserAlreadyExistsException extends Exception {
        public UserAlreadyExistsException() {
            super("User already exists..");
        }

        public UserAlreadyExistsException(String message) {
            super(message);
        }

    }

    // subclass of class exception
    // same thing as above except for the case where there is no user with the key
    public class NoSuchUserException extends Exception {
        public NoSuchUserException() {
            super("User does not exist..");
        }

        public NoSuchUserException(String message) {
            super(message);
        }
    }
}
    

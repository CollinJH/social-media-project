public class NetworkUsers {
    
    
    private HashedDictionary<String, Profile> profiles;

    public NetworkUsers() {
        profiles = new HashedDictionary<>();
    }

    public void joinNetwork(Profile profile) {
        if (profiles.contains(profile.getName().toLowerCase())) {
            
        }
        profiles.add(profile.getName().toLowerCase(), profile);
    }

    public void leaveNetwork(Profile profile) {
        profiles.remove(profile.getName());
    }

    // this will essentially change the name of the profile and the key
    // this allows for an edit in the username to make sure the key is also changed
    // so it still corresponds to the expected profile

    public void modifyProfile(Profile profile, String newName) {
        if (profile.getName() != null) {
            profile.setName(newName);
        }
    }

    public Profile searchProfile(String userName) {
        return profiles.getValue(userName);

    }

    // creating a subclas of class exception
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
}
    

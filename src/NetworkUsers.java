public class NetworkUsers {
    
    
    private HashedDictionary<String, Profile> profiles;

    public NetworkUsers() {
        profiles = new HashedDictionary<>();
    }

    public void joinNetwork(Profile profile) {
        profiles.add(profile.getName().toLowerCase(), profile);
    }

    public void leaveNetwork(Profile profile) {
        profiles.remove(profile.getName());
    }

    public void modifyProfile(Profile profile, String newName) {
        if (profile.getName() != null) {
            profile.setName(newName);
        }

    }
}

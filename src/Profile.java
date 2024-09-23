class User {
    private String username;
    private Profile profile;

    public User(String username, Profile profile) {
        this.username = username;
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public Profile getProfile() {
        return profile;
    }

    public String getUserSummary() {
        return "Username: " + getUsername() + ", " + getProfile().getProfileSummary();
    }
}

class Profile {
    private String email;
    private String address;

    public Profile(String email, String address) {
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getProfileSummary() {
        return "Email: " + getEmail() + ", Address: " + getAddress();
    }
}

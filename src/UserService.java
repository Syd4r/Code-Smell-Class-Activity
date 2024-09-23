abstract class EmailService {
    public boolean isEmailAddressValid(String email) {
        // Simple email validation
        return email != null && email.contains("@");
    }
    public String sanitizeEmail(String email) {
        return email.trim().toLowerCase();
    }
}

class UserService extends EmailService {
    public void registerUser(String email) {
        if (isEmailAddressValid(email)) {
            String cleanedEmail = sanitizeEmail(email);
            // Register the user with the cleaned email
            System.out.println("User registered with email: " + cleanedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }
}

class AdminService extends EmailService {
    public void addAdmin(String email) {
        if (isEmailAddressValid(email)) {
            String normalizedEmail = sanitizeEmail(email);
            // Add the admin with the normalized email
            System.out.println("Admin added with email: " + normalizedEmail);
        } else {
            System.out.println("Invalid email address.");
        }
    }
}

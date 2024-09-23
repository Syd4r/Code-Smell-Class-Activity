import java.util.List;

public class ReportGenerator {
    // Generates a detailed report
    public void generateReport(List<User> users) {
        StringBuilder report = new StringBuilder();
        report.append("User Report\n");
        report.append("------------\n");

        for (User user : users) {
            String username = user.getUsername();
            String email = user.getEmail();
            String address = user.getAddress();

            String processedData = processUserData(username, email, address);

            String formattedData = formatReportData(username, email, address);

            List<String> data = List.of(processedData, formattedData);

            appendReportData(report, data);
        }

        saveReportToFile(report.toString());
    }

    // Processes user data
    private String processUserData(String username, String email, String address) {
        return "Processed: " + username + ", " + email + ", " + address;
    }

    // Formats report data
    private String formatReportData(String username, String email, String address) {
        return "User: " + username + ", Email: " + email + ", Address: " + address;
    }

    // Saves the report to a file
    private void saveReportToFile(String reportContent) {
        System.out.println("Report saved to file:\n" + reportContent);
    }

    // Appends data to the report
    private void appendReportData(StringBuilder report, List<String> data) {
        for (String item : data) {
            report.append(item).append("\n");
        }
    }
}

class User {
    private String username;
    private String email;
    private String address;

    public User(String username, String email, String address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

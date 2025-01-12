public class Authentication {
    public static boolean login(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }

    public static void logout() {
        System.out.println("Logged out successfully!");
    }
}
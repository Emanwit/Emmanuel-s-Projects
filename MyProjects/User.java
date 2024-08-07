/**
 * @author Emmanuel Nwite
 * @version 10th May 2024
 * This program will establish the user super class for my fitness tracker application.
 */


public abstract class User {
    //attributes
    protected String username;
    //i did not create a regular expression for pssword because I want it to contain only letters.
    protected String password;
    protected String email;
    protected int age;
    protected double weight;
    protected double height;

    //Constructor
    public User(String username, String password, String email, int age, double weight, double height) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        this.age = age;

        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }
        this.weight = weight;

        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;

        
        this.email = email;

        this.username = username;
        this.password = password;
    }

    // REGEX method to validate email format
    private static boolean validateEmail(String email) {
        // email pattern 
        return email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;
    }
    //Custom method
    // Abstract method to log activity: This keeps track of the users activity and will also be used in future classes to demostrate polymorphism
    public abstract void logActivity(String activity, double duration, double distance);

    // Final method to calculate BMI
    public final double calculateBMI() {
        return weight / (height * height);
    }

    // toString method
    @Override
    public String toString() {
        return String.format("User: %nUsername: %s%nEmail: %s%nAge: %d%nWeight: %.2f%nHeight: %.2f%nBMI: %.2f", 
                              username, email, age, weight, height, calculateBMI());
    }
}

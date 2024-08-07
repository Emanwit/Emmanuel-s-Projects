/**
 * @author Emmanuel Nwite
 * @version 10th May 2024
 * This subclass represents information about the coach.
 */


public class Coach extends User {
    // attributes
    private String specialization;
    //number of years of coach's experience
    private int experienceYears;
    //number of athletes this coach has worked on
    private int numberOfAthletes;
    //success rate of this coach.
    private double successRate;

    // Constructor with all parameters
    public Coach(String username, String password, String email, int age, double weight, double height, String specialization, int experienceYears, int numberOfAthletes, double successRate) {
        super(username, password, email, age, weight, height);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.numberOfAthletes = numberOfAthletes;
        //condition to mmake sure success rate is in the correct range.
        if (successRate < 0 || successRate > 100) {
            throw new IllegalArgumentException("Success rate must be between 0 and 100.");
        }
        this.successRate = successRate;
    }

    // No-parameter constructor
    public Coach() {
        this("N/A", "N/A", "N/A", 30, 70.0, 1.75, "N/A", 5, 10, 50.0);
    }

    // Getters and Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) {
            throw new IllegalArgumentException("Experience years must be non-negative.");
        }
        this.experienceYears = experienceYears;
    }

    public int getNumberOfAthletes() {
        return numberOfAthletes;
    }

    public void setNumberOfAthletes(int numberOfAthletes) {
        if (numberOfAthletes < 0) {
            throw new IllegalArgumentException("Number of athletes must be non-negative.");
        }
        this.numberOfAthletes = numberOfAthletes;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        if (successRate < 0 || successRate > 100) {
            throw new IllegalArgumentException("Success rate must be between 0 and 100.");
        }
        this.successRate = successRate;
    }

    // Log activity method
    @Override
    public void logActivity(String activity, double duration, double distance) {
        System.out.printf("Coach %s provided feedback on activity: %s%n Duration: %.2f%n distance: %.2f%n", 
                          getUsername(), activity, duration, distance);
    }

    // Custom method to calculate how successful this coach has been(In percentage).
    public double calculateSuccessRatio() {
        if (numberOfAthletes == 0) {
            throw new IllegalArgumentException("Number of athletes must be greater than zero to calculate success ratio.");
        }
        return successRate / 100.0 * numberOfAthletes;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%s%nCoach Details:%nSpecialization: %s%nExperience Years: %d%nNumber of Athletes: %d%nSuccess Rate: %.2f%%", 
                              super.toString(), specialization, experienceYears, numberOfAthletes, successRate);
    }
}

